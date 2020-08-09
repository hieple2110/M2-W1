import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("Enter your message: ");
        message = sc.nextLine();

        System.out.println("Enter character test:");
        char x = sc.next().charAt(0);
        int count = 0;
        for (int i = 0;i < message.length(); i++){
            if(x == message.charAt(i)){
                count++;
            }
        }
        System.out.println("Character " + x + " appear "+ count + " times.");
    }
}
