import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter x: ");
            int x = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter y: ");
            int y = Integer.parseInt(scanner.nextLine());
            CalculationExample cal = new CalculationExample();
            cal.calculator(x, y);
        } catch (Exception exception) {
            System.out.println("Nhap so nguyen");
        }
    }

    public void calculator(int x, int y) {
        try {
            int sum = x + y;
            int sub = x - y;
            int multi = x * y;
            int div = x / y;
            System.out.println("sum: " + sum);
            System.out.println("sub: " + sub);
            System.out.println("multi: " + multi);
            System.out.println("div: " + div);
        } catch (Exception e) {
            System.out.println("co ngoai le" + e.getMessage());
        }
    }
}
