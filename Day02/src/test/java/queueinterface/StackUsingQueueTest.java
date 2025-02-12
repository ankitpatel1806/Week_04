package queueinterface;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackUsingQueueTest {

    @Test
    public void testStackOperations() {
        StackUsingQueue.Stack stack = new StackUsingQueue.Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.top());
        assertEquals(3, stack.pop());
        assertEquals(2, stack.top());
    }
}
