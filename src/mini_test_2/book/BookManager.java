package mini_test_2.book;

import java.util.Scanner;

public class BookManager {

    Scanner scanner = new Scanner(System.in);
    private Book[] books;

    public BookManager() {
        books = new Book[0];
    }

    public void setBook(Book[] books) {
        this.books = books;
    }

    public Book addBook() {

        System.out.print("Book Code: ");
        String bookCode = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.print("Author: ");
        String author = scanner.nextLine();

        return new Book(bookCode, name, price, author);
    }

    public void addNormalBook() {
        Book book = addBook();

        Book[] newBook = new Book[books.length + 1];

        for (int i = 0; i < books.length; i++) {
            newBook[i] = books[i];
        }

        newBook[books.length] = book;

        System.out.println("Add done");


        this.books = newBook;
    }

    public void addProgrammingBook() {
        Book book = addBook();

        System.out.print("Language: ");
        String language = scanner.nextLine();

        System.out.print("Framework: ");
        String framework = scanner.nextLine();

        ProgrammingBook programmingBook = new ProgrammingBook(book.getBookCode(),
                                                    book.getName(),
                                                    book.getPrice(),
                                                    book.getAuthor(),
                                                    language,
                                                    framework);

        Book[] newBook = new Book[books.length + 1];

        for (int i = 0; i < books.length; i++) {
            newBook[i] = books[i];
        }

        newBook[books.length] = programmingBook;

        System.out.println("Add done");

        this.books = newBook;
    }

    public void addFictionBook() {
        Book book = addBook();

        System.out.print("Category: ");
        String category = scanner.nextLine();

        FictionBook fictionBook = new FictionBook(book.getBookCode(), book.getName(),
                                                    book.getPrice(), book.getAuthor(),
                                                    category);

        Book[] newBook = new Book[books.length + 1];

        for (int i = 0; i < books.length; i++) {
            newBook[i] = books[i];
        }

        newBook[newBook.length - 1] = fictionBook;

        System.out.println("Add done");


        this.books = newBook;
    }
//
    public void display() {
        if (books.length == 0) {
            System.out.println("No list book");
        }
        for (int i = 0; i < books.length; i++) {
            System.out.print("Book " + (i+1) + ": ");
            System.out.println(books[i]);
        }
    }

    public double totalPrice() {
        double sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i].getPrice();
        }

        return sum;
    }
}
