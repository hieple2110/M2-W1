import java.util.Scanner;

public class HinhSao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the square: bottom-left");
        System.out.println("3. Draw the square: top-left");
        System.out.println("4. Draw the square: bottom-right");
        System.out.println("5. Draw the square: top-right");
        System.out.println("6. Draw the triangle");
        System.out.println("0. Exit");

        int choice = sc.nextInt();
        switch (choice){
            case 1: System.out.println("1. Draw the rectangle");
            for( int i = 1; i<= 3; i++){
                for( int j = 1; j <=9; j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            break;
            case 2:   System.out.println("2. Draw the square: bottom-left");
            for (int i =1; i <= 5; i++){
                for (int j = 0; j < i; j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            break;
            case 3: System.out.println("3. Draw the square: top-left");
            for (int i = 5; i >= 1; i--){
                for (int j = 0; j < i; j++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            break;
            case 4: System.out.println("4. Draw the square: bottom-right");
                for (int i = 5; i >= 1; i--){
                    for (int j = 0; j < i; j++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
        }
    }
}
