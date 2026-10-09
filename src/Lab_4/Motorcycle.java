package Lab_4;
/**
 * Підклас Motorcycle успадковує клас Vehicle.
 */
public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        System.out.println("Викликається конструктор Motorcycle (підклас)");
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void printSidecarInfo() {
        if (hasSidecar) {
            System.out.println("Мотоцикл " + getBrand() + " має коляску.");
        } else {
            System.out.println("Мотоцикл " + getBrand() + " без коляски.");
        }
    }
}