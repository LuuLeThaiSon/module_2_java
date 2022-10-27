package binary_file.data_input_output_demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestDataStream {
    public static void main(String[] args) throws Exception {
        try (DataOutputStream dataOutputStream = new DataOutputStream
                (new FileOutputStream("src/binary_file/data_input_output_demo/data.dat"))) {
            dataOutputStream.writeUTF("John");
            dataOutputStream.writeDouble(85.5);
            dataOutputStream.writeUTF("Jim");
            dataOutputStream.writeDouble(185.5);
            dataOutputStream.writeUTF("George");
            dataOutputStream.writeDouble(105.25);
        }

        try (DataInputStream dataInputStream = new DataInputStream
                (new FileInputStream("src/binary_file/data_input_output_demo/data.dat"))) {
            System.out.println(dataInputStream.readUTF() + " " + dataInputStream.readDouble());
            System.out.println(dataInputStream.readUTF() + " " + dataInputStream.readDouble());
            System.out.println(dataInputStream.readUTF() + " " + dataInputStream.readDouble());
        }
    }
}
