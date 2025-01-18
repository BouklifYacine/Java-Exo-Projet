package app.Projet4;

public class Etudiant extends Personne {
    private String niveau;

    public Etudiant(String niveau, String nom, int id , int age ){

        this.niveau = niveau;
        super(nom,id,age);
    }

    public String getNiveau(){
        return niveau;
    }
}
