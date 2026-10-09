package Lab_4;

/**
 * Головний клас для запуску та перевірки роботи програми.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Порядок виклику конструкторів");
        Car car = new Car("Toyota", 2022, 5);
        System.out.println();

        System.out.println("Створення об'єктів інших підкласів");
        Motorcycle motorcycle = new Motorcycle("Honda", 2021, false);
        System.out.println();
        Bus bus = new Bus("Volvo", 2020, 45);
        System.out.println();

        System.out.println("Демонстрація успадкованих та власних методів");

        // Автомобіль
        car.printBasicInfo();      // Успадкований метод
        car.openTrunk();           // Власний метод
        car.printCarBrandExplicitly(); // Використання геттера суперкласу
        System.out.println();

        // Мотоцикл
        motorcycle.printBasicInfo(); // Успадкований метод
        motorcycle.printSidecarInfo(); // Власний метод
        System.out.println();

        // Автобус
        bus.printBasicInfo();        // Успадкований метод
        bus.printSeats();            // Власний метод
    }
}