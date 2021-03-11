package L3_Inheritance_Exercises.P5_Restaurant.Food;

import java.math.BigDecimal;

public class MainDish extends Food{
    private double grams;

    public MainDish(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }
}
