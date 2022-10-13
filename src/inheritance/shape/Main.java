package inheritance.shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle circle = new Circle();
        circle.setRadius(20);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
