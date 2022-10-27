package sec05;

public class BoundWildcardBase {
    public static void main(String[] args) {
        Box<Toy> box = new Box<>();
        Toy toy = new Toy();
        BoxHandler.inBox(box, toy);
        BoxHandler.outBox(box);

        Box<Robot> rbox = new Box<>();
//      BoxHandler.inBox(rbox, new Robot());
//      BoxHandler.outBox(rbox);
//      BoxHandler.inBox2(rbox, new Robot());
//      BoxHandler.outBox2(rbox);

    }

}
