package Assignment_1;

public class assg1
{
    static String FName,LName;
    static int Age;
    static {
        FName="JAVA";
        LName="ASSIGNMENT";
        Age=1;
    }
    static void show() {
        System.out.println("FName="+FName);
        System.out.println("LName="+LName);
        System.out.println("Age="+Age);
    }
    public static void main(String[] args)
    {
        assg1 s=new assg1();
        s.show();
    }
}