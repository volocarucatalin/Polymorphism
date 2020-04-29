package catalin;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();
        Airplane airplane = new Airplane();


        car.setEngineSize(2.0);
        car.setModel("Opel Astra");
        controlVehicle(car);

        boat.setModel("Cuddy Cabin");
        boat.setEngineSize(2.5);
        controlVehicle(boat);

        airplane.setEngineSize(75.6);
        airplane.setModel("Gulfstream G650");
        controlVehicle(airplane);


    }

    public static void controlVehicle(Vehicle vehicle) {
        vehicle.startEngine();
        vehicle.displaySpecifications();
        vehicle.stopEngine();
    }
}
