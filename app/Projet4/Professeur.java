package app.Projet4;

public class Professeur extends Personne {
    private String specialite; 

    public Professeur(String specialite, String nom, int id , int age){
        this.specialite = specialite;
        super(nom,id,age);
    }

    public String getSpecialite(){
        return specialite;
    }
}
