public class Circle  extends Shape implements Comparable<Circle>{
    public double radius = 1.0;
    public final float PI = 3.14f;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.getRadius() * this.getRadius() * PI;
    }

    public double getPerimeter() {
        return  2 * PI * this.getRadius();
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + this.getRadius() +
                ", which is a subclass of " + super.toString();
    }

    @Override
    public int compareTo(Circle o) {
        if (this.getRadius() > o.getRadius()){
            return 1;
        }else if (this.getRadius() < o.getRadius()){
            return -1;
        }else {
            return 0;
        }
    }
}
