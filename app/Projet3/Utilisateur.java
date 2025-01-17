package app.Projet3;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {

    private String nom;
    private List<Seance> billetsReserves; 

    public Utilisateur(String nom) {
        this.nom = nom;
        this.billetsReserves = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }
  
    public void reserverBillet(Seance seance, int nombreDePlaces) {
        seance.reserver(nombreDePlaces);
        billetsReserves.add(seance);
    }

    public void afficherBillets() {
        System.out.println("Billets réservés par " + nom + ":");
        for (Seance seance : billetsReserves) {
            System.out.println("- " + seance.getFilm().getTitre() + " à " + seance.getHeure());
        }
    }
}