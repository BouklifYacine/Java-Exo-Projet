package app.Projet3;

public class Seance {

   private Film film; 
   private double heure;
   private int placesdisponibles; 

    public Seance(Film film, double heure, int placesdisponibles){
        this.film = film; 
        this.heure = heure; 
        this.placesdisponibles = placesdisponibles;
    }

    public Film getFilm(){
        return film;
    }

    public double getHeure(){
        return heure;
    }

    public int placesdisponibles(){
        return placesdisponibles;
    }

    public void reserver(int nombreplace){
        if (nombreplace <= placesdisponibles){
            placesdisponibles -= nombreplace; 
            System.out.println(nombreplace + " places réservées pour " + film.getTitre() + " a " + heure);
        }
        else{
            System.out.println(" Pas assez de places disponibles pour " + film.getTitre() + " a " + heure);
        }
    }

  
}