package stack_queue.reversNumber;

import java.util.Stack;

public class ReversNumber {

    static void revers() {
        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        Stack<Integer> newStack = new Stack<>();

        for (int i = stack.size(); i > 0 ; i--) {
            newStack.push(stack.pop());
        }

        stack = newStack;

        System.out.println(stack);
    }

    public static void main(String[] args) {
        revers();
    }
}
