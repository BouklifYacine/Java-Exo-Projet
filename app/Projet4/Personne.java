package app.Projet4;

public class Personne {
    private String nom;
    private int age;
    private int id;

    public Personne(String nom, int age, int id ){
        this.nom = nom; 
        this.age = age; 
        this.id = id;
    }

    public String getNom(){
        return nom;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }
    
}
