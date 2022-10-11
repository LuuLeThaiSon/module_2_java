package access_modifier.circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getColor());
        circle.setRadius(2);
        circle.display();
    }
}
