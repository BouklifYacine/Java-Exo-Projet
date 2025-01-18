package app.Projet4;

import java.util.ArrayList;

public class Professeur extends Personne {
    private String specialite;
    private ArrayList<Cours> Listecours;

    public Professeur(String nom, int id, int age, String specialite) {
        super(nom, id, age);
        this.specialite = specialite;
        this.Listecours = new ArrayList<>();
    }

    public void AfficherCoursEnseignes() {
        if (Listecours.isEmpty()) {
            System.out.println("Il n'y a aucun cours enseigné actuellement. ");
        } else {
            System.out.println("Les cours enseigner sont : ");
            for (Cours coursenseigne : Listecours) {
                System.out.println(" - " + coursenseigne.getNomcours());
            }
        }
    }

    public void AjouterCours(Cours cours) {
        if (!Listecours.contains(cours)) {
            Listecours.add(cours);
            System.out.println("Le cours ajouté est : " + cours.getNomcours());
        } else {
            System.out.println("Le cours : " + cours.getNomcours() + " est déja présent.");
        }

    }

    public String getSpecialite() {
        return specialite;
    }
}