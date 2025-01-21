package app.Projet6Final;

public class Main {
    public static void main(String[] args) {
        // Crée un client
        Client client = new Client("Jean Dupont", "jean.dupont@example.com");

        // Crée des produits
        Produit produit1 = new Produit("Laptop", 999.99, 10);
        Produit produit2 = new Produit("Souris", 29.99, 50);

        // Crée une commande
        Commande commande = new Commande(client);
        commande.ajouterProduit(produit1, 1); // Ajoute 1 laptop
        commande.ajouterProduit(produit2, 2); // Ajoute 2 souris

        // Affiche les détails de la commande
        commande.afficherDetails();

        // Affiche l'historique des commandes du client
        client.ajouterCommande(commande);
        client.afficherLesCommandes();
    }
}