package app.Projet4;

public class Etudiant extends Personne {
    String niveau;

    public Etudiant(String nom, int age, int id , String niveau){
        super(nom,age,id);
        this.niveau = niveau;
    }

    public String getNiveau(){
        return niveau;
    }

}
