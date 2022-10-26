package text_file.creat_text_file_demo;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("Hello00.txt");
        System.out.println(file.exists());
    }
}
