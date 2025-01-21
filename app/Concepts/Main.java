package app.Concepts;

public class Main {
    public static void main(String[] args) {
        Box<String , Integer> box = new Box<>();

        box.setItem("Yacine");
        System.out.println(box.getItem());
        box.setPrix(25);
        System.out.println(box.getPrix());
        box.setTotal(500);
        System.out.println(box.getTotal());
    }
}
