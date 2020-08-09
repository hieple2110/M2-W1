import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if(number < 2){
            System.out.println(number + " is not a prime");
        }else {
            int i = 2;
            boolean b = true;
            while (i <= Math.sqrt(number)){
                if(number % i == 0){
                    b = false;
                    break;
                }
            i++;
            }
            if(b){
                System.out.println(number + " is a prime");
            }else {
                System.out.println(number + " is not a prime");
            }
        }
    }
}
