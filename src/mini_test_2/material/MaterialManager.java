package mini_test_2.material;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class MaterialManager {
    private final ArrayList<Material> materials;

    public MaterialManager() {
        materials = new ArrayList<>();
    }

    public void addMaterial(int choice, Scanner scanner) {
        if (choice > 2 || choice < 0) {
            System.out.println("Nhập lại lựa chọn");
        } else {
            System.out.print("Nhập mã vật liệu: ");
            String id = scanner.nextLine();
            System.out.print("Nhập tên vật liệu: ");
            String name = scanner.nextLine();
            System.out.print("Nhập ngày sản xuất (Ngày.Tháng.Năm): ");
            LocalDate manufacturingDate = convertStringToLocalDate(scanner);
            System.out.print("Nhập giá: ");
            double cost = Double.parseDouble(scanner.nextLine());

            if (choice == 1) {
                System.out.print("Nhập số lượng: ");
                int quantity = Integer.parseInt(scanner.nextLine());
                materials.add(new CrispyFlour(id, name, manufacturingDate, cost, quantity));
            } else {
                System.out.print("Nhập khối lượng: ");
                double weight = Double.parseDouble(scanner.nextLine());
                materials.add(new Meat(id, name, manufacturingDate, cost, weight));
            }
        }
    }

    public void deleteMaterial(int choice, Scanner scanner) {
        if (choice > 3 || choice < 0) {
            System.out.println("Nhập lại lựa chọn");
        } else if (choice == 1) {
            deleteMaterialById(scanner);
        } else if (choice == 2) {
            deleteMaterialByName(scanner);
        } else deleteAll();
    }

    public void deleteMaterialById(Scanner scanner) {
        System.out.print("Nhập mã sản phẩm muốn xóa: ");
        String id = scanner.nextLine();
        boolean flag = false;
        int deleteIndex = -1;
        for (int i = 0; i < materials.size(); i++) {
            if (materials.get(i).getId().equals(id)) {
                flag = true;
                deleteIndex = i;
                break;
            }
        }
        delete(flag, deleteIndex);
    }

    public void deleteMaterialByName(Scanner scanner) {
        System.out.print("Nhập tên sản phẩm muốn xóa: ");
        String name = scanner.nextLine();
        boolean flag = false;
        int deleteIndex = -1;
        for (int i = 0; i < materials.size(); i++) {
            if (materials.get(i).getName().equalsIgnoreCase(name)) {
                flag = true;
                deleteIndex = i;
                break;
            }
        }
        delete(flag, deleteIndex);
    }

    public void delete(boolean flag, int deleteIndex) {
        if (flag) {
            materials.remove(deleteIndex);
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Không tìm thấy tên sản phẩm!");
        }
    }

    public void deleteAll() {
        materials.removeAll(materials);
        System.out.println("Xóa thành công!");
    }

    public void updateMaterial(int choice, Scanner scanner) {
        if (choice > 2 || choice < 0) {
            System.out.println("Nhập lại lựa chọn");
        } else {
            System.out.print("Nhập STT vật liệu: ");
            int index = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập mã vật liệu: ");
            String id = scanner.nextLine();
            materials.get(index).setId(id);
            System.out.print("Nhập tên vật liệu: ");
            String name = scanner.nextLine();
            materials.get(index).setName(name);
            System.out.print("Nhập ngày sản xuất (Ngày.Tháng.Năm): ");
            LocalDate manufacturingDate = convertStringToLocalDate(scanner);
            materials.get(index).setManufacturingDate(manufacturingDate);
            System.out.print("Nhập giá: ");
            double cost = Double.parseDouble(scanner.nextLine());
            materials.get(index).setCost(cost);

            if (choice == 1) {
                System.out.print("Nhập số lượng: ");
                int quantity = Integer.parseInt(scanner.nextLine());
                ((CrispyFlour) materials.get(index)).setQuantity(quantity);
                System.out.println("Sửa thành công");
            } else {
                System.out.println("Nhập khối lượng: ");
                double weight = Double.parseDouble(scanner.nextLine());
                ((Meat) materials.get(index)).setWeight(weight);
                System.out.println("Sửa thành công");
            }
        }
    }

//    public void check(Scanner scanner) {
//        System.out.print("Nhập mã vật liệu: ");
//        String id = scanner.nextLine();
//        boolean flag = false;
//        int index = -1;
//        for (int i = 0; i < materials.size(); i++) {
//            if (materials.get(i).getId().equals(id)) {
//                flag = true;
//                index = i;
//                break;
//            }
//        }
//    }
    public void checkCost(Scanner scanner) {
        System.out.print("Nhập mã vật liệu: ");
        String id = scanner.nextLine();
        boolean flag = false;
        int index = -1;
        for (int i = 0; i < materials.size(); i++) {
            if (materials.get(i).getId().equals(id)) {
                flag = true;
                index = i;
                break;
            }
        }
        if (flag) {
            System.out.println("Giá của vật liệu có mã " + id + "là : " + materials.get(index).getAmount());
        } else System.out.println("Không có vật liệu thuộc mã " + id);

    }

    public void checkExpiryDate(Scanner scanner) {
        System.out.print("Nhập mã vật liệu: ");
        String id = scanner.nextLine();
        boolean flag = false;
        int index = -1;
        for (int i = 0; i < materials.size(); i++) {
            if (materials.get(i).getId().equals(id)) {
                flag = true;
                index = i;
                break;
            }
        }
        if (flag) {
            System.out.println("Hạn sử dụng của vật liệu có mã " + id + "là : " + materials.get(index).getExpiryDate());
        } else System.out.println("Không có vật liệu thuộc mã " + id);
    }

    public void display() {
        if (materials.isEmpty()) {
            System.out.println("Không có vật liệu trong danh sách");
        } else {
            for (Material material : materials) {
                if (material instanceof CrispyFlour) {
                    System.out.println(material);
                } else System.out.println(material);
            }
        }
    }
    private static LocalDate convertStringToLocalDate(Scanner scanner) {
        String str = scanner.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(str,dtf);
    }
}
