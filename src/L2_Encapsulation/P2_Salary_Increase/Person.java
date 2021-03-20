package L2_Encapsulation.P2_Salary_Increase;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getFirstName() {
        return this.firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return this.salary;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        double bonusMoney = countBonusMoney(bonus);

        if (this.age < 30) {
            bonusMoney = bonusMoney / 2;
        }

        double newSalary = bonusMoney + this.getSalary();
        this.setSalary(newSalary);

    }

    private double countBonusMoney(double bonus) {
        return this.getSalary() * bonus / 100;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva",
                getFirstName(),
                getLastName(),
                getSalary());
    }
}
