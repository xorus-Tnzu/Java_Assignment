import java.lang.*;
import java.util.Scanner;

class Counter
{
	private static int count;
	
	public Counter()
	{
		count++;
	} 
	
	public static int getCount()
	{
		return count;
	}
}

public class Assignment2Q5
{
    	public static void main(String[] args) 
	{
        	System.out.println("Creating Counter objects...");

        	Counter c1 = new Counter();
        	Counter c2 = new Counter();
        	Counter c3 = new Counter();

        	System.out.println("Total Counter objects created: " + Counter.getCount());
    	}
}
/*
OUTPUT:
H:\Java_Assignment\Assignment_2>javac Assignment2Q5.java

H:\Java_Assignment\Assignment_2>java Assignment2Q5
Creating Counter objects...
Total Counter objects created: 3
*/