package app.Projet6Final;

import java.util.ArrayList;

public class Commande {
    private double total;
    private ArrayList<Produit> listeProduits;
    private Client client;

    public Commande(Client client) {
        this.client = client;
        this.listeProduits = new ArrayList<>();
        this.total = 0;
    }

    public void ajouterProduit(Produit produit, int quantiteCommandee) {
        if (quantiteCommandee <= 0) {
            throw new IllegalArgumentException("La quantité commandée doit être positive.");
        }
        if (produit.getQuantiteEnStock() < quantiteCommandee) {
            throw new IllegalArgumentException("Stock insuffisant pour ce produit.");
        }
        listeProduits.add(produit);
        total += produit.getPrix() * quantiteCommandee;
        produit.setQuantiteEnStock(produit.getQuantiteEnStock() - quantiteCommandee); 
    }

    public void afficherDetails() {
        System.out.println("Client : " + client.getNom());
        System.out.println("Produits : ");
        for (Produit produit : listeProduits) {
            System.out.println("- " + produit.getNom() + " : " + produit.getPrix() + " euros");
        }
        System.out.println("Total : " + this.total + " euros");
    }

    public double getTotal() {
        return this.total;
    }

    public Client getClient() {
        return this.client;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Commande commande = (Commande) obj;
        return Double.compare(commande.total, total) == 0 &&
               client.equals(commande.client) &&
               listeProduits.equals(commande.listeProduits);
    }

    @Override
    public String toString() {
        return "Commande{" +
                "total=" + total +
                ", client=" + client.getNom() +
                ", listeProduits=" + listeProduits +
                '}';
    }
}