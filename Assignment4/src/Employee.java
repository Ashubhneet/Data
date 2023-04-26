import java.util.HashMap;

public class Employee {
    String name;
    int age;
    String des;
    public Employee(String name, int age, String des) {
        this.name = name;
        this.age = age;
        this.des = des;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", des='" + des;
    }
    public static void main(String[] args) {
        HashMap<Employee, Integer> hash = new HashMap<>();
        hash.put(new Employee("Shubhneet", 23, "Trainee"), 283);
        System.out.println(hash.keySet());
        System.out.print(hash.values());    }}
