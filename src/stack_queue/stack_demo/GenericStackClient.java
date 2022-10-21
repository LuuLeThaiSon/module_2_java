package stack_queue.stack_demo;

public class GenericStackClient {
    public static void main(String[] args) {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("map_demo");
        stack.push("map_demo");
        stack.push("map_demo");
        stack.push("map_demo");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }
}
