public class Fan {
    final int SLOW = 1;
    final  int MEDIUM = 2;
    final  int FAST = 3;

     int speed = SLOW;
     boolean on = false;
     double radius = 5;
     String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    public String toString() {
        if (this.isOn() == true){
            return "Fan:" + " speed " + speed + " radius " + radius + " color " + color + " " + "fan is on";
    }else {
            return "Fan:" + " speed " + speed + " radius " + radius + " color " + color + " " + "fan is off";
        }

    }

}
