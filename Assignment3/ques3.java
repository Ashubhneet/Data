package Assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
public class ques3 
{
	public static void main(String[] args) throws Exception 
	{

	String line;
	int count = 0;
	FileReader file = new FileReader( "/home/shubhneet/Desktop/Assignment3/shubh.txt");
	BufferedReader br = new BufferedReader(file);
	while ((line = br.readLine()) != null) 
		{
	String words[] = line.split("");
	count = count + words.length;
		}
	System.out.println("Number of words present in given file: " + count);
	br.close();
	}
}
