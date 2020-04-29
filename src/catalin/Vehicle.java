package catalin;

public class Vehicle implements Drive, Specification {
    private final String typeOfVehicle;
    private String model;
    private double engineSize;

    public Vehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public String getModel() {
        return model;
    }

    public double getEngineSize() {
        return engineSize;
    }

    @Override
    public void displaySpecifications() {
        System.out.println(getEngineSize() + " " + getModel()+ " " + getTypeOfVehicle() + "  General vehicle no specification");
    }

    @Override
    public void startEngine() {
        System.out.println("Start engine for  " + model );
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop engine");
    }
}
