package Assignment3;

import Assignment2.ques2;

import java.io.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Scanner;
class ques2b extends ques2
{
	public static void main(String[] args) throws IOException
{
	ArrayList<ques2> Userlist=new ArrayList<>();
	String txt;
	FileWriter file = new FileWriter("/home/shubhneet/Desktop/Assignment3/shubh.txt");
	BufferedWriter br = new BufferedWriter(file);
	// int i=0;
	Scanner sc = new Scanner(System.in);
	while (true)
		{
		ques2 u= new ques2();
		Userlist.add(u);
		System.out.print("Enter First Name=");
		u.FirstName = sc.next();
		br.append(u.FirstName);
		br.append(" ");
		System.out.println("Enter Last Name=");
		u.LastName = sc.next();
		br.append(u.LastName);
		br.newLine();
		System.out.println("Enter age=");
		u.age = sc.next();
		br.append( u.age);
		br.newLine();
		System.out.println("enter Phone_No=");
		u.PhoneNo = sc.next();
		br.append(u.PhoneNo);
		br.newLine();
		br.newLine();
		System.out.println("Do you want to continue creating users? (Type QUIT to exit)");
		txt = sc.next();
		if ("QUIT".equalsIgnoreCase(txt)) 
			{	break;	}	}br.close();}}
