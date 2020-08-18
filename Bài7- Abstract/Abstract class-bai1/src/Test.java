public class Test {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Animal chicken = new Chicken();

        System.out.println(chicken.makeSound());
        System.out.println(tiger.makeSound());

        Edible chicken1 = new Chicken();
        System.out.println(chicken1.howtoEat());

        Edible app = new Apple();
        Edible org = new Orange();
        System.out.println(app.howtoEat());
        System.out.println(org.howtoEat());




    }
}
