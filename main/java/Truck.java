public class Truck extends Vehicle{

    private int weight;
    private int gasLevel;
    private boolean isSemiTruck;

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
    private void isThisaSemiTruck() {
        if (isSemiTruck) {
            System.out.println("This is a semi-truck.");
        } else {
            System.out.println("This is a non-semi-truck.");
        }
    }
}
