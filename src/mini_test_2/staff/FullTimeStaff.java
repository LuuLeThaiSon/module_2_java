package mini_test_2.staff;

import java.io.Serializable;

public class FullTimeStaff extends Staff implements Serializable {
    private double bonus = 0; //thuong
    private double penalty = 0; //phat
    private double hardSalary; //luong cung

    public FullTimeStaff() {
    }

    public FullTimeStaff(String id, String name, int age, String phoneNumber, String email, double hardSalary) {
        super(id, name, age, phoneNumber, email);
        this.hardSalary = hardSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }

    @Override
    public double netSalary() {
        return (getHardSalary() + (getBonus() - getPenalty()));
    }

    @Override
    public String toString() {
        return "FullTimeStaff{" +
                super.toString() +
                "bonus=" + bonus +
                ", penalty=" + penalty +
                ", net salary=" + netSalary() +
                '}';
    }
}
