package Assignment7_9_17;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ques9 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange");
        List<String> unmodifiableList = list.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        Collections::unmodifiableList));
        System.out.println("Original List: " + list);
        System.out.println("Unmodifiable List: " + unmodifiableList);


        try {
            unmodifiableList.add("grape");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify unmodifiable list!");
        }

    }
}
