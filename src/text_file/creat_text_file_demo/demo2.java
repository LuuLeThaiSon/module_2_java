package text_file.creat_text_file_demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("src/text_file/creat_text_file_demo/Hello.txt");
            fileWriter.write("Hello Hello");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader("src/text_file/creat_text_file_demo/Hello.txt");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

