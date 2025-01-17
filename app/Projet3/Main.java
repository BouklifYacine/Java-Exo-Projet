package app.Projet3;

public class Main {
    public static void main(String[] args) {
    
        Film film1 = new Film("Inception", "Christopher Nolan", 148);

        Seance seance1 = new Seance(film1, "18:00", 10);

        Utilisateur utilisateur1 = new Utilisateur("Alice");

        utilisateur1.reserverBillet(seance1, 20);

        utilisateur1.afficherBillets();

        System.out.println("Places disponibles pour " + seance1.getFilm().getTitre() + " : " + seance1.getPlacesDisponibles());
    }
}