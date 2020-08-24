public class GenericStackClient {
    public static void stackOfString() {
        MyGenericStack<String> stack1 = new MyGenericStack<>();
        System.out.println("1. size of stack: " + stack1.size());
        stack1.push("hung");
        stack1.push("nhung");
        stack1.push("ung");
        stack1.push("tung");

        System.out.println("1. size of stack after push operation: " + stack1.size());
        System.out.println("--------------------");
        System.out.println("2. Pop element from stack: ");
        while (!stack1.isEmpty()) {
            System.out.println(stack1.pop());
        }
        System.out.println("-----------------");
        System.out.println("3. Size of stack after pop operation: " + stack1.size());
    }

    public static void stackOfInteger() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        System.out.println("1. size of stack after push operation: " + stack.size());
        System.out.println("-----------------");
        System.out.println("2. Pop element from stack: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("-----------------");
        System.out.println("3. Size of stack after pop operation: " + stack.size());
    }
}
