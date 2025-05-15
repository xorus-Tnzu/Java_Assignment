import java.lang.*;
import java.util.Scanner;

public class Assignment5Q3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("***Printing the multiplication table of a number between 1 and 10***");
        	int number;
		
        	// Keep asking until the user enters a valid number between 1 and 10
        	while (true) 
		{
            		System.out.print("Enter an integer between 1 and 10: ");
            		number = sc.nextInt();

            		if (number >= 1 && number <= 10) 
			{
                		break;
			}
			else
			{ 
                		System.out.println("Invalid input. Please try again.");
            		}
        	}

        	// Print multiplication table
        	System.out.println("Multiplication Table for " + number + ":");
        	for (int i = 1; i <= 10; i++) 
		{
            		System.out.println(number + " x " + i + " = " + (number * i));
        	}

        	sc.close();
    	}
}
/*
OUTPUT:
H:\Java_Assignment\Assignment_5>javac Assignment5Q3.java

H:\Java_Assignment\Assignment_5>java Assignment5Q3
***Printing the multiplication table of a number between 1 and 10***
Enter an integer between 1 and 10: 9
Multiplication Table for 9:
9 x 1 = 9
9 x 2 = 18
9 x 3 = 27
9 x 4 = 36
9 x 5 = 45
9 x 6 = 54
9 x 7 = 63
9 x 8 = 72
9 x 9 = 81
9 x 10 = 90
*/