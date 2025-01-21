package app.Projet6Final;

import java.util.ArrayList;

public class Commande {

   private double total; 
   private ArrayList<Produit> listeProduits;
   private Client client ; 

   public Commande(double total, Client client){
    this.total = total; 
    this.client = client; 
    this.listeProduits = new ArrayList<>();
   }

   public void calculerTotal() {
    this.total = 0;
    for (Produit produit : listeProduits) {
        this.total += produit.getPrix();
    }
}

public void ajouterProduit(Produit produit){
    listeProduits.add(produit); 
    total += produit.getPrix() * produit.getQuantiteproduit();
    
}

public void afficherDetails() {
    System.out.println("Client : " + client.getNomClient());
    System.out.println("Produits : ");
    for (Produit produit : listeProduits) {
        System.out.println("- " + produit.getNom() + " : " + produit.getPrix() + " euros ");
    }
    System.out.println("Total : " + this.total + " euros ");
}

   public double getTotal(){
    return this.total; 
   }

   public String getNomClient(){
    return this.client.getNomClient();
   }
    
}
