import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean checked = false;
        while (!checked) {
            try {
                System.out.print(" enter a: ");
                int a = scanner.nextInt();
                System.out.print(" enter b: ");
                int b = scanner.nextInt();
                System.out.print(" enter c: ");
                int c = scanner.nextInt();
                edgeTriangle(a, b, c);
                checked = true;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void edgeTriangle(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            throw new ArithmeticException("The triangle side must be a positive integer");
        } else if (a + b < c || b + c < a || c + a < b) {
            throw new IllegalArgumentException("The sum of 2 edges must be greater than the other side");
        } else {
            System.err.println("ABC is Triangle");
        }
    }
}
