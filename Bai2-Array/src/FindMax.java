import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int [] money;
     do {
         System.out.println("Enter a size: ");
         size = sc.nextInt();
         if(size >20){
             System.out.println("Size should not exceed 20!");
         }
     }while (size>20);
    money = new int[size];
    int i = 0;
    while (i < money.length){
        System.out.println("Enter element " + (i +1)+ ":");
        money[i] = sc.nextInt();
        i++;
    }
        System.out.printf("%-20s%s", "\n" +
                "List of properties: ", "");
    for(int j = 0; j < money.length; j++) {
        System.out.println(money[j]);
    }
    int max = money[0];
    int count = 0;
    for( int d = 0;d < money.length;d++){
        if(max < money[d]){
            max = money[d];
            count++;
        }

    }
        System.out.println("Biggest Asset: " + max + " " + count);
    }
}
