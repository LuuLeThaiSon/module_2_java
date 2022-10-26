import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    public static int xnxx(Scanner scanner){
        int a;
        try {
            System.out.println("nhap a");
            a = Integer.parseInt(scanner.nextLine());
            if (a < 0) {
                throw new Exception();
            }
            return a;

        } catch (Exception e) {
            System.out.println("khong hop le");
            return xnxx(scanner);
        }

    }

    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
////        System.out.println(xnxx(scanner));
//        int[] arr = {999999,6,4,1,213,55,212,765,234,8,2,3489,894,56234,3,6,8,5,2};
//
//        int max2 = arr[1];
//        int max1 = arr[1];
//
//        boolean flag = false;
//
//        for (int i = 2; i < arr.length; i++) {
//            if (max1 < arr[i]) {
//                max2 = max1;
//                max1 = arr[i];
//                flag = true;
//            }
//        }
//
//            if (max1 < arr[0]) {
//                if (max2 < arr[0]) max2 = max1;
//            }
//
//        System.out.println(max2);
//
////            if (!flag) {
////                if (arr[0] > arr[1]) {
////                    max2 = arr[1];
////                } else {
////                    max1 = arr[0];
////                }
////            } else {
////                max2 = max1;
////            }
////        }
//
////        System.out.println(max2);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.parse("2022-10-22");
        System.out.println(localDate1);
    }

}

