package Assignment6_java8_2.src;

import java.util.Arrays;
import java.util.List;

public class Ques3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 7, 5, 9, 3, 8, 6);
        int sum = numbers.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of numbers greater than 5: " + sum);
    }
}