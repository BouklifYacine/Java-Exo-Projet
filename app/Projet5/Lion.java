package app.Projet5;

public class Lion extends Animal {
    
    public Lion(String nom, int age, String espece){
        super(nom,age,espece);
    }

    @Override
    public void Manger(){
        System.out.println(" Le " + this.getNom() + " mange un zèbre ");
    }

    @Override
    public void Dormir(){
        System.out.println(" Le " + this.getNom() + " dort avec sa famille  ");
    }
}

