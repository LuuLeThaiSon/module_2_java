package text_file.copy_file;

public class Main {
    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        copyFile.writeFile(copyFile.readFile("src/text_file/copy_file/file.txt"), "src/text_file/copy_file/file_copy.txt");

    }

}
