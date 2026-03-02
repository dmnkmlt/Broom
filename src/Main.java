public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Kia", 122.3, 5);
        Car car2 = new Car("Fiat", 94, 3);

        Motorbike motorbike1 = new Motorbike("Honda", 150.6, "A");
        Motorbike motorbike2 = new Motorbike("Suzuki", 188, "B");

        Vehicle[] vehicles = {car1, car2, motorbike1, motorbike2};

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

        for (Vehicle vehicle : vehicles) {
            vehicle.accelerate(5);
            System.out.println(vehicle);
        }
    }
}
