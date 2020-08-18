public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        Triangle triangle1 = new Triangle(2,3,4);
        System.out.println(triangle1);

        Triangle triangle2 = new Triangle("red", true, 1,2,3);
        System.out.println(triangle2);

        Triangle triangle3 = new Triangle("red", false, 1,2,3);
        System.out.println(triangle3);

    }
}
