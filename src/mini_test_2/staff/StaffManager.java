package mini_test_2.staff;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StaffManager {
    ArrayList<Staff> staffs;

    public StaffManager() {
        staffs = readFile();
    }

    private void writeFile() {
        File file = new File("src/mini_test_2/staff/data.txt");

        try {

            if (!file.exists()) {
                file.createNewFile();
            }

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));

            objectOutputStream.writeObject(staffs);

            objectOutputStream.close();

        } catch (Exception e) {
            System.out.print("");
        }
    }

    private ArrayList<Staff> readFile() {
        File file = new File("src/mini_test_2/staff/data.txt");
        ArrayList<Staff> staffArrayList = new ArrayList<>();

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            if (fileInputStream.available() > 0) {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                staffArrayList = (ArrayList<Staff>) objectInputStream.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return staffArrayList;
    }

    public void addStaff(int choice, Scanner scanner) {
        try {
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
        } catch (Exception e) {
            System.out.println("Sai định dạng. Nhập lại đê!");
        }

        writeFile();
    }

    public void updateStaff(Scanner scanner) {
        try {
            if (staffs.isEmpty()) {
                System.out.println("Danh sách nhân viên trống");
            } else {
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
                    System.out.println("Để trống nếu không có sự thay đổi");
                    System.out.print("1. Nhập họ và tên nhân viên: ");
                    String name = scanner.nextLine();
                    if (!name.equals("")) {
                        staffs.get(updateIndex).setName(name);
                    }

                    System.out.print("2. Nhập tuổi nhân viên: ");
                    String age = scanner.nextLine();
                    if (!age.equals("")) {
                        staffs.get(updateIndex).setAge(Integer.parseInt(age));
                    }

                    System.out.print("3. Nhập số điện thoại nhân viên: ");
                    String phoneNumber = scanner.nextLine();
                    if (!phoneNumber.equals("")) {
                        staffs.get(updateIndex).setPhoneNumber(phoneNumber);
                    }

                    System.out.print("4. Nhập email nhân viên: ");
                    String email = scanner.nextLine();
                    if (!email.equals("")) {
                        staffs.get(updateIndex).setEmail(email);
                    }

                    if (staffs.get(updateIndex) instanceof FullTimeStaff) {
                        System.out.print("5. Nhập lương cứng: ");
                        String hardSalary = scanner.nextLine();
                        if (!hardSalary.equals("")) {
                            ((FullTimeStaff) staffs.get(updateIndex)).setHardSalary(Double.parseDouble(hardSalary));
                        }

                        System.out.print("6. Nhập tiền thưởng: ");
                        String bonus = scanner.nextLine();
                        if (!bonus.equals("")) {
                            ((FullTimeStaff) staffs.get(updateIndex)).setBonus(Double.parseDouble(bonus));
                        }

                        System.out.print("7. Nhập tiền phạt: ");
                        String penalty = scanner.nextLine();
                        if (!penalty.equals("")) {
                            ((FullTimeStaff) staffs.get(updateIndex)).setPenalty(Double.parseDouble(penalty));
                        }

                        System.out.println("Sửa thành công");
                    } else {
                        System.out.print("5. Nhập số giờ làm việc: ");
                        String workHour = scanner.nextLine();
                        if (!workHour.equals("")) {
                            ((PartTimeStaff)staffs.get(updateIndex)).setWorkHour(Float.parseFloat(workHour));
                        }
                        System.out.println("Sửa thành công");
                    }
                } else {
                    System.out.println("Không có nhân viên có mã " + id);
                }
            }

        } catch (Exception e) {
            System.out.println("Sai định dạng. Nhập lại đê!");
        }
        writeFile();
    }

    public void deleteById(Scanner scanner) {
        try {
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
                System.out.println("Xóa thành công nhân viên có mã " + id);
            } else {
                System.out.println("Không có nhân viên mã " + id);
            }
        } catch (Exception e) {
            System.out.println("Sai định dạng. Nhập lại đê!");
        }

        writeFile();
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
            try {
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
            } catch (Exception e) {
                System.out.println("Sai định dạng. Nhập lại đê!");
            }
        }

        writeFile();
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
        if (staffs.isEmpty()) {
            System.out.println("Danh sách nhân viên trống");
        } else {
            for (Staff staff : staffs) {
                if (staff instanceof FullTimeStaff) {
                    if (staff.netSalary() < averageSalary()) {
                        System.out.println(staff);
                    }
                }
            }
        }
    }

    public void totalSalary() {
        double sumSalary = 0;

        if (staffs.isEmpty()) {
            System.out.println("Danh sách nhân viên trống");
        } else {
            for (Staff staff : staffs) {
                sumSalary += staff.netSalary();
            }

            System.out.println("Tổng lương phải trả là " + sumSalary);
        }
    }

    public void staffSortBySalary() {
        ArrayList<Staff> fullTimeStaffs = new ArrayList<>();
        if (staffs.isEmpty()) {
            System.out.println("Danh sách nhân viên trống");
        } else {
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
