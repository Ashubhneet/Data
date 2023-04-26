package Assignment6_java8_2.src;

import java.util.Optional;

public class Ques4 {
    private String make;
    private String model;
    private Optional<Integer> year;

    public Ques4(String make, String model, Integer year) {
        this.make = make;
        this.model = model;
        this.year = Optional.ofNullable(year);
    }

    public String getDescription(){
        if (year.isPresent()){
            return year.get() + " " + make + " " + model;
        }else{
            return make + " " + model;
        }
    }

    public static void main(String[] args) {
        Ques4 car1 = new Ques4("Ford","endeavour",2007);
        Ques4 car2 = new Ques4("TATA","Fortuner",2017);

        System.out.println(car1.getDescription());
        System.out.println(car2.getDescription());
    }
}
