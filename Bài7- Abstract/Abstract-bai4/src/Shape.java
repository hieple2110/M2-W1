public class Shape implements Resizeable {
    public String color = "green";
    public Boolean filled = true;

    public Shape() {

    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        String text = "A Shape with color of " + this.getColor() + " and " + this.getFilled();
        return text;
    }

    @Override
    public void resize(double percent) {

    }
}
