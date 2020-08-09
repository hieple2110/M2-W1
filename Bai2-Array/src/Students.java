import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter a name's students");
        String[] name  = {"nguyen","le","tran","vo"};
        String input_name = sc.nextLine();
        Boolean check = false;
        for( int i = 0; i < name.length; i++) {
            if (name[i].equals(input_name)) {
                System.out.println(input_name + " is in the position " + (i + 1));
                check = true;
                break;
            }
        }
        if (!check){
                System.out.println(input_name + " does not exist");
            }
        }

}
