import java.util.Scanner;

public class TestRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width");
        double width = sc.nextDouble();
        System.out.println("Enter height");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());


//        Rectangle abc =new Rectangle();
//        System.out.println(abc.height+" "+abc.width);
//        System.out.println("Your Rectangle \n"+ abc.display());
//        System.out.println("Perimeter of the Rectangle: "+ abc.getPerimeter());
//        System.out.println("Area of the Rectangle: "+ abc.getArea());



    }
}
