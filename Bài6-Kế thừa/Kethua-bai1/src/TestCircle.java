public class TestCircle {
    public static void main(String[] args) {
        Circle cir = new Circle();
        System.out.println(cir);

        Circle cir1 = new Circle(4);
        System.out.println(cir1);

        Circle cir2 = new Circle("blue", true, 5);
        System.out.println(cir2);
    }

}

