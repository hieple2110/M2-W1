import java.util.Arrays;
import java.util.Scanner;

public class Max2DimensionalArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Enter number row: ");
        m =sc.nextInt();
        System.out.println("Enter number col: ");
        n = sc.nextInt();
        int [][] number = new int[m][n];
        System.out.println("Enter element of Array: ");
        for (int i=0; i<m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("number: [" + i + "] [" + j + "]");
                number[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println(Arrays.toString(number[i]));
        }

        int max = number[0][0];
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < number[i][j]){
                    max = number[i][j];
                }
            }
        }
        System.out.println("Max: " + max);
    }
}
