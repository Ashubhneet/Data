package Assignment7_9_17;

import java.util.Optional;

public class Ques5 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello world");
        optional.ifPresentOrElse(
                str -> System.out.println(str),
                () -> System.out.println("no value")
        );
        Optional<String> emptyOptional = Optional.empty();
        emptyOptional.ifPresentOrElse(
                str -> System.out.println(str),
                () -> System.out.println("no value")
        );

    }
}