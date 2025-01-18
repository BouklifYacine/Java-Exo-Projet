package app.Projet5;

public class Oiseau extends Animal {

    public Oiseau(String nom, int age){
        super(nom,age,"Oiseau");
    }

    @Override
    public void manger(){
        System.out.println(" Le " + this.getNom() + " mange un poisson ");
    }

    @Override
    public void dormir(){
        System.out.println(" Le " + this.getNom() + " dort tout seul  ");
    }
    
}
