package debug_demo.try_catch;

import java.util.Random;

public class ArrayExample {
    public Integer[] creatRandom() {
        Random random = new Random();
        Integer[] arr = new Integer[100];

        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        return arr;
    }
}
