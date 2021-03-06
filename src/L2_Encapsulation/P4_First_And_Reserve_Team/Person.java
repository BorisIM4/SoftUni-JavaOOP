package L2_Encapsulation.P4_First_And_Reserve_Team;

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
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    private void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public double getSalary() {
        return this.salary;
    }

    private void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        double bonusMoney = countBonusMoney(bonus);

        if (this.age < 30) {
            bonusMoney = bonusMoney / 2;
        }

        double newSalary = bonusMoney + this.getSalary();
        this.salary = newSalary;

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
