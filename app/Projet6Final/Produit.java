package app.Projet6Final;

public class Produit {

    private String nom;
    private double prix;
    private int quantiteproduit;

    Produit(String nom, double prix, int quantiteproduit) {
        this.nom = nom;
        this.prix = prix;
        this.quantiteproduit = quantiteproduit;
    }

   public String getNom() {
        return this.nom;
    }

   public double getPrix() {
        return this.prix;
    }

    public int getQuantiteproduit() {
        return this.quantiteproduit;
    }

}
