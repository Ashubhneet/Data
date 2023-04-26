package Assignment3;

public class Singleobj
{
private static Singleobj instance = new Singleobj();
private Singleobj(){}
public static Singleobj getinstance()
{
return instance;
}
 public void showMessage()
{
System.out.println("Singleton Factory");
}
}
