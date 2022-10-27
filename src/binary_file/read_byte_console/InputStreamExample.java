package binary_file.read_byte_console;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("src/text_file/sum_numbers_of_file/numbers.txt");

        int i = -1;

        while ((i = inputStream.read()) != -1) {
            if (i == 10) {
                System.out.println();
                continue;
            }
             System.out.print((char) i);

        }


        inputStream.close();
    }
}
