package debug_demo.illegal_Triangle_exception;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh 1: ");
        int sizeA = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap canh 2: ");
        int sizeB = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap canh 3: ");
        int sizeC = Integer.parseInt(scanner.nextLine());

        checkTriangle(sizeA, sizeB, sizeC);
    }

    public static void checkTriangle(int sizeA, int sizeB, int sizeC) {
        try {
            if ((sizeA + sizeB > sizeC) && (sizeB + sizeC > sizeA) && (sizeA + sizeC > sizeB)) {
                System.out.println("La hinh tam giac");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Errol");
        }
    }
}
