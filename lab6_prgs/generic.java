//do again
import java.util.*;
class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Box{" + "item=" + item + '}';
    }
}
public class Generic {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(123);
        System.out.println("Integer Box: " + integerBox.getItem());

        Box<String> stringBox = new Box<>("Hello Generics");
        System.out.println("String Box: " + stringBox.getItem());
    }
}
