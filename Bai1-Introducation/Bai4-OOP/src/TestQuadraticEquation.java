import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        double a = sc.nextDouble();
        System.out.println("Enter number b: ");
        double b = sc.nextDouble();
        System.out.println("Enter number c: ");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Your QuadraticEquation \n"+ quadraticEquation.display());
        if(quadraticEquation.getDiscriminant() > 0){
            System.out.println("x 1: " + quadraticEquation.getRoot1() + "\n" + "x 2: " + quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant() == 0){
            System.out.println("x: " + quadraticEquation.getExperience());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
