import java.lang.*;
import java.util.Scanner;
public class Assignment1Q10
{
	public static void printFibIterative(int n)
	{
		int first=0,second=1;
		System.out.println("Fibonacci Series up to "+n+" terms: ");
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(first+" ");
			int next=first+second;
			first=second;
			second=next;
		}
	}


	public static int fibonacciRecursive(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
	} 
	
	public static void printFibRecursive(int n)	
	{
		System.out.println("Fibonacci Series(Recursive): ");
		for(int i=0;i<n;i++)
		{
			System.out.print(fibonacciRecursive(i)+" ");
		}
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("***Displaying Fibonacci series upto n-terms using both RECURSION and ITERATION***");

		System.out.println("Enter how many terms of Fibonacci Series to Display: ");
		int n=sc.nextInt();

		System.out.println("Choose Method: ");
		System.out.println("1. Iteration");
		System.out.println("2. Recursive");
		System.out.println("Enter choice (1 or 2): ");
		int choice=sc.nextInt();
		
		if(n<=0)
			System.out.println("Please enter a positive number.");
		else
		{
			switch(choice)
			{
				case 1: printFibIterative(n);
					break;
				case 2: printFibRecursive(n);
					break;
				default:System.out.println("Invalid Choice!");
					break;
			}
		}

		sc.close();
	}
}

/*
OUTPUT:
H:\Java_Assignment\Assignment_1>javac Assignment1Q10.java

H:\Java_Assignment\Assignment_1>java Assignment1Q10
***Displaying Fibonacci series upto n-terms using both RECURSION and ITERATION***
Enter how many terms of Fibonacci Series to Display:
10
Choose Method:
1. Iteration
2. Recursive
Enter choice (1 or 2):
1
Fibonacci Series up to 10 terms:
0 1 1 2 3 5 8 13 21 34
H:\Java_Assignment\Assignment_1>java Assignment1Q10
***Displaying Fibonacci series upto n-terms using both RECURSION and ITERATION***
Enter how many terms of Fibonacci Series to Display:
10
Choose Method:
1. Iteration
2. Recursive
Enter choice (1 or 2):
2
Fibonacci Series(Recursive):
0 1 1 2 3 5 8 13 21 34
*/