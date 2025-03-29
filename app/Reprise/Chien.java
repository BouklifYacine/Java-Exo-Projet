package app.Reprise;

public class Chien extends Animal {
    int age;

    Chien( int age , boolean Vivant){
       super(Vivant);
       this.age = age;
    }

    void Annee(){
        System.out.println("Le chien a " + age + " ans " + Vivant);
    }
}
