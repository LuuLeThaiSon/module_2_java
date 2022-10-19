package mini_test_2.book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BookManager bookManager = new BookManager();

        do {
            System.out.println();
            System.out.println("MENU");
            System.out.println("1. Add new normal book.");
            System.out.println("2. Add new programming book.");
            System.out.println("3. Add new fiction book.");
            System.out.println("4. Total price.");
            System.out.println("5. Display.");
            System.out.println("0. Exit");

            int choice = -1;

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Add a new normal book");
                    bookManager.addNormalBook();
                    break;
                case 2:
                    System.out.println("Add a new programming book");
                    bookManager.addProgrammingBook();
                    break;
                case 3:
                    System.out.println("Add a new fiction book");
                    break;
                case 4:
                    System.out.println("Total price: " + bookManager.totalPrice());
                    break;
                case 5:
                    bookManager.display();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
