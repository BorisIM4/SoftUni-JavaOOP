package L5_Polymorphism_Exercises.P2_Vehicles_Extension;

public class Bus extends Vehicle {

    private static final boolean DEFAULT_IS_EMPTY = true;
    private boolean isEmpty;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        setIsEmpty(DEFAULT_IS_EMPTY);
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        if (!this.isEmpty) {
            super.setFuelConsumption(fuelConsumption + 1.40);
        }
    }

    @Override
    public String drive(double distance) {
        return "Bus " + super.drive(distance);
    }
}
