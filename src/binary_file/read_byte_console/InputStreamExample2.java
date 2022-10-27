package binary_file.read_byte_console;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample2 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("src/text_file/sum_numbers_of_file/numbers.txt");

        byte[] bytes = new byte[10];

        int i = -1;

        while ((i = inputStream.read(bytes)) != -1) {
            String s = new String(bytes, 0, i);
            System.out.println(s);
        }

        inputStream.close();
    }
}
