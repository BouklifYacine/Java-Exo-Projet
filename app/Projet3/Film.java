package app.Projet3;

public class Film {
    private String titre;
    private String realisateur;
    private double duree; 

    public Film(String titre , String realisateur, double duree){
        this.titre = titre;
        this.realisateur = realisateur; 
        this.duree = duree;
    }

    public String getFilm(){
        return titre;
    }; 

    public String getRealisateur(){
        return realisateur;
    }; 

    public double getDuree(){
        return duree;
    }; 

}
