package app.Projet3;

public class Seance {

    private Film film;
    private String heure;
    private int placesDisponibles;


    public Seance(Film film, String heure, int placesDisponibles) {
        this.film = film;
        this.heure = heure;
        this.placesDisponibles = placesDisponibles;
    }

    public Film getFilm() {
        return film;
    }

    public String getHeure() {
        return heure;
    }

    public int getPlacesDisponibles() {
        return placesDisponibles;
    }

   
    public void reserver(int nombreDePlaces) {
        if (nombreDePlaces <= placesDisponibles) {
            placesDisponibles -= nombreDePlaces;
            System.out.println(nombreDePlaces + " places réservées pour " + film.getTitre() + " à " + heure);
        } else {
            System.out.println("Pas assez de places disponibles pour " + film.getTitre() + " à " + heure);
        }
    }
}