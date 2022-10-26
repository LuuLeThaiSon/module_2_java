package text_file.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public List<String> readFile(String filePath) {
        List<String> fileDemo = new ArrayList<>();

        try {
            File file = new File(filePath);

            if (!file.exists()) {
                file.createNewFile();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                fileDemo.add(line);
            }

            bufferedReader.close();

        } catch (Exception e) {
            System.out.println();
        }

        return fileDemo;
    }

    public void writeFile(List<String> str, String filePath) {

        try {
            File file = new File(filePath);

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

            for (int i = 0; i < str.size(); i++) {
                bufferedWriter.write(str.get(i) + "\n");
//                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println();
        }
    }
}
