package app.Projet4;

public class Etudiant extends Personne {
    private String niveau;

    public Etudiant(String niveau, String nom, int age, int id){

        this.niveau = niveau;
        super(nom,age,id);
    }

    public String getNiveau(){
        return niveau;
    }
}
