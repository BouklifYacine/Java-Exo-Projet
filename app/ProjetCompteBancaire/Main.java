package app.ProjetCompteBancaire;



public class Main {
    public static void main(String[] args) {
        CompteBancaire compte1 = new CompteBancaire(1, "Yacine", 20);
        CompteBancaire compte2 = new CompteBancaire(2, "Norhane", 0);
        Banque banque = new Banque();

        compte1.DeposerArgent(10);
        compte1.RetirerArgent(5);
        compte1.AfficherSolde();
        banque.AjouterCompteBancaire(compte1);
        banque.AjouterCompteBancaire(compte2);
        banque.RetirerCompteBancaire(compte2);
        banque.AfficherToutLesComptes();
      
}}
