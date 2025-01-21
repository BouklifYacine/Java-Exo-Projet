package app.ProjetBibliotheque;

public class Personne {
    String nom; 
    int age; 
    String ville; 

     Personne(String nom , int age , String ville){
        this.nom = nom; 
        this.age = age; 
        this.ville = ville;
    }

    void SePresenter(){
        System.out.println("Je m'appelle " + this.nom  + " j'ai " + this.age + " ans" + " et j'habite a " + this.ville);
    }
}
