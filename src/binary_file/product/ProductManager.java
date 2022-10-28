package binary_file.product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void writeFile(String filePath, List<Product> products) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));

            objectOutputStream.writeObject(products);
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Product> readFile(String filePath) {
        List<Product> products = new ArrayList<>();

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));

            products = (List<Product>) objectInputStream.readObject();

            objectInputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return products;
    }

    public void add(Scanner scanner) {
        try {
            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Brand: ");
            String brand = scanner.nextLine();
            System.out.print("Price: ");
            long price = Long.parseLong(scanner.nextLine());
            System.out.print("description: ");
            String description = scanner.nextLine();
            products.add(new Product(id, name, brand, price, description));


        } catch (Exception e) {
            System.err.println("Errol");
        }



        writeFile("src/binary_file/product/product.txt", products);
    }

    public void update(Scanner scanner) {
        System.out.print("ID: ");
        String id = scanner.nextLine();

        for (Product product : products) {
            if (product.getId().equals(id)) {
                try {
                    System.out.print("New name: ");
                    String name = scanner.nextLine();
                    if (!name.equals("")) {
                        product.setName(name);
                    }

                    System.out.print("New brand: ");
                    String brand = scanner.nextLine();
                    if (!brand.equals("")) {
                        product.setBrand(brand);
                    }

                    System.out.print("New Price: ");
                    Long price = Long.parseLong(scanner.nextLine());
                    if (!price.equals("")) {
                        product.setPrice(price);
                    }

                    System.out.print("New Description: ");
                    String description = scanner.nextLine();
                    if (!description.equals("")){
                        product.setDescription(description);
                    }

                } catch (Exception e) {
                    System.err.println("Error");
                }
            }
        }

        writeFile("src/binary_file/product/product.txt", products);
    }

    public void delete(Scanner scanner) {
        System.out.print("ID: ");
        String id = scanner.nextLine();

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(id)) {
                products.remove(i);
                break;
            }
        }
        writeFile("src/binary_file/product/product.txt", products);
    }

    public void display() {
        products = readFile("src/binary_file/product/product.txt");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
