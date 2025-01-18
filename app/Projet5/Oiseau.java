package app.Projet5;

public class Oiseau extends Animal {

    public Oiseau(String nom, int age, String espece){
        super(nom,age,espece);
    }

    @Override
    public void Manger(){
        System.out.println(" Le " + this.getNom() + " mange un poisson ");
    }

    @Override
    public void Dormir(){
        System.out.println(" Le " + this.getNom() + " dort tout seul  ");
    }
    
}
