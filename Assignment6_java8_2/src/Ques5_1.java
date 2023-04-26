package Assignment6_java8_2.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ques5_1 {
    public static void main(String[] args) {
        List<Ques5> list = new ArrayList<>();
        list.add(new Ques5("John Doe",4000l,"Delhi"));
        list.add(new Ques5("Jane Smith",6000l,"Delhi"));
        list.add(new Ques5("Alice Williams",3000l,"Delhi"));
        list.add(new Ques5("Charlie Brown",4500l,"Delhi"));

        Set<String> unique = list.stream().filter(e -> e.getSalary() < 5000 && e.getCity().equals("Delhi"))
                .map(e -> e.getFullName().split(" ")[0])
                .collect(Collectors.toSet());
        System.out.println(unique);
    }
}