package sec05;

public class Unboxer {
    public static <T> T openBox(Box<T> box) {
        return box.get();
    }

    public static <T> void peekBox(Box<T> box) {
        System.out.println(box);
    }

    public static void peekBox2(Box<?> box) {
        System.out.println(box);
    }

    public static void peekBox3(Box<? extends Number> box) {
        System.out.println(box);
    }

    public static void peekBox4(Box<? super Integer> box) {
        System.out.println(box);
    }
}
