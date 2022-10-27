package sec05;

public class WildCardUnboxer {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("strawberry moon");
        Unboxer.peekBox(box);
//        Unboxer.peekBox3(box);
//        Unboxer.peekBox4(box);

        Box<Integer> ibox = new Box<>();
        ibox.set(59);
        Unboxer.peekBox2(ibox);
        Unboxer.peekBox3(ibox);
        Unboxer.peekBox4(ibox);

        Box<Double> dbox = new Box<>();
        dbox.set(59.59);
        Unboxer.peekBox3(dbox);
//        Unboxer.peekBox4(dbox);
    }
}
