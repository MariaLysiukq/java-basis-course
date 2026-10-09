package Lab_4;
/**
 * Базовий клас (суперклас) для всіх транспортних засобів.
 * Містить спільні поля та методи
 */
public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        System.out.println("Викликається конструктор Vehicle (суперклас)");
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void printBasicInfo() {
        System.out.println("Транспортний засіб: " + brand + ", Рік випуску: " + year);
    }
}