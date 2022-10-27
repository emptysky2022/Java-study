package sec05;

public class BoxHandler {
    public static void outBox(Box<Toy> box) {
        Toy t = box.get();
        System.out.println(t);
        box.set(new Toy());
    }

    public static void outBox2(Box<? extends Toy> box) {
        Toy t = box.get();
        System.out.println(t);
//      box.set(new Toy());
    }

    public static <T> void outBox3(Box<? extends T> box) {
        T t = box.get();
        System.out.println(t);
//      box.set(t);
    }

    public static void inBox(Box<Toy> box, Toy n) {
        box.set(n);
        Toy t = box.get();
    }

    public static void inBox2(Box<? super Toy> box, Toy n) {
        box.set(n);
//        Toy t = box.get();
    }

    public static <T> void inBox3(Box<? super T> box, T n) {
        box.set(n);
//        n = box.get();
    }
}
