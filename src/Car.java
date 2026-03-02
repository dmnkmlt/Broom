public class Car extends Vehicle {

    private int numOfDoors;

    public Car(String make, double speed, int numOfDoors) {
        super(make, speed);
        this.numOfDoors = numOfDoors;
    }

    @Override
    public String toString() {
        return super.toString() + ", number of doors: " + this.numOfDoors;
    }
}
