package L5_Polymorphism_Exercises.P3_Wild_Farm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal{
    private String livingRegion;

    protected Mammal(String animalType, String animalName, double animalWeight, String livinigRegion) {
        super(animalType, animalName, animalWeight);
        this.livingRegion = livinigRegion;
    }

    public String getLivingRegion() {
        return this.livingRegion;
    }

    @Override
    public void eat(Food food) {
        super.setFoodEaten(food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %d]",
                this.getClass().getSimpleName(),
                this.getAnimalName(),
                decimalFormat.format(this.getAnimalWeight()),
                this.getLivingRegion(),
                this.getFoodEaten());

    }
}
