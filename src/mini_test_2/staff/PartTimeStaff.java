package mini_test_2.staff;

import java.io.Serializable;

public class PartTimeStaff extends Staff implements Serializable {
    private float workHour; //luong gio
    private final int CONST = 100000;

    public PartTimeStaff() {
    }

    public PartTimeStaff(String id, String name, int age, String phoneNumber, String email, float hourlyWages) {
        super(id, name, age, phoneNumber, email);
        this.workHour = hourlyWages;
    }

    public float getWorkHour() {
        return workHour;
    }

    public void setWorkHour(float workHour) {
        this.workHour = workHour;
    }

    public int getCONST() {
        return CONST;
    }

    @Override
    public double netSalary() {
        return getWorkHour() * CONST;
    }

    @Override
    public String toString() {
        return "PartTimeStaff{" +
                super.toString() +
                "net salary=" + netSalary() +
                '}';
    }
}
