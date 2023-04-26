package Assignment7_9_17;

import java.util.stream.Stream;

public class Ques4 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(0, n -> n + 2);
        stream.limit(10).forEach(System.out::println);

    }
}
