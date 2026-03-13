import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    @Test
    void testPushAndTop() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.top());
    }

    @Test
    void testPop() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    void testSize() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.getSize());
    }
}