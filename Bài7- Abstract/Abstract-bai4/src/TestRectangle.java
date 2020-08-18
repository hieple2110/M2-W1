public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 8);
        System.out.println("S is: " + rectangle.getArea());
        double numberRandom = Math.random() * 100;
        rectangle.resize(numberRandom);
        System.out.println("S new is :" + rectangle.getArea() + " increase " + numberRandom + "%");

    }
}