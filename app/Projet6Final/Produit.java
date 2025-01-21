package app.Projet6Final;

public class Produit {
    private String nom;
    private double prix;
    private int quantiteEnStock;

    public Produit(String nom, double prix, int quantiteEnStock) {
        if (prix < 0) {
            throw new IllegalArgumentException("Le prix ne peut pas être négatif.");
        }
        if (quantiteEnStock < 0) {
            throw new IllegalArgumentException("La quantité en stock ne peut pas être négative.");
        }
        this.nom = nom;
        this.prix = prix;
        this.quantiteEnStock = quantiteEnStock;
    }

    public String getNom() {
        return this.nom;
    }

    public double getPrix() {
        return this.prix;
    }

    public int getQuantiteEnStock() {
        return this.quantiteEnStock;
    }

    public void setQuantiteEnStock(int quantiteEnStock) {
        if (quantiteEnStock < 0) {
            throw new IllegalArgumentException("La quantité en stock ne peut pas être négative.");
        }
        this.quantiteEnStock = quantiteEnStock;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                ", quantiteEnStock=" + quantiteEnStock +
                '}';
    }
}