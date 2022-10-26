package text_file.sum_numbers_of_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Sum {
    public static void main(String[] args) {
        readFile("src/text_file/sum_numbers_of_file/numbers.txt");
    }

    public static void readFile(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line = "";
            int sum = 0;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }

            System.out.println("sum = " + sum);
            reader.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}
