package mini_test_2.book_by_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
    private final ArrayList<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    public void addBook(int choice, Scanner scanner) {
        if (choice < 1 || choice > 3) {
            System.out.println("Nhập lại");
        } else {
            System.out.print("Nhập mã sách: ");
            String bookCode = scanner.nextLine();
            System.out.print("Nhập tên sách: ");
            String name = scanner.nextLine();
            System.out.print("Nhập giá sách: ");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.print("Nhập tên tác giả: ");
            String author = scanner.nextLine();

            if (choice == 1) {
                books.add(new Book(bookCode, name, price, author));
            } else if (choice == 2) {
                System.out.print("Nhập ngôn ngữ: ");
                String language = scanner.nextLine();
                System.out.print("Nhập framework: ");
                String framework = scanner.nextLine();

                books.add(new ProgrammingBook(bookCode, name, price, author, language, framework));
            } else {
                System.out.print("Nhập category: ");
                String category = scanner.nextLine();

                books.add(new FictionBook(bookCode, name, price, author, category));
            }
        }
    }

    public void totalPrice() {
        double sum = 0;
        for (Book book : books) {
            sum += book.getPrice();
        }

        System.out.println("Tổng tiền sách là: " + sum);
    }

    public void countProgrammingJava() {
        int count = 0;
        for (Book book : books) {
            if (book instanceof ProgrammingBook) {
                if (((ProgrammingBook) book).getLanguage().equals("java")) {
                    count++;
                }
            }
        }

        System.out.println("Số sách lập trình có ngôn ngữ java: " + count);
    }

    public void countFictionBook() {
        int count = 0;
        for (Book book : books) {
            if (book instanceof FictionBook) {
                count++;
            }
        }

        System.out.println("Số sách viễn tưởng: " + count);
    }

    public void countFictionBookPriceLessThan100() {
        int count = 0;
        for (Book book : books) {
            if (book instanceof FictionBook) {
                if (book.getPrice() < 100) {
                    count++;
                }
            }
        }

        System.out.println("Số sách viễn tưởng có giá < 100: " + count);
    }

    public void display() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
