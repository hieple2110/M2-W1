public class Circle extends Shape{
    private double radius =1.0;
    final double PI = 3.14;

    public Circle() {
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.pow(getRadius(),2)*PI;
    }

    public double getPerimeter(){
        return getRadius()*2*PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius " + getRadius() + " which is a subclass of " + super.toString();
    }
}
