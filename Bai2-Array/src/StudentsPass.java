import java.util.Arrays;
import java.util.Scanner;

public class StudentsPass {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size;
        do {
            System.out.println("enter a size:");
            size =sc.nextInt();
            if (size < 1 || size > 30){
                System.out.println("enter a size");
            }
        }while (size < 1 || size > 30);

        int[] name = new int[size];
        for (int i = 0; i < name.length; i++){
            System.out.println("Enter scores " + ( i + 1) + ":");
            name[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(name));

        int count =  0;
        for (int i = 0; i < name.length; i++){
            if (name[i] >= 5  && name[i] <= 10){
                count++;
            }
        }
        System.out.println("The number of students passing the exam: " + count);
    }
}
