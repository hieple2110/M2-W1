import java.util.Arrays;
import java.util.Comparator;

public class TestCircle {
    public static void main(String[] args) {
        Circle[] circles = new Circle[4];
        circles[0] = new Circle("yellow",false,6.7);
        circles[1] = new Circle(3.7);
        circles[2] = new Circle();
        circles[3] = new Circle("yellow",false,4);

        System.out.println("before - sort");
        for (Circle circle : circles){
            System.out.println(circle);
        }

        Comparator comparator = new Circle();
        Arrays.sort(circles, comparator);

        System.out.println("after - sort");
        for (Circle circle : circles){
            System.out.println(circle);
        }
    }

}
