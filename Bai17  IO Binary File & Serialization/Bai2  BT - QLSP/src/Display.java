import java.io.IOException;
import java.util.Scanner;

public class Display {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        Manager.menu();
        while (true) {
            String number = sc.nextLine();
            switch (number) {
                case "1":
                    Manager.addProduct();
                    break;
                case "2":
                    Manager.showProduct();
                    break;
                case "3":
                    Manager.searchProduct();
                    break;
                case "0":
                    System.out.println("Thanks for you choice !!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Press the menu button to continue.");
            }
        }
    }
}
