package sec05;

public class Box<T> {
    private T ob;

    public void set(T o) {
        this.ob = o;
    }

    public T get() {
        return ob;
    }

    @Override
    public String toString() {
        return ob.toString();
    }
}
