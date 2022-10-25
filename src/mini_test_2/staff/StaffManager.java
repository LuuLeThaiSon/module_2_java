package mini_test_2.staff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StaffManager {
    ArrayList<Staff> staffs;

    public StaffManager() {
        staffs = new ArrayList<>();
    }

    public void addStaff(int choice, Scanner scanner) {
        if (choice < 0 || choice > 2) {
            System.out.println("Nhập lại lựa chọn");
        } else {
            System.out.print("1. Nhập mã nhân viên: ");
            String id = scanner.nextLine();
            System.out.print("2. Nhập họ và tên nhân viên: ");
            String name = scanner.nextLine();
            System.out.print("3. Nhập tuổi nhân viên: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("4. Nhập số điện thoại nhân viên: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("5. Nhập email nhân viên: ");
            String email = scanner.nextLine();

            if (choice == 1) {
                System.out.print("6. Nhập lương cứng: ");
                double hardSalary = Double.parseDouble(scanner.nextLine());
                staffs.add(new FullTimeStaff(id, name, age, phoneNumber, email, hardSalary));
                System.out.println("Thêm thành công!!!");
            } else {
                System.out.print("6. Nhập số giờ làm việc: ");
                float workHour = Float.parseFloat(scanner.nextLine());
                staffs.add(new PartTimeStaff(id, name, age, phoneNumber, email, workHour));
            }
        }
    }

    public void updateStaff(Scanner scanner) {
        System.out.print("Nhập mã nhân viên: ");
        String id = scanner.nextLine();
        int updateIndex = -1;
        boolean flag = false;
        for (int i = 0; i < staffs.size(); i++) {
            if (staffs.get(i).getId().equals(id)) {
                flag = true;
                updateIndex = i;
                break;
            }
        }

        if (flag) {
            System.out.print("1. Nhập họ và tên nhân viên: ");
            staffs.get(updateIndex).setName(scanner.nextLine());
            System.out.print("2. Nhập tuổi nhân viên: ");
            staffs.get(updateIndex).setAge(Integer.parseInt(scanner.nextLine()));
            System.out.print("3. Nhập số điện thoại nhân viên: ");
            staffs.get(updateIndex).setPhoneNumber(scanner.nextLine());
            System.out.print("4. Nhập email nhân viên: ");
            staffs.get(updateIndex).setEmail(scanner.nextLine());
            if (staffs.get(updateIndex) instanceof FullTimeStaff) {
                System.out.print("5. Nhập lương cứng: ");
                ((FullTimeStaff) staffs.get(updateIndex)).setHardSalary(Double.parseDouble(scanner.nextLine()));
                System.out.print("6. Nhập tiền thưởng: ");
                ((FullTimeStaff) staffs.get(updateIndex)).setBonus(Double.parseDouble(scanner.nextLine()));
                System.out.print("7. Nhập tiền phạt: ");
                ((FullTimeStaff) staffs.get(updateIndex)).setPenalty(Double.parseDouble(scanner.nextLine()));
                System.out.println("Sửa thành công");
            } else {
                System.out.print("5. Nhập số giờ làm việc: ");
                ((PartTimeStaff)staffs.get(updateIndex)).setWorkHour(Float.parseFloat(scanner.nextLine()));
                System.out.println("Sửa thành công");
            }
        } else {
            System.out.println("Không có nhân viên có mã " + id);
        }
    }

    public void deleteById(Scanner scanner) {
        System.out.print("Nhập mã nhân viên: ");
        String id = scanner.nextLine();

        int deleteIndex = -1;
        boolean flag = false;
        for (int i = 0; i < staffs.size(); i++) {
            if (staffs.get(i).getId().equals(id)) {
                deleteIndex = i;
                flag = true;
                break;
            }
        }

        if (flag) {
            staffs.remove(deleteIndex);
            System.out.println("Xóa thành công mã nhân viên " + id);
        } else {
            System.out.println("Không có nhân viên có mã " + id);
        }
    }

    public void deleteAll() {
        staffs.clear();
        System.out.println("Đã xóa toàn bộ danh sách");
    }

    public void checkSalaryById(Scanner scanner) {
        int index = -1;
        boolean flag = false;
        if (staffs.isEmpty()) {
            System.out.println("Danh sách nhân viên trống!");
        } else {
            System.out.print("Nhập mã nhân viên: ");
            String id = scanner.nextLine();
            for (int i = 0; i < staffs.size(); i++) {
                if (staffs.get(i).getId().equals(id)) {
                    index = i;
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Lương của nhân viên có mã số " + id + " là: " + staffs.get(index).netSalary());
            } else {
                System.out.println("Không có nhân viên có mã " + id);
            }
        }
    }

    public double averageSalary() {
        double sum = 0;
        double avg;
        if (staffs.isEmpty()) {
            System.out.println("Danh sách nhân viên trống!");
        } else {
            for (Staff staff : staffs) {
                sum += staff.netSalary();
            }
        }

        avg = (sum / staffs.size());
        return avg;
    }

    public void listFullTimeStaffSalaryLessThanAvg() {

        for (Staff staff : staffs) {
            if (staff instanceof FullTimeStaff) {
                if (staff.netSalary() < averageSalary()) {
                    System.out.println(staff);
                }
            }
        }
    }

    public void totalSalary() {
        double sumSalary = 0;
        for (Staff staff : staffs) {
            sumSalary += staff.netSalary();
        }

        System.out.println("Tổng lương phải trả là " + sumSalary);
    }

    public void staffSortBySalary() {
        ArrayList<Staff> fullTimeStaffs = new ArrayList<>();
        for (Staff staff : staffs) {
            if (staff instanceof FullTimeStaff) {
                fullTimeStaffs.add(staff);
            }
        }
        Collections.sort(fullTimeStaffs);
        for (Staff staff : fullTimeStaffs) {
            System.out.println(staff);
        }

    }

    public void display() {
        if (staffs.isEmpty()) {
            System.out.println("Danh sách nhân viên trống");
        } else {
            for (Staff staff : staffs) {
                if (staff instanceof FullTimeStaff) {
                    System.out.println(staff);
                } else System.out.println(staff);
            }
        }
    }
}
