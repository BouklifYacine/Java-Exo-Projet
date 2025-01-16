package app;

public class Main {
    public static void main(String[] args) {
        Bibliothèque bibliothèque = new Bibliothèque();

        Livre livre1 = new Livre("Javascript", "Javascript guy", 2099);
        Livre livre2 = new Livre("Messi", "Gaben", 1990);
        Livre livre3 = new Livre("Neymar", "Gaben", 1990);
        Livre livre4 = new Livre("Ronaldo", "Gaben", 1990);

        livre1.AfficherInfos();

        bibliothèque.AjouterLivre(livre1);
        bibliothèque.AjouterLivre(livre2);
        bibliothèque.AjouterLivre(livre3);;
        bibliothèque.RetirerLivre(livre1);
        bibliothèque.AjouterLivre(livre4);
        bibliothèque.AfficherLivres();
        bibliothèque.NombreLivre();

    }
}
