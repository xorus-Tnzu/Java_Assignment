import java.lang.*;
import java.util.Scanner;

public class Assignment3Q3
{
	public static int[] generateFibonacci(int n)
	{
		int fib[]=new int[n];
	
		if (n >= 1) fib[0] = 0;
        	if (n >= 2) fib[1] = 1;

        	for (int i = 2; i < n; i++) 
		{
            		fib[i] = fib[i - 1] + fib[i - 2];
        	}

        	return fib;
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("***Filling an Array of size n with fibonacci series upto n terms***");
		System.out.print("Enter the size(n) of the array: ");
		int n=sc.nextInt();
		
		if(n<=0) 
		{
            		System.out.println("Please enter a positive integer.");
            		return;
        	}
		
		
		// Generate and print Fibonacci array
        	int[] fibonacciSeries = generateFibonacci(n);

        	System.out.print("Fibonacci Series: ");
        	for (int num : fibonacciSeries) 
		{
            		System.out.print(num + " ");
        	}
		sc.close();
	}
}
/*
OUTPUT:
H:\Java_Assignment\Assignment_3>javac Assignment3Q3.java

H:\Java_Assignment\Assignment_3>java Assignment3Q3
***Filling an Array of size n with fibonacci series upto n terms***
Enter the size(n) of the array: 10
Fibonacci Series: 0 1 1 2 3 5 8 13 21 34

H:\Java_Assignment\Assignment_3>java Assignment3Q3
***Filling an Array of size n with fibonacci series upto n terms***
Enter the size(n) of the array: 0
Please enter a positive integer.
*/