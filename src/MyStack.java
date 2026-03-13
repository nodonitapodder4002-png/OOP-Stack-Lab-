import java.util.ArrayList;

public class MyStack<T> {

    private ArrayList<T> elements;

    public MyStack() {
        elements = new ArrayList<>();
    }

    public T top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements.get(elements.size() - 1);
    }

    public void push(T value) {
        elements.add(value);
    }

    public void pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        elements.remove(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int getSize() {
        return elements.size();
    }
}