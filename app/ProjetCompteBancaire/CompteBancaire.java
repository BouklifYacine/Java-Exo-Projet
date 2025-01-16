package app.ProjetCompteBancaire;

public class CompteBancaire {
    private String NumeroDeCompte;
    private String NomTitulaireCompte;
    double solde;

    public CompteBancaire(String NumeroDeCompte, String NomTitulaireCompte, double solde) {
        this.NumeroDeCompte = NumeroDeCompte;
        this.NomTitulaireCompte = NomTitulaireCompte; 
        this.solde = solde;

    }

    public void DeposerArgent(double montant){
        if(montant > 0){
            solde += montant; 
            System.out.println("Vous venez de déposer : " + montant + " euros");
        }
        else {
            System.out.println("Erreur : vous n'avez pas d'argent ");
        }
  
    }

    public void RetirerArgent(double montant){
        if(solde < 0){
            System.out.println("Vous n'avez plus de sous dans votre compte");
        }
        else {
            solde -= montant;
            System.out.println("Votre solde est de maintenant : " + solde);
        }
    }

    public void AfficherSolde(){
        System.out.println(" Votre solde est de : " + solde);
    }
}
