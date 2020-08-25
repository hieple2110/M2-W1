import java.util.Random;
import java.util.Scanner;

public class ArrayExamplpe {

    public static void main(String[] args) {
        ArrayExamplpe arrayExample = new ArrayExamplpe();
        Integer[] list = arrayExample.creRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter index: ");
        int index = scanner.nextInt();

        try {
            System.out.println("Index of element " + index + " is " + list[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The index is too limited of the array: ");
        }

    }


    public Integer[] creRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("list of array: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + "  ");
        }
        return arr;
    }

}

