import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter list size:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("enter " + array.length + " value");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Your list input: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("list after sort:");
        insertionSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println(binarySearch(array, 23, 0, array.length-1));
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            int k;
            for (k = i - 1; k >= 0 && array[k] > element; k--) {
                array[k + 1] = array[k];
            }
            array[k + 1] = element;
        }
    }

    public static int binarySearch(int[] array, int key, int first, int last) {
        if (last >= first) {
            int mid = first + (last - first) / 2;
            if (key > array[mid]) return binarySearch(array, key, mid + 1, last);
            if (key < array[mid]) return binarySearch(array, key, first, mid - 1);
            return mid;
        }
        return -1;
    }
}
