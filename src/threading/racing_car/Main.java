package threading.racing_car;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

        Thread thread1 = new Thread(carA);
        Thread thread2 = new Thread(carB);
        Thread thread3 = new Thread(carC);

        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
