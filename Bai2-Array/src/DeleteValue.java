import java.util.Arrays;
import java.util.Scanner;

public class DeleteValue {
    public static void main(String[] args) {
        int [] number = {1,3,5,7,8,4,5,6,7};
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter element to be deleted: ");
        int value;
        value = sc.nextInt();
        for( int i = 0; i < number.length-1; i++){
            if( value == number[i]){
                for(int j = i; j< number.length-1; j++){
                    number[j] = number[j+1];
                    number[j+1] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(number));
    }
}
