import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {

        int[] number = {99, 88, 77, 66, 55, 44};

        Stack<Integer> list = new Stack<Integer>();

        System.out.println("Array before reverse:");

        for (int i = 0; i<number.length; i++) {
            list.push(number[i]);
        }

        System.out.println("========TEST++++++++");

        while (list.isEmpty()==false){
            Integer reverse = list.pop();
            System.out.println(reverse);
        }
    }
}
