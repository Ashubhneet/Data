package Assignment_1;

import java.util.Scanner;
import java.lang.Math;
public class assig3
{
    static float pie=22/7;
    public static void main(String[] args)
    {
        int opt;
        double r, c, a;
        Scanner sc = new Scanner(System.in);
        System.out.println("OPTION");
        System.out.println("1.Cal Area of Circle");
        System.out.println("2.Cal the circumference of Circle");
        System.out.println("3.Exit");
        System.out.print("Choose an opton (1-3) ");
        opt = sc.nextInt();
        switch (opt)
        {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                r = sc.nextDouble();
                a = (pie * (r * r));
                System.out.print("The area of the circle is: " + a);
                break;
            case 2:
                System.out.print("Enter the radius of the circle: ");
                r = sc.nextDouble();
                c = pie * (2 * r);
                System.out.print("The circumference of the circle is: " + c);
                break;
            case 3:
                System.out.println("No Solution");
                break;
            default:
                System.out.println("invalid choice!");
        }
    }
}
