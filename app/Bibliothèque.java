package app;

import java.util.ArrayList;

public class Bibliothèque {
    private ArrayList<Livre> TotalLivre; 

    public Bibliothèque(){
        this.TotalLivre = new ArrayList<>();
    }

    public void AjouterLivre(Livre livre){
        TotalLivre.add(livre);
        System.out.println("Le livre ajouter a la bibliothèque est :" + livre.getTitre());
    }

    public void AfficherLivres(){
        if (TotalLivre.isEmpty()){
            System.out.println("La bibliothèque est vide");
        }
        else {
            System.out.println("Livres dans la bibliothèque : ");
            for(Livre nouveaulivre : TotalLivre){
                nouveaulivre.AfficherInfos();
            }
        }
    }
}
