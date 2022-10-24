package mini_test_2.material;

import java.util.Scanner;

public class MaterialSystem {
    private final Scanner scanner;
    
    private final MaterialManager materialManager;

    public MaterialSystem() {
        this.scanner = new Scanner(System.in);
        this.materialManager = new MaterialManager();
    }


    public void materialMenu() {
        do {
            System.out.println("----------MENU----------");
            System.out.println("1. Thêm vật liệu");
            System.out.println("2. Sửa vật liệu");
            System.out.println("3. Xóa vật liệu");
            System.out.println("4. Kiểm tra giá vật liệu");
            System.out.println("5. In danh sách vật liệu");
            System.out.println("6. Chênh lệch chiết khấu hôm nay");
            System.out.println("7. Kiểm tra hạn sử dụng");
            System.out.println("0. Thoát");

            System.out.print("Nhập lựa chọn: ");
            int choice1 = Integer.parseInt(scanner.nextLine());

            switch (choice1) {
                case 1:
                    addMaterialMenu();
                    break;
                case 2:
                    updateMaterialMenu();
                    break;
                case 3:
                    deleteMaterialMenu();
                    break;
                case 4:
                    materialManager.checkCost(scanner);
                    break;
                case 5:
                    materialManager.display();
                    break;
                case 6:
                case 7:
                    materialManager.checkExpiryDate(scanner);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    public void addMaterialMenu() {
        do {
            System.out.println("Chọn loại vật liệu");
            System.out.println("1. Bột chiên giòn");
            System.out.println("2. Thịt");
            System.out.println("0. Thoát");

            System.out.print("Nhập lựa chọn: ");
            int choice2 = Integer.parseInt(scanner.nextLine());

            if (choice2 == 0) {
                break;
            } else materialManager.addMaterial(choice2, scanner);
        } while (true);
    }

    public void updateMaterialMenu() {
        do {
            System.out.println("Chọn loại vật liệu");
            System.out.println("1. Bột chiên giòn");
            System.out.println("2. Thịt");
            System.out.println("0. Thoát");

            System.out.print("Nhập lựa chọn: ");
            int choice2 = Integer.parseInt(scanner.nextLine());

            if (choice2 == 0) {
                break;
            } else materialManager.updateMaterial(choice2, scanner);
        } while (true);
    }

    public void deleteMaterialMenu() {
        do {
            System.out.println("1. Xóa theo mã vật liệu");
            System.out.println("2. Xóa theo tên vật liệu");
            System.out.println("3. Xóa toàn bộ");
            System.out.println("0. Thoát");

            System.out.print("Nhập lựa chọn: ");
            int choice3= Integer.parseInt(scanner.nextLine());

            if (choice3 == 0) {
                break;
            } else materialManager.deleteMaterial(choice3, scanner);
        } while (true);
    }
}
