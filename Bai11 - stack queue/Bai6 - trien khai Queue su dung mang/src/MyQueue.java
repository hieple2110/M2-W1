import java.util.Map;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        if (currentSize == this.capacity) {
            return true;
        }
        return false;
    }

    public boolean isQueueEmpty(){
        if (currentSize == this.capacity){
            return true;
        }
        return false;
    }

    public void enQueue(int item){
        if (isQueueFull()){
            System.out.println("Queue is full");
        }else {
            this.tail++;
            if (this.tail == this.capacity-1){
                this.tail = 0;
            }
            queueArr[this.tail ] = item;
            currentSize++;
            System.out.println(item);
        }
    }

    public void deQueue(){
        if (isQueueEmpty()){
            System.out.println("queue is empty");
        }else {
            this.head++;
            if (this.head == this.capacity-1){
                System.out.println(queueArr[this.head-1]);
                this.head = 0;
            }else{
                System.out.println(queueArr[this.head-1]);
            }
            currentSize--;
        }
    }
}
