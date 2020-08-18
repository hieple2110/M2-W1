public class Chicken  extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: oooooooo";
    }

    @Override
    public String howtoEat() {
        return "Chicken could be fried.";
    }
}
