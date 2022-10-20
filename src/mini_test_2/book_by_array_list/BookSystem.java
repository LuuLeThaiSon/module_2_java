package mini_test_2.book_by_array_list;

import java.util.Scanner;

public class BookSystem {

    private final BookManager bookManager;
    private final Scanner scanner;

    public BookSystem() {
        this.bookManager = new BookManager();
        this.scanner = new Scanner(System.in);
    }

    public void menuBookManager() {
        do {
            System.out.println("MENU");
            System.out.println("1. Thêm sách");
            System.out.println("2. Tính tổng tiền");
            System.out.println("3. Đếm sách java");
            System.out.println("4. Đếm sách viễn tưởng");
            System.out.println("5. Đếm sách fiction có giá < 100");
            System.out.println("6. Hiển thị danh sách sách");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            int choice1 = Integer.parseInt(scanner.nextLine());

            switch (choice1) {
                case 1:
                    menuCreatBook();
                    break;
                case 2:
                    bookManager.totalPrice();
                    break;
                case 3:
                    bookManager.countProgrammingJava();
                    break;
                case 4:
                    bookManager.countFictionBook();
                    break;
                case 5:
                    bookManager.countFictionBookPriceLessThan100();
                    break;
                case 6:
                    bookManager.display();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    private void menuCreatBook() {
        do {
            System.out.println("Chọn loại sách");
            System.out.println("1. Sách thông thường");
            System.out.println("2. Sách lập trình");
            System.out.println("3. Sách khoa học");
            System.out.println("0. Thoát");
            int choice2 = Integer.parseInt(scanner.nextLine());

            if (choice2 == 0) {
                break;
            }
            bookManager.addBook(choice2, scanner);
        } while (true);
    }
}
