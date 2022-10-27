package exam.SYJo_ex04;

public class Pair<T> {
    T[] ob;

    public Pair(T... args) {
        ob = args;
    }

    public T first() {
        return ob[0];
    }

    public T second() {
        return ob[1];
    }
}
