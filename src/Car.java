public class Car extends Vehicle {

    private int numOfDoors;

    public Car(String make, double speed, int numOfDoors) {
        super(make, speed);
        this.numOfDoors = numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfDoors() {
        return this.numOfDoors;
    }

    @Override
    public String toString() {
        return super.toString() + ", number of doors: " + this.numOfDoors;
    }
}
