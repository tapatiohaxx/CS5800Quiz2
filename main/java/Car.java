import java.util.Random;

public class Car extends Vehicle implements Observer {
    private int weight;
    private int gasLevel;
    private boolean isHybrid;
    public Car() {
        weight = this.weight;
        gasLevel = this.gasLevel;
        isHybrid = this.isHybrid;
    }

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

    private void isThisaHybrid() {
        if (isHybrid) {
            System.out.println("This is a hybrid car.");
        } else {
            System.out.println("This is a non-hybrid car.");
        }
    }

    @Override
    public void update(String colorOfLight) {
        switch (colorOfLight) {
            case "Color.GREEN":
                System.out.println("Car " + Color.GREEN.toString() + " moves forward.");
                break;
            case "Color.YELLOW":
                System.out.println("Car " + Color.YELLOW.toString() + " slows down.");
                break;
            case "Color.RED":
                System.out.println("Car " + Color.RED.toString() + " stops.");

                break;
            default:
                break;
        }
    }
    private void pauseAndGo() {
        try {
            Random lightTime = new Random();
            int delay = lightTime.nextInt(5000) + 100; // random delay between 1000 and 6000 milliseconds
            System.out.println("the light is " + Color.RED.toString() + " the carwill wait for " + delay + " seconds.");
            Thread.sleep(delay);
            System.out.println("The Light is " + Color.GREEN.toString() + "the car  moves forward after waiting.");
        } catch (InterruptedException e) {
            System.err.println("ERROR!.");
        }
    }

}
