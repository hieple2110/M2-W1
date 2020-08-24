import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue<Integer> queue = new MyLinkedListQueue<>();

        queue.enqueue(99);
        queue.enqueue(88);
        queue.enqueue(77);
        queue.enqueue(66);
        queue.enqueue(55);
        queue.dequeue();
        System.out.println("Dequeued item is " + queue.dequeue().key);



    }
}
