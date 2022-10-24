package debug_demo.try_catch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.creatRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = Integer.parseInt(scanner.nextLine());


        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException exception) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }


}
