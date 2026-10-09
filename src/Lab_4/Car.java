package Lab_4;
/**
 * Підклас Car успадковує клас Vehicle.
 */
public class Car extends Vehicle {
    private int doors;

    public Car(String brand, int year, int doors) {
        // Виклик конструктора суперкласу має бути першим оператором
        super(brand, year);
        System.out.println("Викликається конструктор Car (підклас)");
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void openTrunk() {
        System.out.println("Багажник автомобіля " + getBrand() + " відкрито.");
    }

    public void printCarBrandExplicitly() {
        // System.out.println(brand); // ПОМИЛКА КОМПІЛЯЦІЇ: brand has private access in Vehicle
        // Доступ здійснюється через публічний геттер:
        System.out.println("Марка авто (через getBrand()): " + getBrand());
    }
}