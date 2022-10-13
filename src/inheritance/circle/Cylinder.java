package inheritance.circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {}

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return (this.getRadius() * this.getRadius()) * Math.PI * this.getHeight();
    }

}
