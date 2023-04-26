package Assignment_1;

public class employee
{
    String fname = "Shubhneet",lname = "Aggarwal",designation="Trainee";
    int age = 23;
    public employee()
    {}
    public employee(String fname,String lname, String designation, int age)
    {
        this.fname = fname;
        this.lname = lname;
        this.designation = designation;
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Assignment_1.employee{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", designation='" + designation + '\'' +
                ", age=" + age +
                '}';
    }
    public static void main(String[] args){
        employee sh = new employee();
        sh.setFname("shubh");
        sh.setLname("agg");
        sh.setDesignation("developer");
        sh.setAge(25);

        System.out.println(sh.toString());
    }
}
