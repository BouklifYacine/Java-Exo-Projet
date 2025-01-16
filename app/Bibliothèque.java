package app;

import java.util.ArrayList;

public class Bibliothèque {
    private ArrayList<Livre> TotalLivres;

    public Bibliothèque() {
        this.TotalLivres = new ArrayList<>();
    }

    public void AjouterLivre(Livre livre) {
        TotalLivres.add(livre);
        System.out.println(" Voici le nouveau livre : " + livre.getTitre());

    }

 public void RetirerLivre(Livre livre){
    TotalLivres.remove(livre)
    System.out.println("Le livre retiré est : " + livre.getTitre());
 }

    public void AfficherLivres() {
        if (TotalLivres.isEmpty()) {
            System.out.println(" Votre bibliothèque est VIDE !!! ");
        } else {
            System.out.println("Le livre ajouté est : ");
            for (Livre nouveaulivre : TotalLivres) {
                nouveaulivre.AfficherInfos();
            }
        }
    }

   

 public void NombreLivre(){
    
    int nombre = TotalLivres.size();
    if (TotalLivres.isEmpty()){
        System.out.println("Je vois que vous avez " + TotalLivres.size() +  " Livres ");
        System.out.println("Rajouter un livre !!! ");
    }
    else if(!TotalLivres.isEmpty()){
        System.out.println("Vous avez " + TotalLivres.size() + " livres");
    }
   else if (nombre > 3){
System.out.println(" Vous pouvez stockez au maximum 33 livres");
   }
 }
}
