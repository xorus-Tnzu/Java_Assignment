import java.lang.*;
import java.util.Scanner;
class Assignment1Q5
{
	public static boolean isPerfect(int n)
	{	
		if(n<=0)
			return false;
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		
		return sum==n;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("***Checking whether a number is Perfect or not***");
		System.out.println("Entrer an integer: ");
		int num=sc.nextInt();
		if(isPerfect(num))
			System.out.println(num+" is a Perfect Number.");
		else
			System.out.println(num+" is NOT a Perfect Number.");
		
		sc.close();
	}
}

/*
OUTPUT:
H:\Java_Assignment\Assignment_1>javac Assignment1Q5.java

H:\Java_Assignment\Assignment_1>java Assignment1Q5
***Checking whether a number is Perfect or not***
Entrer an integer:
28
28 is a Perfect Number.

H:\Java_Assignment\Assignment_1>java Assignment1Q5
***Checking whether a number is Perfect or not***
Entrer an integer:
7
7 is NOT a Perfect Number.
H:\Java_Assignment\Assignment_1>java Assignment1Q5
***Checking whether a number is Perfect or not***
Entrer an integer:
-28
-28 is NOT a Perfect Number.
*/