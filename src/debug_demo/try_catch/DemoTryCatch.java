package debug_demo.try_catch;

import java.util.Scanner;

public class DemoTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter number: ");
            int n = scanner.nextInt();
            System.out.println("ok");
        } catch (Exception e) {
            System.out.println("Errol");
        }

        System.out.println("done");
    }
}
