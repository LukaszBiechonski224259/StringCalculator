package org.example;


import java.util.Objects;

public class StringDigitSum {
   private String numbers;

    public StringDigitSum(String numbers) {
        this.numbers = numbers;
    }

    public int Add (String numbers){
        if(Objects.equals(numbers, "")) return 0;
        else if(numbers.length() > 2) {
            int first = Integer.parseInt(String.valueOf(numbers.charAt(0)));
            int second = Integer.parseInt(String.valueOf(numbers.charAt(2)));
            return first + second;
        }
        else
        return Integer.parseInt(String.valueOf(numbers.charAt(0)));


    }

    public String getNumbers() {
        return numbers;
    }
}
