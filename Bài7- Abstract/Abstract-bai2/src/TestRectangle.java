import java.util.Arrays;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[4];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(2,5);
        rectangles[2] = new Rectangle("red",true,4,6);
        rectangles[3] = new Rectangle(4,8);

        System.out.println("before - sort");
        for (Rectangle rectangle : rectangles){
            System.out.println(rectangle);
        }
        Arrays.sort(rectangles);

        System.out.println("before - sort");
        for (Rectangle rectangle : rectangles){
            System.out.println(rectangle);
        }
    }
}
