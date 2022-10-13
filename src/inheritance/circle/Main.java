package inheritance.circle;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(1);
        cylinder.setHeight(2);
        System.out.println(cylinder.getVolume());
    }
}
