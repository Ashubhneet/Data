package Assignment3;

import Assignment3.cellularplan;

import java.util.Scanner;
public class phone_Bill 
{
	public static void main(String[] args) 
	{
	int minutes;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the network=");
	String planType = sc.nextLine();
	System.out.println("enter the minutes=");
	minutes = sc.nextInt();
	Select_Network_fact Network = new Select_Network_fact();
	cellularplan ep = Network.getPlan(planType);
	System.out.print("Bill amount for " + planType + " of " + minutes+" units is: ");
	ep.getRate();
	ep.processBill(minutes);
	}
}

