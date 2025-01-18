package app.Projet5;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> ListeAnimal;

    public Zoo() {
        this.ListeAnimal = new ArrayList<>();
    }

    public void ajouterAnimal(Animal animal) {
        if (ListeAnimal.contains(animal)) {
            System.out.println(animal.getNom() + animal.getEspece() + " est déja dans le zoo");
        } else {
            ListeAnimal.add(animal);
            System.out.println(animal.getNom() + animal.getEspece() + " est ajouter au zoo ");
        }

    }

    public void afficherAnimal() {
        if (ListeAnimal.isEmpty()) {
            System.out.println(" Il n'y a aucun animal dans le zoo veuillez en rajoutez merci");
        } else {
            System.out.println(" Les animaux présents dans le zoo sont : ");
            for (Animal animal : ListeAnimal) {
                System.out.println(" - " + animal.getNom() + animal.getEspece());
            }
        }
    }

    public void journeeAuZoo() {
        if (ListeAnimal.isEmpty()) {
            System.out.println(" Zero simulation possible car le zoo est vide");
        } else {
            for (Animal animals : ListeAnimal) {
                animals.manger();
                animals.dormir();
            }
        }
    }

}
