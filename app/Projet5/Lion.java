package app.Projet5;

public class Lion extends Animal {
    
    public Lion(String nom, int age){
        super(nom,age,"Lion");
    }

    @Override
    public void manger(){
        System.out.println(this.getNom() + " mange un zèbre ");
    }

    @Override
    public void dormir(){
        System.out.println( this.getNom() + " dort avec sa famille  ");
    }
}

