package access_modifier.circle;

public class Circle {
    private double radius = 1.0d;
    private String color = "red";

    Circle() {}

    Circle(double radius){}

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

    public void display() {
        System.out.println("radius: " + getRadius());
        System.out.println("color: " + getColor());
    }

}
