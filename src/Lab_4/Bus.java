package Lab_4;
/**
 * Додатковий підклас Bus успадковує клас Vehicle.
 */
public class Bus extends Vehicle {
    private int seats;

    public Bus(String brand, int year, int seats) {
        super(brand, year);
        System.out.println("Викликається конструктор Bus (підклас)");
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void printSeats() {
        System.out.println("Автобус " + getBrand() + " має кількість місць: " + seats);
    }
}