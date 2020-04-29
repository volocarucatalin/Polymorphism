package catalin;

public class Boat extends Vehicle {

    public Boat() {
        super("Water Surface");
    }

    @Override
    public void displaySpecifications() {
        System.out.println(getModel() + " "+getEngineSize() + " " +  getTypeOfVehicle() + "water vehicle you can drive on water surface");
    }

    @Override
    public void startEngine() {
        System.out.println("\nStart by key or by a push depends on the model and year of fabrication");
    }
}
