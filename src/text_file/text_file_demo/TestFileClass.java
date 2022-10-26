package text_file.text_file_demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestFileClass {
    public static void main(String[] args) {
//        File file = new File("src/text_file/text_file_demo/img/debug_demo.png");
//        System.out.println("Does it exist? " + file.exists());
//        System.out.println("The file has " + file.length() + "bytes");
//        System.out.println("Can it be read? " + file.canRead());
//        System.out.println("Can it be written? " + file.canWrite());
//        System.out.println("Is it a directory? " + file.isDirectory());
//        System.out.println("Is it a file? " + file.isFile());
//        System.out.println("Is it absolute? " + file.isAbsolute());
//        System.out.println("is it hidden? " + file.isHidden());
//        System.out.println("Absolute path is " + file.getAbsolutePath());
//        System.out.println("Last modified on " + new Date(file.length()));

        try {
            File file1 = new File("src/text_file/text_file_demo/TJTECH-JD-SeniorDBA-2022.docx");
            FileReader reader = new FileReader(file1);

            BufferedReader bufferedReader = new BufferedReader(reader);

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
