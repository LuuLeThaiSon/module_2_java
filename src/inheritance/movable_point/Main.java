package inheritance.movable_point;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint();
        point.setX(1);
        point.setY(3);
        point.setSpeed(5,5);
        System.out.println(point.toString());
        System.out.println(point.move().toString());
    }
}
