package  com.codegym;
public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("HuynDai", "W1HQ");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("TOYOTA", "W34TR");
        System.out.println(Car.numberOfCar);
        Car car3 = new Car("HuynDai", "W1HQ");
        System.out.println(Car.numberOfCar);
        Car car4 = new Car("TOYOTA", "W34TR");
        System.out.println(Car.numberOfCar);
    }
}
