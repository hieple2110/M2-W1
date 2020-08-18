import java.util.Arrays;
import java.util.Comparator;

public class TestRectangle {
    public static void main(String[] args) {
    Rectangle[] rectangles = new Rectangle[4];
        rectangles[0] = new Rectangle("red", true, 6,7);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle(6,4);
        rectangles[3] = new Rectangle(3,8);

        System.out.println("before - sort");
        for(Rectangle rectangle : rectangles){
            System.out.println(rectangle);
        }

        Comparator comparator = new Rectangle();
        Arrays.sort(rectangles,comparator);

        System.out.println("after - sort");
        for(Rectangle rectangle : rectangles){
            System.out.println(rectangle);
        }
    }
}
