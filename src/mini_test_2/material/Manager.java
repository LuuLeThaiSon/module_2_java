package mini_test_2.material;

import java.util.Scanner;

public class Manager{
    Scanner scanner = new Scanner(System.in);
    private Material[] materials;

    public Manager() {
        materials = new Material[0];
    }

    public void setMaterials(Material[] materials) {
        this.materials = materials;
    }

//    public Manager addMaterial() {
//        System.out.print("Add id: ");
//        String id = scanner.nextLine();
//
//        System.out.print("Add name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Add manufacturing date: ");
//        LocalDate manufacturingDate = LocalDate.parse(scanner.nextLine());
//
//        System.out.print("Add cost: ");
//        int cost = Integer.parseInt(scanner.nextLine());
//
//    }
}
