package catalin;

public class Car extends Vehicle  {
    public Car() {
        super("Solid Surface");
    }

    @Override
    public void displaySpecifications() {
        System.out.println(getModel() + " " + getEngineSize()  + " " + getTypeOfVehicle() + "You can drive me solid surface");
    }

    @Override
    public void startEngine() {
        System.out.println("\nStarts on key or button depend on model of the car");
    }
}
