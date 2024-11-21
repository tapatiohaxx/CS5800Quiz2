// Motorcycle.java
public class Motorcycle extends Vehicle {
    private int gasLevel;
    private int weight;
    private boolean hasSidecar;

    // Constructor
    public Motorcycle(int gasLevel, int weight, boolean hasSidecar) {
        this.gasLevel = gasLevel;
        this.weight = weight;
        this.hasSidecar = hasSidecar;
    }

    // Implementing the abstract methods of Vehicle
    @Override
    public void move() {
        System.out.println("The motorcycle is moving.");
    }

    @Override
    public void honk() {
        System.out.println("The motorcycle is honking. Beep Beep!");
    }

    @Override
    public void getGasLevel() {
        System.out.println("The motorcycle's gas level is: " + gasLevel + " liters.");
    }

    @Override
    public void getWeight() {
        System.out.println("The motorcycle's weight is: " + weight + " kg.");
    }

    // Getter and Setter for hasSidecar
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    // Method to display motorcycle details
    public void displayInfo() {
        System.out.println("Gas Level: " + gasLevel + " liters");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}