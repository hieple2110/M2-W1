public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        System.out.println(rec);

        Rectangle rec1 = new Rectangle(3,5);
        System.out.println(rec1);

        Rectangle rec2 = new Rectangle("pink", true,4,8);
        System.out.println(rec2);
    }
}
