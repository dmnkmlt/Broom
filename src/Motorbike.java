public class Motorbike extends Vehicle {

    private String type;

    public Motorbike(String make, double speed, String type) {
        super(make, speed);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", type: " + this.type;
    }
}
