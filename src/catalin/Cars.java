package catalin;

public class Cars extends Vehicle  {
    public Cars() {
        super("Solid Surface");
    }

    @Override
    public void specifyOfVehicle() {
        System.out.println(getMake() + " " + getEngineSize()  + " " + getTypeOfVehicle() + "You can drive me solid surface");
    }

    @Override
    public void startEngine() {
        System.out.println("\nStarts on key or button depend on model of the car");
    }
}
