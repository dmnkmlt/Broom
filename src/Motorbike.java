public class Motorbike extends Vehicle {

    private String type;

    public Motorbike(String make, double speed, String type) {
        super(make, speed);
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return super.toString() + ", type: " + this.type;
    }
}
