public class Circle {
    private double radius;
    private String color;
    final double PI = 3.14;

    public Circle() {
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.pow(getRadius(),2)*PI;
    }

    public double getPerimeter(){
        return getRadius()*2*PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius " + this.getRadius() +  " and color " + this.getColor();
    }
}
