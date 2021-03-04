package L3_Inheritance_Exercises.P6_Animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public String produceSound() {
        return "";
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.equals("")) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    private void setGender(String gender) {
        if (gender.equals("")) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(this.getClass().getSimpleName())
                .append(System.lineSeparator());
        stringBuilder.append(String.format("%s %d %s", this.getName(), this.getAge(), this.getGender()))
                .append(System.lineSeparator());
        stringBuilder.append(produceSound())
                .append(System.lineSeparator());

        return stringBuilder.toString().trim();
    }
}
