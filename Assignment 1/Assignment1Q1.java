import java.lang.*;
import java.util.Scanner;
class Assignment1Q1
{
	public static void main(String args[])
	{
		System.out.println("Enter two integers: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Before Swapping: a="+a+" ,b="+b);

		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping: a="+a+" ,b="+b);
	}
}

/*
OUTPUT:
H:\Java_Assignment\Assignment_1>javac Assignment1Q1.java

H:\Java_Assignment\Assignment_1>java Assignment1Q1
Enter two integers:
10 20
Before Swapping: a=10 ,b=20
After Swapping: a=20 ,b=10
*/