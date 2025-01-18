package app.Projet4;

public class Etudiant extends Personne {
    private String niveau;

    public Etudiant(String niveau, String nom, int age, int id){
        super(nom,age,id);
        this.niveau = niveau;
     
    }

    public String getNiveau(){
        return niveau;
    }
}
