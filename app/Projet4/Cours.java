package app.Projet4;

import java.util.ArrayList;

public class Cours {
    private String nomcours; 
    private Professeur professeur;
    private ArrayList<Etudiant> listeetudiant;

    public Cours(String nomcours, Professeur professeur){
        this.nomcours = nomcours;
        this.professeur = professeur;
        this.listeetudiant = new ArrayList<>();
    }

    public void StockerEtudiant(Etudiant etudiant) {
      if(listeetudiant.contains(etudiant)){
        System.out.println("L'étudiant : " + etudiant.getNom() + " est déja dans la liste.");
      }
      else {
        listeetudiant.add(etudiant);
        System.out.println("l'étudiant : " + etudiant.getNom() + " a été ajouté au cours.");
      }
    }

    public void AfficherEtudiants(){
        System.out.println("Les étudians inscrit au cours de " + this.nomcours + " sont : ");
        for (Etudiant etudiants : listeetudiant){
            System.out.println(etudiants.getNom());
        }
    }

    public String getNomcours(){
        return nomcours;
    }

    public Professeur getProfesseur(){
        return professeur;
    }
}
