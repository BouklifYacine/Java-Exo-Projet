package app.Projet5;

public class Main {
    public static void main(String[] args) {
        Elephant Elephant = new Elephant("Yacine", 25); 
        Lion Lion = new Lion("T-rex", 40); 
        Oiseau oiseau = new Oiseau("PiouPiou", 12);

        Zoo Parilly = new Zoo();

        Parilly.afficherAnimal();
        Parilly.ajouterAnimal(Elephant);
        Parilly.ajouterAnimal(Lion);
        Parilly.ajouterAnimal(oiseau);
        Parilly.afficherAnimal();
        Parilly.journeeAuZoo();
    }
}
