package app.Projet4;

import java.util.ArrayList;

public class Professeur extends Personne {
    private String specialite;
    ArrayList<Cours> ListeCours;

    public Professeur(String nom, int age, int id, String specialite) {
        super(nom, id, age);
        this.specialite = specialite;
        this.ListeCours = new ArrayList<>();
    }

    public void AfficherCoursEnseignés() {
        System.out.println("Monsieur " + getNom() + " enseigne ces matières : ");
        for (Cours cours : ListeCours) {
            System.out.println(cours.getNom());
        }
    }

    public String getSpecialite() {
        return specialite;
    }
}
