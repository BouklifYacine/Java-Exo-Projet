package app.ProjetCompteBancaire;

public class CompteBancaire {
    private int NumeroDeCompte;
    private String NomTitulaireCompte;
    private double solde;

    public CompteBancaire(int NumeroDeCompte, String NomTitulaireCompte, double solde) {
        this.NumeroDeCompte = NumeroDeCompte;
        this.NomTitulaireCompte = NomTitulaireCompte; 
        this.solde = solde;

    }

    public void DeposerArgent(double montant){
        if(montant > 0){
            solde += montant; 
            System.out.println("Vous venez de déposer : " + montant + " euros");
            System.out.println("Vous avez maintenant : " + this.solde);
        }
        else {
            System.out.println("Erreur : vous n'avez pas d'argent ");
        }
  
    }

    public void RetirerArgent(double montant){
        if(montant > this.solde){
            System.out.println("Vous n'avez pas ces fonds nécessaire dans le compte ");
        }
        else {
            solde -= montant;
            System.out.println("Votre venez de retirez : " + montant);
            System.out.println("Vous avez maintenant : " + this.solde);
        }
    }

    public void AfficherSolde(){
        System.out.println(" Votre solde est de : " + this.solde);
    }

    public int getNumeroDeCompte(){
        return NumeroDeCompte;
    }

    public String getNomTitulaireCompte(){
        return NomTitulaireCompte;
    }

    public double getsolde(){
        return solde;
    }

    
}
