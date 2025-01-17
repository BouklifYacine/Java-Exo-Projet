package app.Projet4;

public class Professeur extends Personne {
   private String specialite; 

    public Professeur(String nom, int age, int id , String specialite){
        super(nom,id,age);
        this.specialite = specialite;
    }

    public String getSpecialite(){
        return specialite;
    }
}
