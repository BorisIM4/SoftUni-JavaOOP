package L4_Interfaces_and_Abstraction_Exercises.P5_Тelephony;

import java.util.List;

public class Smartphone {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }
}
