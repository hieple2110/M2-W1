public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        int arr[] = new int[index];
    }

    public boolean isEmpty() {
        if (this.index == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (this.index == this.size) {
            return true;
        }
        return false;
    }

    public void pushStack(int element) {
        if (isFull()) {
            throw new StackOverflowError();
        } else {
            arr[index] = element;
            index++;
        }
    }

    public int popStack() throws Exception {
        if (isEmpty()) {
            throw new Exception("stack is null");
        }
        return arr[--index];
    }

    public int Size() {
        return index;
    }

}
