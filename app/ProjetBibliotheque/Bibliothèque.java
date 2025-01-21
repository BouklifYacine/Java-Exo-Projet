package app.ProjetBibliotheque;

import java.util.ArrayList;

public class Bibliothèque {
    private ArrayList<Livre> TotalLivres;

    public Bibliothèque() {
        this.TotalLivres = new ArrayList<>();
    }

    public void AjouterLivre(Livre livre) {
        if (TotalLivres.size() < 3) { 
            TotalLivres.add(livre);
            System.out.println("Voici le nouveau livre : " + livre.getTitre());
        } else {
            System.out.println("Vous ne pouvez pas ajouter plus de 3 livres !");
        }
    }

    public void RetirerLivre(Livre livre) {
        if (TotalLivres.remove(livre)) { 
            System.out.println("Le livre retiré est : " + livre.getTitre());
        } else {
            System.out.println("Le livre n'a pas été trouvé dans la bibliothèque.");
        }
    }

    public void AfficherLivres() {
        if (TotalLivres.isEmpty()) {
            System.out.println("Votre bibliothèque est VIDE !!!");
        } else {
            System.out.println("Livres dans la bibliothèque : ");
            for (Livre nouveaulivre : TotalLivres) {
                nouveaulivre.AfficherInfos();
            }
        }
    }

    public void NombreLivre() {
        int nombre = TotalLivres.size();
        if (nombre == 0) {
            System.out.println("Je vois que vous avez " + nombre + " livre(s).");
            System.out.println("Rajoutez un livre !!!");
        } else if (nombre <= 3) {
            System.out.println("Vous avez " + nombre + " livre(s).");
        } else {
            System.out.println("Vous ne pouvez pas stocker plus de 3 livres !");
        }
    }
}