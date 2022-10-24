package mini_test_2.material;

import java.time.LocalDate;

public class Meat extends Material {
    private double weight;

    public Meat() {
    }

    public Meat(String id, String name, LocalDate manufacturingDate, double cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return getCost() * this.weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public String toString() {
        return "Thịt {" +
                "Mã vật liệu: '" + super.getId() + '\'' +
                ", Tên vật liệu: '" + super.getName() + '\'' +
                ", Ngày sản xuất: " + super.getManufacturingDate() +
                ", Giá " + super.getCost() +
                ", Khối lượng = " + this.weight +
                '}';
    }
}
