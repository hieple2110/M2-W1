public class Test {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(8);


        queue.enQueue(4);
        queue.enQueue(6);
        queue.enQueue(9);

        System.out.println(queue);
queue.deQueue();
        System.out.println(queue);
    }
}
