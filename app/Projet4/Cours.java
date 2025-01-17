package app.Projet4;

import java.util.ArrayList;

public class Cours {
   private String nom; 
   private Professeur professeur; 
   private ArrayList<Etudiant> etudiantinscris;

   public Cours(String nom, Professeur professeur){

    this.nom = nom; 
    this.etudiantinscris = new ArrayList<>();
    this.professeur = professeur;

   }

   public void inscrireEtudiant (Etudiant etudiant){
    if(!etudiantinscris.contains(etudiant)){
        etudiantinscris.add(etudiant);
        System.out.println(etudiant + " viens de s'inscrire au cours de monsieur : " + getProfesseur());
    }
    else {
        System.out.println(" L'étudiant : " + etudiant + " est déja inscrit a ce cours ");
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
