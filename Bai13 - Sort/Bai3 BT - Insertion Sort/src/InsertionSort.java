import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
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

        System.out.println("list after sort:");
        insertionSort(list);

    }

        public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int element = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > element; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = element;
        }
        System.out.println(Arrays.toString(list));
    }
}
