public class Solution {
    public static void enQueue(Queue q, int value) {
        Node n = new Node();
        n.data = value;

        if (q.front == null) {
            q.front = q.rear = n;
        } else
            q.rear.link = n;
        q.rear = n;
        q.rear.link = q.front;

    }

    public static void deQueue(Queue q) {
        if (q.front == null) {
            System.out.println("Empty");
        } else if (q.front == q.rear) {
            q.front = q.rear = null;
        } else {

            q.front = q.front.link;
            q.rear.link = q.front;
        }
    }

    public static void displayQueue(Queue q) {
        Node temp = q.front;
        while (temp.link != q.front) {
            System.out.println(temp.data + " ");
            temp = temp.link;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.rear = q.front = null;

        enQueue(q, 0);
        enQueue(q, 1);
        enQueue(q, 5);
        displayQueue(q);
        System.out.println("=======");
        deQueue(q);
        displayQueue(q);
    }

}


