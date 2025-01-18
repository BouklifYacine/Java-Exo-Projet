package app.Projet5;

public class Elephant extends Animal {

    public Elephant(String nom, int age){
        super(nom,age,"Elephant");
    }

    @Override
    public void manger(){
        System.out.println( this.getNom() + " mange un guépard ");
    }

    @Override
    public void dormir(){
        System.out.println(this.getNom() + " dort avec sa femme éléphante  ");
    }
    
}
