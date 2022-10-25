package mini_test_2.staff;

public abstract class Staff implements Comparable<Staff> {
    private String id;
    private String name;
    private int age;
    private String phoneNumber;
    private String email;

    public Staff() {
    }

    public Staff(String id, String name, int age, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract double netSalary();

    @Override
    public int compareTo(Staff o) {
        if (o.netSalary() < this.netSalary()) {
            return 1;
        } else if (o.netSalary() == this.netSalary()) {
            return 0;
        } else return -1;
    }

    @Override
    public String toString() {
        return  "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", ";
    }

}
