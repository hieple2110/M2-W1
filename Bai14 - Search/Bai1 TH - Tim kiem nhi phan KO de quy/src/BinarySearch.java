import java.util.Arrays;

public class BinarySearch {
    static int[] list = {9, 5, 3, 77, 97, 34, 10, 65, 33};

    public static void main(String[] args) {
        insertionList(list);
        System.out.println(binarySearch(list, 3));
        System.out.println(binarySearch(list, 77));
        System.out.println(binarySearch(list, 65));
    }

    public static void insertionList(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int element = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > element; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = element;
        }
        System.out.println(Arrays.toString(list));
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key > list[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
