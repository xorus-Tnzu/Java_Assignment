import java.lang.*;
import java.util.Scanner;
class Assignment1Q3
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
		System.out.println("***Checking whether an integer is Prime or not***");
		System.out.println("Enter a positive integer: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num<0)
		{
		 	System.out.println("Please enter a positive integer.");
		}
		else 
		{
			if(isPrime(num))
				System.out.println(num+" is a Prime number.");
			else
				System.out.println(num+" is NOT a Prime number.");	
		}
		sc.close();
	}
}

/*
OUTPUT:
H:\Java_Assignment\Assignment_1>java Assignment1Q3
***Checking whether an integer is Prime or not***
Enter a positive integer:
10
10 is NOT a Prime number.

H:\Java_Assignment\Assignment_1>java Assignment1Q3
***Checking whether an integer is Prime or not***
Enter a positive integer:
7
7 is a Prime number.

H:\Java_Assignment\Assignment_1>java Assignment1Q3
***Checking whether an integer is Prime or not***
Enter a positive integer:
1
1 is NOT a Prime number.
*/