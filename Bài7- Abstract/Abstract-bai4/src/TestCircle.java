public class TestCircle {
    public static void main(String[] args) {

        Circle cirle4 = new Circle(5.0f);
        System.out.println("S is: " + cirle4.getArea());
        double numberRandom = Math.random() * 99 + 1;

        cirle4.resize(numberRandom);
        System.out.println("S new is :" + cirle4.getArea() + " increase " + numberRandom + "%");

    }
}
