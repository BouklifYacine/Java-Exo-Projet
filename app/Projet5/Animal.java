package app.Projet5;

public abstract class  Animal {
    private String nom;
    private int age;
    private String espece;

    public Animal(String nom, int age, String espece) {
        this.nom = nom;
        this.age = age;
        this.espece = espece;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String getEspece() {
        return espece;
    }

    public abstract void manger(); 
    public abstract void dormir(); 
}
