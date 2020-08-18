import java.util.Arrays;

public class TestCircle {
    public static void main(String[] args) {
        Circle[] circles = new Circle[4];
        circles[0] = new Circle();
        circles[1] = new Circle("red",true,4.6);
        circles[2] = new Circle(3.5);
        circles[3] = new Circle(4.8);

        System.out.println("before - sort");
        for (Circle circle : circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);

        System.out.println("before - sort");
        for (Circle circle : circles){
            System.out.println(circle);
        }
    }
}
