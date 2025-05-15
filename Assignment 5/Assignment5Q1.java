import java.lang.*;
import java.util.Scanner;

public class Assignment5Q1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("***Checking Wheather a year is a Leap year or not***");
		System.out.print("Enter a year: ");
        	int year = sc.nextInt();

        	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
		{
            		System.out.println(year + " is a leap year.");
        	} 
		else 
		{
            		System.out.println(year + " is not a leap year.");
        	}

		sc.close();
	}
}
/*
OUTPUT:
H:\Java_Assignment\Assignment_5>javac Assignment5Q1.java

H:\Java_Assignment\Assignment_5>java Assignment5Q1
***Checking Wheather a year is a Leap year or not***
Enter a year: 2025
2025 is not a leap year.
*/