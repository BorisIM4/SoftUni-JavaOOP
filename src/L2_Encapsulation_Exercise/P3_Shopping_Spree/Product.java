package L2_Encapsulation_Exercise.P3_Shopping_Spree;

public class Product {
//+ 	Product (String,  double)
//-	setCost (double): void
//-	setName (String): void
//+	getName(): String
//+	getCost (): double

    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.setName(name);
        this.setCost(cost);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        Validator.validName(name);
        this.name = name;
    }

    public double getCost() {
        return this.cost;
    }

    private void setCost(double cost) {
        Validator.validMoney(cost);
        this.cost = cost;
    }
}
