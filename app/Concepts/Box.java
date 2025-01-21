package app.Concepts;

public class Box<T , U> {
    T item;
    U prix;
    U total;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item ;
    }

    public void setPrix(U prix) {
        this.prix = prix;
    }

    public U getPrix() {
        return this.prix ;
    }

    public U getTotal(){
        return this.total;
    }

    public void setTotal(U total){
        this.total = total;
    }
}


