package text_file.find_max;

import java.util.List;

public class Main {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

        List<Integer> numbers = readAndWriteFile.readFile("src/text_file/find_max/numbers.txt");

        int maxValue = findMax(numbers);

        readAndWriteFile.writeFile("src/text_file/find_max/numbers.txt", maxValue);
    }
}
