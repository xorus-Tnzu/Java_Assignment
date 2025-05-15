import java.lang.*;
import java.util.Scanner;
class Assignment1Q6
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
		System.out.println("***Printing all Perfect numbers between a given range***");

		System.out.println("Enter the starting number of the range: ");
		int start=sc.nextInt();
		System.out.println("Enter the ending number of the range: ");
		int end=sc.nextInt();
		
		System.out.println("Perfect numbers between "+start+" and "+end+" are: ");
		for(int i=start;i<=end;i++)
		{
			if(isPerfect(i))
				System.out.print(i+" ");
		}
		
		sc.close();
	}
}

/*
OUTPUT:
H:\Java_Assignment\Assignment_1>javac Assignment1Q6.java

H:\Java_Assignment\Assignment_1>java Assignment1Q6
***Printing all Perfect numbers between a given range***
Enter the starting number of the range:
1
Enter the ending number of the range:
300
Perfect numbers between 1 and 300 are:
6 28
*/