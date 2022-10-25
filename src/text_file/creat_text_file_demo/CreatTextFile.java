package text_file.creat_text_file_demo;

import java.io.File;
import java.io.IOException;

public class CreatTextFile {
    public static void main(String[] args) {
        try {
            File file = new File("src/text_file/creat_text_file_demo/newFile.txt");
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
