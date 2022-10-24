package mini_test_2.material;

import java.time.LocalDate;

public class CrispyFlour extends Material {
    int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, double cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return this.quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public String toString() {
        return "Bột chiên giòn {" +
                "Mã vật liệu: '" + super.getId() + '\'' +
                ", Tên vật liệu: '" + super.getName() + '\'' +
                ", Ngày sản xuất: " + super.getManufacturingDate() +
                ", Giá " + super.getCost() +
                ", Số lượng = " + this.quantity +
                '}';
    }
}
