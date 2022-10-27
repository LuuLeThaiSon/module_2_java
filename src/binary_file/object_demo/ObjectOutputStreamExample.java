package binary_file.object_demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("src/binary_file/object_demo/product.txt"));
            Product product = new Product(1, "Iphone 12", 28000000, "new");
            oos.writeObject(product);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
        }

        System.out.println("success");
    }
}
