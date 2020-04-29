package catalin;

public class Vehicle implements Start, Specification {
    private String typeOfVehicle;
    private String make;
    private double engineSize;



    public Vehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public String getMake() {
        return make;
    }

    public double getEngineSize() {
        return engineSize;
    }

    @Override
    public void specifyOfVehicle() {
        System.out.println(getEngineSize() + " " + getMake()+ " " + getTypeOfVehicle() + "  General vehicle no specification");
    }

    @Override
    public void startEngine() {
        System.out.println("All vehicle have function start");
    }
}
