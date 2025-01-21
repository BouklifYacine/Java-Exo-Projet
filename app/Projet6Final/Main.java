package app.Projet6Final;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Jean Dupont", "jean.dupont@example.com");

        Produit produit1 = new Produit("Laptop", 999.99, 10);
        Produit produit2 = new Produit("Souris", 29.99, 50);

        Commande commande = new Commande(client);
        commande.ajouterProduit(produit1, 1); 
        commande.ajouterProduit(produit2, 2); 

        commande.afficherDetails();

        client.ajouterCommande(commande);
        client.afficherLesCommandes();
    }
}