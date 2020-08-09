import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 6};
       ;
        System.out.println(Arrays.toString( sortNumber(arr)));
    }
    public  static int[] sortNumber(int[] number) {

        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    int x = number[i];
                    number[i] = number[j];
                    number[j] = x;
                }
            }
        }
        return number;
    }

}
