package catalin;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Cars();
        Vehicle boat = new Boats();
        Vehicle airplane = new Airplane();


        car.setEngineSize(2.0);
        car.setMake("Opel Astra");
        car.startEngine();
        car.specifyOfVehicle();

        boat.setMake("Cuddy Cabin");
        boat.setEngineSize(2.5);
        boat.startEngine();
        boat.specifyOfVehicle();

        airplane.setEngineSize(75.6 );
        airplane.setMake("Gulfstream G650");
        airplane.startEngine();
        airplane.specifyOfVehicle();



    }
}
