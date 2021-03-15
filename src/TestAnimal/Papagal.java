package TestAnimal;

public class Papagal extends  Animals{
    String name;
    int age;

    public Papagal(String type, String name, int age) {
        super(type, 0);
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public int getFood() {
        return food;
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public String fly() {
        return "Papagal can't fly";
    }

    @Override
    public int eat() {
        return this.food += 20;
    }
}
