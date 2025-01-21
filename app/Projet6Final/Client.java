package app.Projet6Final;

import java.util.ArrayList;

public class Client {
    private String nom;
    private String email;
    private ArrayList<Commande> historiquedeCommandes;

    public Client(String nom, String email) {

        this.nom = nom;
        this.email = email;
        this.historiquedeCommandes = new ArrayList<>();

    }

    public void ajouterCommande(Commande commande) {
        if (historiquedeCommandes.contains(commande)) {
            System.out.println("Cette " + commande + " est déja dans la liste");
        } else {
            historiquedeCommandes.add(commande);
            System.out.println("Tu viens d'ajouter a ta commande : " + commande);
        }
    }

    public void AfficherLesCommandes() {
        if (historiquedeCommandes.isEmpty()) {
            System.out.println("Votre commande est vide ajouter un produit pour voir vos commandes");
        } else {
            System.out.println(" Voici ce que contient votre commande : ");
            for (Commande commande : historiquedeCommandes) {
                System.out.println("- " + commande);
            }
        }
    }

    public String getNomClient() {
        return this.nom;
    }

    public String getEmail() {
        return this.email;
    }

    public ArrayList<Commande> getHistoriquedeCommandes() {
        return this.historiquedeCommandes;
    }
}
