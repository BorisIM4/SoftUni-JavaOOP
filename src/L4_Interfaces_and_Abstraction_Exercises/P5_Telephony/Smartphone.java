package L4_Interfaces_and_Abstraction_Exercises.P5_Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.setNumbers(numbers);
        this.setUrls(urls);
    }

    private void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    private void setUrls(List<String> urls) {
        this.urls = urls;
    }

    private static boolean isAllDigitsInNumber(String number) {
        boolean digit = true;
        for (int index = 0; index < number.length(); index++) {
            char currentChar = number.charAt(index);
            digit = Character.isDigit(currentChar);
            if (!digit) {
                return digit;
            }
        }

        return digit;
    }

    private static boolean isCorrectUrl(String url) {
        boolean correctSymbol = true;
        for (int index = 0; index < url.length(); index++) {
            char currentCaht = url.charAt(index);
            if (Character.isDigit(currentCaht)) {
                correctSymbol = false;
                return correctSymbol;
            }
        }

        return correctSymbol;
    }

    @Override
    public String call() {
        StringBuilder stringBuilder = new StringBuilder();

        for (String number : this.numbers) {
            if (isAllDigitsInNumber(number)) {
                stringBuilder.append("Calling... ").append(number)
                        .append(System.lineSeparator());
            } else {
                stringBuilder.append("Invalid number!")
                        .append(System.lineSeparator());
            }
        }

        return stringBuilder.toString().trim();
    }

    @Override
    public String browse() {
        StringBuilder stringBuilder = new StringBuilder();

        for (String url : this.urls) {
            if (isCorrectUrl(url)) {
                stringBuilder.append("Browsing: ").append(url).append("!")
                        .append(System.lineSeparator());
            } else {
                stringBuilder.append("Invalid URL!")
                        .append(System.lineSeparator());
            }
        }

        return stringBuilder.toString().trim();
    }
}
