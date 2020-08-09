import java.util.Arrays;
import java.util.Scanner;

public class MainDiagonal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m,n;
        System.out.println("Enter the row:");
        m =sc.nextInt();
        System.out.println("Enter the col");
        n = sc.nextInt();

        int [][] number = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.println("number[" + i + "] [" + j + "]");
                number[i][j] = sc.nextInt();
            }
        }
        for ( int i = 0; i < number.length; i++){
            System.out.println(Arrays.toString(number[i]));
        }
        int sum = 0;
        for (int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if( i == j){
                    sum += number[i][j];
                }
            }
        }
        System.out.println("Sum mani diagonal: "+ sum);
    }

}
