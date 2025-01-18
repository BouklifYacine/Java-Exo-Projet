package app.Projet5;

public class Elephant extends Animal {

    public Elephant(String nom, int age, String espece){
        super(nom,age,espece);
    }

    @Override
    public void Manger(){
        System.out.println(" Le " + this.getNom() + " mange un guépard ");
    }

    @Override
    public void Dormir(){
        System.out.println(" Le " + this.getNom() + " dort avec sa femme éléphante  ");
    }
    
}
