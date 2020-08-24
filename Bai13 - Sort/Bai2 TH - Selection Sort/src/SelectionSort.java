import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("enter " + list.length +  " value:");
        for (int i=0; i<list.length; i++){
            list[i] = scanner.nextInt();
        }
        System.out.println("your input list: ");
        for (int j : list) {
            System.out.println(j + "\t");
        }

        selectionSort(list);
        System.out.println("list after sort");
        System.out.println(Arrays.toString(list));

    }

    public static void selectionSort(int[] list){
        for(int i =0;i< list.length-1;i++){
            int min = list[i];
            int minIndex = i;
            for (int j = i+1; j< list.length; j++){
                if (min > list[j]){
                    min = list[j];
                    minIndex= j;
                }
            }
            if (minIndex != i){
                list[minIndex] = list[i];
                list[i] = min;
            }
        }

    }

//    static double[] list = {1, 6, 8, 5, 3, 7, 0, 9, 2};
//
//    public static void selectionSort(double[] list) {
//        for (int i = 0; i < list.length - 1; i++) {
//            double min = list[i];
//            int minIndex = i;
//            for (int j = i + 1; j < list.length; j++) {
//                if (min > list[j]) {
//                    min = list[j];
//                    minIndex = j;
//                }
//            }
//            if (minIndex != i) {
//                list[minIndex] = list[i];
//                list[i] = min;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        selectionSort(list);
////        for (int i = 0; i < list.length; i++) {
//            System.out.println(Arrays.toString(list));
//
////        }
//
//
//    }
}

