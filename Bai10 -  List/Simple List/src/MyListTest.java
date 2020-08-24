import java.util.ArrayList;
import java.util.Collection;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        list.add(3);
        list.add(1);
        list.add(6);
        list.add(9);
        list.add(5);


        for (int i = 0; i <= list.size(); i++) {
            System.out.println();
        }
    }
}
