package mini_test_2.staff;

import java.util.Scanner;

public class StaffSystem {
    Scanner scanner;

    public final StaffManager staffManager;

    public StaffSystem() {
        this.scanner = new Scanner(System.in);
        this.staffManager = new StaffManager();
    }

    public void staffSystemMenu() {
        do {
            System.out.println("MENU");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Sửa thông tin nhân viên");
            System.out.println("3. Xóa thông tin nhân viên");
            System.out.println("4. Kiểm tra lương nhân viên");
            System.out.println("5. Lương trung bình");
            System.out.println("6. Danh sách nhân viên full time có lương thấp hơn mức lương trung bình");
            System.out.println("7. Tổng số lương phải trả cho nhân viên");
            System.out.println("8. Sắp xếp nhân viên full time theo lương tăng dần");
            System.out.println("9. In danh sách nhân viên");
            System.out.println("0. Thoát");

            System.out.print("Nhập lựa chọn: ");
            int choice1 = Integer.parseInt(scanner.nextLine());

            switch (choice1) {
                case 1:
                    addStaffMenu();
                    break;
                case 2:
                    staffManager.updateStaff(scanner);
                    break;
                case 3:
                    deleteStaffMenu();
                    break;
                case 4:
                    staffManager.checkSalaryById(scanner);
                    break;
                case 5:
                    System.out.println("Lương trung bình của nhân viên công ty là: " + staffManager.averageSalary());
                    break;
                case 6:
                    staffManager.listFullTimeStaffSalaryLessThanAvg();
                    break;
                case 7:
                    staffManager.totalSalary();
                    break;
                case 8:
                    staffManager.staffSortBySalary();
                    break;
                case 9:
                    staffManager.display();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    public void addStaffMenu() {
        do {
            System.out.println("1. Thêm nhân viên full time");
            System.out.println("2. Thêm nhân viên part time");
            System.out.println("0. Thoát");

            System.out.print("Nhập lựa chọn: ");
            int choice2 = Integer.parseInt(scanner.nextLine());

            if (choice2 == 0) {
                break;
            } else staffManager.addStaff(choice2, scanner);
        } while (true);
    }

    public void deleteStaffMenu() {
        do {
            System.out.println("1. Xóa theo mã nhân viên");
            System.out.println("2. Xóa hết");
            System.out.println("0. Thoát");

            System.out.print("Nhập lựa chọn: ");
            int choice3 = Integer.parseInt(scanner.nextLine());

            if (choice3 > 2 || choice3 < 0) {
                System.out.println("Nhập lại lựa chọn");
            } else if (choice3 == 0) {
                break;
            } else if (choice3 == 1) {
                staffManager.deleteById(scanner);
            } else staffManager.deleteAll();
        } while (true);
    }
}
