import java.lang.*;
import java.util.Scanner;
class Assignment1Q4
{
	public static boolean isPrime(int n)
	{
		if(n<=1)
			return false;// bcz 0 and 1 is not prime
	
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("***Printing all Prime numbers between a given range***");
		System.out.println("Enter the starting number of the range: ");
		int start=sc.nextInt();
		System.out.println("Enter the ending number of the range: ");
		int end=sc.nextInt();
		
		System.out.println("Prime numbers between "+start+" and "+end+" are: ");
		
		for(int i=start;i<=end;i++)
		{
			if(isPrime(i))
				System.out.print(i+" ");
		}
		sc.close();
	}
}

/*
OUTPUT:
H:\Java_Assignment\Assignment_1>javac Assignment1Q4.java

H:\Java_Assignment\Assignment_1>java Assignment1Q4
***Printing all Prime numbers between a given range***
Enter the starting number of the range:
10
Enter the ending number of the range:
35
Prime numbers between 10 and 35 are:
11 13 17 19 23 29 31
*/