public class Rectangle extends Shape implements Comparable<Rectangle>{
    private double width =1.0;
    private double length = 1.0;

    public Rectangle(){
    }

    public Rectangle( double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length){
        super(color,filled);
        this.width = width;
        this.length = length;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return getWidth()*getLength();
    }

    public  double getPerimeter(){
        return (getWidth()+getLength())*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with (" +
                this.getWidth() + " " +
                this.getLength() + ") " + "area " + this.getArea() +
                " which is a subclass of " + super.toString();
    }

    @Override
    public int compareTo(Rectangle o) {
        if (this.getArea() > o.getArea()){
            return 1;
        }else if (this.getArea() < o.getArea()){
            return -1;
        }else {
            return 0;
        }
    }
}
