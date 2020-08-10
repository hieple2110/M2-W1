import java.util.Arrays;
import java.util.Scanner;

public class Concatenates {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int [] first = new int[5];
        int i = 0;
        while (i < first.length){
            System.out.println("enter element " + (i +1)+ ":");
            first[i]=sc.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(first));

        int [] second = new int[4];
        int j = 0;
        while (j< second.length){
            System.out.println("enter element " + (j + 1)+ ":");
            second[j] = sc.nextInt();
             j++;
        }
        System.out.println(Arrays.toString(second));

        int[] third = new int[first.length+ second.length];
        j =0;
        i=0;
        for(int c = 0;c < third.length; c++){
            if(i < first.length){
                third[c] = first[i];
                i++;
            }else {
                third[c] = second[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(third));
    }
    }