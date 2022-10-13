import access_modifier.student.Student;

public class Test {
    void method(char x, int y, int[] arr) {
        x = 'a';
        y = 5;
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        Test o = new Test();
        char  x = 'b';
        int y = 1;
        int[] arr = {0,0};
        o.method(x, y, arr);
        System.out.println("-----------------");
        System.out.println(x);
        System.out.println(y);
        System.out.println(arr[0] + "," + arr[1]);

    }
}

