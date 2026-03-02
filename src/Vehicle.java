public abstract class Vehicle implements Accelerate{

    private String make;
    private double speed;

    public Vehicle(String make, double speed) {
        this.make = make;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Make: " + this.make + ", speed: " + this.speed;
    }

    public void accelerate(double speedIncrease){
        this.speed += speedIncrease;
    }
}
