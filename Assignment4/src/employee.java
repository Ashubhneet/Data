import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class employee implements Comparable<employee>{

        private String Name;
        private int age;
        private Double Salary;

    public employee(String name, Integer age, Double salary) {
       this. Name = name;
        this.age = age;
       this. Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    @Override
    public int compareTo(employee e) {
        return this.getName().compareTo((e.getName()));
    }

    @Override
    public String toString() {
        return "employee{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", Salary=" + Salary +
                '}'+"\n";
    }

public static void main(String[] args)
{
    ArrayList<employee> emp=new ArrayList<>();
    emp.add(new employee("Shubhneet",23,15100.0));
    emp.add(new employee("Himannshu",24,14800.0));
    emp.add(new employee("Shefali",23,25000.0));
    emp.add(new employee("Tanvi",23,40000.0));
    Comparator<employee> com=new Comparator<employee>(){
        @Override
        public int compare(employee o1, employee o2) {
            if (o1.getSalary() > o2.getSalary()) {
                return 1;
            } else return -1;
        }
    };
    System.out.println("Sort acc to salary");
    Collections.sort(emp,com);
    System.out.println(emp);
    System.out.println("Sort accordingg to Name:");
    Collections.sort(emp);
    System.out.println(emp);}}
