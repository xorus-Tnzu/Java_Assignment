import java.lang.*;
import java.util.Scanner;
public class Assignment1Q9
{
	public static void printFibonacci(int n)
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
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("***Displaying Fibonacci series upto n-terms***");
		System.out.println("Enter how many terms of Fibonacci Series to Display: ");
		int n=sc.nextInt();

		if(n<=0)
			System.out.println("Please enter a positive number.");
		else
			printFibonacci(n);

		sc.close();
	}
}

/*
OUTPUT:
H:\Java_Assignment\Assignment_1>javac Assignment1Q9.java

H:\Java_Assignment\Assignment_1>java Assignment1Q9
***Displaying Fibonacci series upto n-terms***
Enter how many terms of Fibonacci Series to Display:
10
Fibonacci Series up to 10 terms:
0 1 1 2 3 5 8 13 21 34
*/