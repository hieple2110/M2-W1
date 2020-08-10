import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double a,b,c;
        System.out.println("a: ");
        a= sc.nextDouble();
        System.out.println("b: ");
        b= sc.nextDouble();
        System.out.println("c: ");
        c= sc.nextDouble();
        if( a!=0){
            double experience =-b/a;
            System.out.println("The equation has solutions x =: " + experience);
        }else if (b == 0) {
                System.out.print("The experience is all x!");
            } else {
                System.out.print("No experience!");
        }
    }
}
