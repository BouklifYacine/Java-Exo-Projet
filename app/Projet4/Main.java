package app.Projet4;

public class Main {
    public static void main(String[] args) {
        Professeur professeur = new Professeur("Maths", "Gerard", 1, 35);
        Cours cours = new Cours("Algèbre", professeur);

        Etudiant etudiant1 = new Etudiant("Moyen", "Yacine", 1, 25);
        Etudiant etudiant2 = new Etudiant("Excellent", "Salah", 2, 35);

        cours.StockerEtudiant(etudiant1);
        cours.StockerEtudiant(etudiant2);

        cours.AfficherEtudiants();
       
    }
}