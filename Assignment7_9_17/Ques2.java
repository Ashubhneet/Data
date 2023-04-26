package Assignment7_9_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        List<Integer> result1 = list.stream().takeWhile(n -> n < 5).toList();
        System.out.println(result1);

        List<Integer> result2 = list.stream().dropWhile(n -> n < 5).toList();
        System.out.println(result2);
    }


}