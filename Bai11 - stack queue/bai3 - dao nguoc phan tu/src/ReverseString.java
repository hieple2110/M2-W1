import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String string = "em-evol-uoy-od";

        Stack<Character> list = new Stack<Character>();

        for (int i =0; i< string.length(); i++){
            list.push(string.charAt(i));
        }

        while (list.isEmpty()==false){
            Character ch = list.pop();
            System.out.println(ch);
        }
    }
}
