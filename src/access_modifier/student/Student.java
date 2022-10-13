package access_modifier.student;

public class Student {
    private String name = "John";
    private String classes = "C02";

    static int test0 = 1;

    public static void test(){
        System.out.println("test static method");
    };
    Student() {};

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String getClasses() {
        return this.classes;
    }
}
