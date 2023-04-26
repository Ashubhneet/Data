package Assignment_1;

import java.util.Scanner;
import java.util.*;
import java.lang.*;
public class assig2
{
    public static void main(String args[])
    {
        List<String> user=new ArrayList<>();
        System.out.println("Enter your data below(send XDONE to exit)");
        Scanner input=new Scanner(System.in);
        while(true)
        {
            String line=input.nextLine();
            if("XDONE".equalsIgnoreCase(line))
            {
                break;
            }
            user.add(line);}
        System.out.println(user);
    }
}