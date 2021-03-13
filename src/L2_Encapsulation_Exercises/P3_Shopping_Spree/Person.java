package L2_Encapsulation_Exercises.P3_Shopping_Spree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

//+ 	L4_Interfaces_and_Abstraction_Exercises.P1_Define_an_Interface_Person.Person (String ,  double)

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        Validator.validName(name);
        this.name = name;
    }

    private void setMoney(double money) {
        Validator.validMoney(money);
        this.money = money;
    }

    public void buyProduct(Product product) {

        if (!hasEnoughMoney(product)) {
            throw new IllegalArgumentException(String.format("%s can't afford %s" ,
                    this.name,
                    product.getName()));
        }

        this.money -= product.getCost();
        this.products.add(product);
    }

    private boolean hasEnoughMoney(Product product) {
        return this.money >= product.getCost();
    }
}
