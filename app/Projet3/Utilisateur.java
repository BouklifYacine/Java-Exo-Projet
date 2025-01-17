package app.Projet3;

import java.util.ArrayList;

public class Utilisateur {

    private String nom; 
    private ArrayList<Seance> listebillets;

    public Utilisateur(String nom){
        this.nom = nom; 
        this.listebillets = new ArrayList<>();
    }

    public void reserverBillet(Seance seance, int nombreDePlaces) {
        seance.reserver(nombreDePlaces);
        listebillets.add(seance);
    }

    public void afficherBillets() {
        System.out.println("Billets réservés par " + nom + ":");
        for (Seance seance : listebillets) {
            System.out.println("- " + seance.getFilm().getTitre() + " à " + seance.getHeure() + " heures");
        }
    }

}