import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter list size");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("enter " + list.length + " value");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list: ");
        for (int j = 0; j < list.length; j++) {
            System.out.println(list[j]);
        }

        System.out.println("List after sort: ");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        for (int k = 1; k < list.length; k++) {
            for (int l = 0; l < list.length - k; l++) {
                if (list[l] > list[l+1]){
                    int temp = list[l];
                    list[l]=list[l+1];
                    list[l+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
}