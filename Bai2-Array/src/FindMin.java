import java.util.Arrays;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter size array");
            size = sc.nextInt();
            if(size>10){
                System.out.println("Size should not exceed 10!");
            }
        }while (size>10);
        int [] number = new int[size];
        for (int i = 0; i< number.length; i++){
            System.out.println("Enter element of array");
            number[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(number));

        int min = number[0];
        for (int i = 0; i < number.length; i++){
            if (min > number[i]){
                min = number[i];
            }
        }
        System.out.println("Min: " + min);
    }
}
