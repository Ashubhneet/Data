package Assignment7_9_17;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ques7 {
    public static void main(String[] args) {
        List<String> myList = List.of("apple","banana","cherry");
        Set<String> mySet = Set.of("apple","banana","cherry");
        Map<Integer,String> myMap = Map.of(1,"apple",2,"banana",3,"cherry");


        System.out.println(myList + "\n "+mySet + " \n "+ myMap);

    }
}