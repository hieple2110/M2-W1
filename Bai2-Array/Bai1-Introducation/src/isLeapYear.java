import java.util.Scanner;

public class isLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter is year: ");
        int year = sc.nextInt();

        if(year%4 ==0 && year%100 !=0){
            System.out.println(year + " is a leap year");
        }else if(year%100 == 0 && year%400 != 0){
            System.out.println(year + " Not a leap year");
        }else if(year%100 == 0 && year%400 == 0){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " Not a leap year");
        }
    }
}
