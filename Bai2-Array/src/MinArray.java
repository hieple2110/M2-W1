public class MinArray {
    public static void main(String[] args) {
        int [] number ={34,89,67,74};
        System.out.println("Min of Array: " + findMin(number));


    }
    public static int findMin(int []number) {
        int min = number[0];
        for (int i = 0; i < number.length; i++) {
            if (min > number[i]) {
                min = number[i];
            }
        }
        return min;
    }
    }

