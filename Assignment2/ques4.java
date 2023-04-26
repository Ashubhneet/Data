package Assignment2;

public class ques4{
    public static void main(String args[]){
        try{
            throw new second("Custom_expectation");
        }
        catch(second ex){
            System.out.println("caught");
            System.out.println(ex.getMessage());
        }
    }
}
