package TestAnimal;

public abstract class Animals implements Flyble, Eatble {
    String type;
    int food;

    public Animals(String type, int food) {
        this.setType(type);
        this.setFood(food);
    }

    public String getType() {
        return this.type;
    }

    private void setType(String type) {
        this.type = type;
    }

    public int getFood() {
        return food;
    }

    private void setFood(int food) {
        this.food = food;
    }

    @Override
    public abstract int eat();

    @Override
    public String fly() {
        return "Birds fly!";
    }
}
