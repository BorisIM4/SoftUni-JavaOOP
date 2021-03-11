package L5_Polymorphism_Exercises.P2_Vehicles_Extension;

import java.text.DecimalFormat;

public class Vehicle implements IVehicle {
    private double fuelQuantity;
    private double fuelConsumption ;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.setFuelConsumption(fuelConsumption);
        this.setTankCapacity(tankCapacity);
    }

    private void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String drive(double distance){
        double fuelNeed = distance * this.fuelConsumption;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = "needs refueling";

        if (this.fuelQuantity > fuelNeed) {
            result = String.format("travelled %s km",decimalFormat.format(distance));
            this.fuelQuantity -= fuelNeed;
        }

        return result;
    }

    @Override
    public void refuel(double liters) {
        if (liters <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        if (this.fuelQuantity + liters > this.tankCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity += liters;

    }

    @Override
    public String toString() {
        return String.format("%s: %.2f" ,this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
