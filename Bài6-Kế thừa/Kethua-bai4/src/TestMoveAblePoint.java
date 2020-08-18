public class TestMoveAblePoint {
    public static void main(String[] args) {
        MoveAblePoint move = new MoveAblePoint();
        System.out.println(move);

        MoveAblePoint move1 = new MoveAblePoint(3,5);
        System.out.println(move1);

        MoveAblePoint move2 = new MoveAblePoint(1,3,2,3);
        System.out.println(move2.move());

    }
}
