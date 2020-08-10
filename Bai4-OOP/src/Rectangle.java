public class Rectangle {

    double width;
    double height;

    public  Rectangle() {
        height = 4.8;
        width = 9.6;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public  double getArea() {
        return this.width * this.height;
    }

    public  double getPerimeter() {
        return  (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
