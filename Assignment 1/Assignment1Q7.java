import java.lang.*;
import java.util.Scanner;
class Assignment1Q7
{
	public static int digitCount(int n)
	{
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		return count;
	}
	public static boolean isArmstrong(int n)
	{	
		if(n==0)
			return true;
		else if(n<0)
			return false;

		int sum=0,rem,m=n;
		int noOfDigits=digitCount(n);
		while(n>0)
		{
			rem=n%10;
			sum+=(int)Math.pow(rem,noOfDigits);
			n=n/10;
		}
		
		return sum==m;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("***Checking whether a number is Armstrong or not***");
		System.out.println("Enter an integer: ");
		int num=sc.nextInt();
		
		if(isArmstrong(num))
			System.out.println(num+" is a Armstrong Number.");
		else
			System.out.println(num+" is NOT a Armstrong Number.");
		
		sc.close();
	}
}

/*
OUTPUT:
H:\Java_Assignment\Assignment_1>javac Assignment1Q7.java

H:\Java_Assignment\Assignment_1>java Assignment1Q7
***Checking whether a number is Armstrong or not***
Enter an integer:
153
153 is a Armstrong Number.

H:\Java_Assignment\Assignment_1>java Assignment1Q7
***Checking whether a number is Armstrong or not***
Enter an integer:
147
147 is NOT a Armstrong Number.

H:\Java_Assignment\Assignment_1>java Assignment1Q7
***Checking whether a number is Armstrong or not***
Enter an integer:
-153
-153 is NOT a Armstrong Number.

H:\Java_Assignment\Assignment_1>java Assignment1Q7
***Checking whether a number is Armstrong or not***
Enter an integer:
0
0 is a Armstrong Number.
*/