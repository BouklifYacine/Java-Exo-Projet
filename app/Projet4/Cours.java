package app.Projet4;

import java.util.ArrayList;

public class Cours {
   private String nom; 
   private Professeur professeur; 
   private ArrayList<Etudiant> etudiantinscris;

   public Cours(String nom, Professeur professeur){
       this.nom = nom; 
       this.professeur = professeur;
       this.etudiantinscris = new ArrayList<>();

          // Ajouter ce cours à la liste des cours enseignés par le professeur
          professeur.ListeCours.add(this); // "this" représente l'objet Cours en cours de création
   }

   public void inscrireEtudiant (Etudiant etudiant){
       if(!etudiantinscris.contains(etudiant)){
           etudiantinscris.add(etudiant);
           System.out.println(etudiant.getNom() + " viens de s'inscrire au cours de monsieur : " + getProfesseur().getNom());
       }
       else {
           System.out.println(" L'étudiant : " + etudiant.getNom() + " est déjà inscrit à ce cours ");
       }
   }

   public void AfficherEtudiantInscrit(){
       System.out.println(" Les étudiants inscrits sont : ");
       for(Etudiant etudiant : etudiantinscris){
           System.out.println(etudiant.getNom());
       }
   }

   public String getNom(){
       return nom; 
   }

   public Professeur getProfesseur(){
       return professeur;
   }
}