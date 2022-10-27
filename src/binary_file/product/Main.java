package binary_file.product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();

        do {
            try {
                System.out.println("MENU");
                System.out.println("1. Add");
                System.out.println("2. Update");
                System.out.println("3. Delete");
                System.out.println("4. Display");
                System.out.println("0. Exit");

                System.out.print("Your choice: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        productManager.add(scanner);
                        break;
                    case 2:
                        productManager.update(scanner);
                        break;
                    case 3:
                        productManager.delete(scanner);
                        break;
                    case 4:
                        productManager.display();
                        break;
                    case 0:
                        System.exit(0);
                }
            } catch (Exception e) {
                System.err.println("Errol");
            }

        } while (true);
    }
}
