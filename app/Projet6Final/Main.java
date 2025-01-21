package app.Projet6Final;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Yacine", "yacine@example.com");

        Produit produit1 = new Produit("pc", 999.99, 1);
        Produit produit2 = new Produit("Souris", 29.99, 10);

        Commande commande = new Commande(0, client); 


        commande.ajouterProduit(produit1);
        commande.ajouterProduit(produit2);

        commande.afficherDetails();
    }
}