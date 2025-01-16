package app.Projet2;

import java.util.Scanner;

public class Calculatrice {

    public static double additionner(double a, double b) {
        return a + b;
    }

    public static double Soustraire(double a, double b) {
        return a - b;
    }

    public static double Multiplier(double a, double b) {
        return a * b;
    }

    public static double Diviser(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur : Vous ne pouvez pas diviser par zéro.");
        }
        return a / b;
    }

    public static double LogiqueCalculatrice(double a, double b, char operateur) {
        if (operateur == '+') {
            return additionner(a, b);
        } else if (operateur == '-') {
            return Soustraire(a, b);
        } else if (operateur == '*') {
            return Multiplier(a, b);
        } else if (operateur == '/') {
            return Diviser(a, b);
        } else {
            throw new IllegalArgumentException("Opérateur non valide");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nombre1;
        double nombre2;
        char operateur;

        System.out.print("Entrez le premier nombre : ");
        nombre1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        nombre2 = scanner.nextDouble();

        System.out.print("Choisissez l'opérateur (+, -, *, /) : ");
        operateur = scanner.next().charAt(0); 

        try {
            double resultat = LogiqueCalculatrice(nombre1, nombre2, operateur);
            System.out.println("Le résultat est : " + resultat);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}