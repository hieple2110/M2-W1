import java.util.LinkedList;

public class TestMyLinkedList {

    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList list = new MyLinkedList(9);
//        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(2,11);
        list.add(4,12);
        list.add(1,13);


        list.addFirst(4);
        list.addFirst(6);
        list.addFirst(7);
        list.addFirst(8);
        list.add(5,20);
        list.add(3,10);
        list.printList();

//        list.get(3);
//        System.out.println(list.get(3));


    }

}
