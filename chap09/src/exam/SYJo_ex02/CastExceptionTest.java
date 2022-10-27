package exam.SYJo_ex02;

class Shape {
}

class Rectangle extends Shape {
}

class Circle extends Shape {
}

public class CastExceptionTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        try {
            casting(r);
        } catch (ClassCastException e) {
            System.out.println("클래스 캐스팅 에러");
        }
    }

    static void casting(Shape s) throws ClassCastException {
        Circle c = (Circle) s;
    }
}
