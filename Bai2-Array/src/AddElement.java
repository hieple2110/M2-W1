import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] number = {2, 4, 6, 8, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to be add: ");
        int value;
        value = sc.nextInt();
        System.out.println("Enter index to be add: ");
        int index;
        index = sc.nextInt();

        if (index <= 1 && index >= number.length - 1) {
            System.out.println("Not add element! ");
        } else
            for (int j = number.length - 1; j >index; j--) {
                    int temp = number[j];
                    number[j] = number[j - 1];
                    number[j - 1] = temp;
                }
            number[index]=value;
        System.out.println(Arrays.toString(number));
            }

    }


