import java.net.PortUnreachableException;

public class Square extends Rectangle {
    public  double size = 1.0;

    public Square(){
    }

    public Square(double size){
        super(size, size);
    }

    public Square(String color, boolean fiiled, double size){
        super(color, fiiled, size, size);
    }

    public double getSize() {
        return getWidth();
    }

    public void setSize(double size) {
        setWidth(size);
        setLength(size);
    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }

    @Override
    public void setLength(double length) {
        setSize(length);
    }

    @Override
    public String toString() {
        return  "A Square with side " + this.getSize() + " which is a subclass of " +super.toString();
    }
}
