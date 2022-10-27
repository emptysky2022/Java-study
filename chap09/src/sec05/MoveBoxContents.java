package sec05;

public class MoveBoxContents {
    public static void main(String[] args) {
        Box<Toy> box1 = new Box<>();
        box1.set(new Toy());
        Box<Toy> box2 = new Box<>();
        BoxContentsMover.moveBox(box2, box1);
        System.out.println(box2.get());
    }
}
