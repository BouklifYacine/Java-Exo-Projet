package app;

public class Main {
    public static void main(String[] args) {
     Bibliothèque bibliothèque = new Bibliothèque(); 

     Livre livre1 = new Livre("Javascript", "Javascript guy", 2099); 

     livre1.AfficherInfos();

     bibliothèque.AjouterLivre(livre1);
   bibliothèque.AfficherLivres();
        
    }
}
