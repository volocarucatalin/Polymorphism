package catalin;

public class Boats extends Vehicle {

    public Boats() {
        super("Water Surface");
    }

    @Override
    public void specifyOfVehicle() {
        System.out.println(getMake() + " "+getEngineSize() + " " +  getTypeOfVehicle() + "water vehicle you can drive on water surface");
    }

    @Override
    public void startEngine() {
        System.out.println("\nStart by key or by a push depends on the model and year of fabrication");
    }
}
