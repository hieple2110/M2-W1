public class TestSquare {
    public static void main(String[] args) {
        Square squa = new Square();
        System.out.println(squa);

        Square squa1 = new Square(5);
        System.out.println(squa1);

        Square squa2 = new Square("white", false, 6);
        System.out.println(squa2);


    }
}
