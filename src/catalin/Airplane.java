package catalin;

public class Airplane extends Vehicle {

    public Airplane() {
        super("Air Surface");
    }

    @Override
    public void specifyOfVehicle() {
        System.out.println(getMake()  + " " + getEngineSize() + " " + getTypeOfVehicle() + "a air vehicle you can fly whit it");
    }

    @Override
    public void startEngine() {
        System.out.println("\nIs start by key it's usually drive by two persons Pilot and Copilot ");
    }
}
