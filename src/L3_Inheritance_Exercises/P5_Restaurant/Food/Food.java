package L3_Inheritance_Exercises.P5_Restaurant.Food;

import L3_Inheritance_Exercises.P5_Restaurant.Product;

import java.math.BigDecimal;

public class Food extends Product {
    private double grams;

    public Food(String name, BigDecimal price, double grams) {
        super(name, price);
        this.grams = grams;
    }

    public double getGrams() {
        return this.grams;
    }
}
