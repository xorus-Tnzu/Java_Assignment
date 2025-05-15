import java.lang.*;
import java.util.Scanner;
class Assignment1Q2
{
	public static long fact(int n)
	{
		long mul=1;
		for(int i=1;i<=n;i++)
		{
			mul*=i;
		}
		return mul;
	}
	public static void main(String args[])
	{
		System.out.println("***Finding factorial of a number using iteration***");
		System.out.println("Enter a positive integer: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num<0)
		{
		 	System.out.println("Factorial is noy defined for negative numbers.");
		}
		else 
		{
			System.out.println("Factorial of "+num+" is: "+fact(num));
		}
		sc.close();
	}
}

/*
OUTPUT:
H:\Java_Assignment\Assignment_1>javac Assignment1Q2.java

H:\Java_Assignment\Assignment_1>java Assignment1Q2
***Finding factorial of a number using iteration***
Enter a positive integer:
5
Factorial of 5 is: 120
*/