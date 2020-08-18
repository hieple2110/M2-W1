public class Circle {
    final double PI = 3.14159;
    private  double radius = 1.0;
    private  static String color = "red";

    public Circle(){

    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public  double getArea(){
        return Math.pow(getRadius(),2)*PI;
    }

    public String display (){
        return "Circle: radius " + getRadius() + " area " + getArea() +  " color " + Circle.color;
    }
}
