package app.ProjetCompteBancaire;

import java.util.ArrayList;

public class Banque {

    private ArrayList<CompteBancaire> Totalcomptes;

    public Banque() {
        this.Totalcomptes = new ArrayList<>();
    }

    public void AjouterCompteBancaire(CompteBancaire compte) {

        Totalcomptes.add(compte);
        System.out.println("Vous venez d'ajouter le compte de : " + compte.getNomTitulaireCompte());
    }

    public void AfficherToutLesComptes() {
        if (Totalcomptes.isEmpty()) {
            System.out.println("Vous n'avez pas de comptes dans cette banque");
        } else {
            System.out.println("Voici tout les comptes : ");
            for (CompteBancaire chaquecompte : Totalcomptes) {
                System.out.println("Le compte s'appelle : " + chaquecompte.getNomTitulaireCompte());
            }
        }
    }

    public void RetirerCompteBancaire(CompteBancaire compte){
        Totalcomptes.remove(compte); 
        System.out.println("Le compte retiré est : " + compte.getNomTitulaireCompte());
    }
}
