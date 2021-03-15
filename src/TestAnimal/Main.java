package TestAnimal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animals animal = new Papagal("Brasilian", "Gogo", 12);
        animal.eat();
        animal.eat();
        System.out.println(animal.fly());
        System.out.println(animal.getFood());
    }
}
