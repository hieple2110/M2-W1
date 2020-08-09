import java.util.Arrays;
import java.util.Scanner;
public class sumColArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m,n;
        System.out.println("Enter the row  array Number: ");
        m = sc.nextInt();
        System.out.println("Enter the col array Number: ");
        n = sc.nextInt();

        int[][] number = new int[m][n];
        for (int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.println("number: [" + i + "] [" + j + "]");
                number[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i< number.length; i++){
            System.out.println(Arrays.toString(number[i]));
        }
        System.out.println("Enter the col to be calculated:");
        int index = sc.nextInt();
        while (index < 1  || index > m){
            System.out.println("Enter the col");
            index = sc.nextInt();
        }
        int sum  =0;
        for (int i = 0; i < m; i++){
           sum = sum + number[i][index-1];
        }
        System.out.println("Sum col "+ index + " : " + sum);

    }

}
