import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<String> myList = new Stack<String>();

        myList.push("phuc");
        myList.push("le");
        myList.push("let");
        System.out.println(myList);
        myList.pop();
        for (String str : myList) {
            System.out.println(str);
        }

        System.out.println("Stack of string");
        GenericStackClient.stackOfString();

        System.out.println("Stack of integer");
        GenericStackClient.stackOfInteger();

    }
}
