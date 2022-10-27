package exam.SYJo_ex06;

public class Max<T> {
    public <T extends Number> T max(T a, T b) {
        return a.doubleValue() < b.doubleValue() ? b : a;
    }

    public <T extends String> T max(T a, T b) {
        return a.length() < b.length() ? b : a;

    }

}
