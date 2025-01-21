package app.ProjetBibliotheque;

public class Livre {
    private String titre;
    private String auteur;
    private int anneepublication;

    Livre(String titre, String auteur, int anneepublication) {

        this.titre = titre;
        this.auteur = auteur;
        this.anneepublication = anneepublication;
    }

    void AfficherInfos() {
        System.out.println("Ce livre s'appelle : " + this.titre + ", il est écrit par " + this.auteur
                + " et il est sorti en " + this.anneepublication);
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getAnneepublication() {
        return anneepublication;
    }
}
