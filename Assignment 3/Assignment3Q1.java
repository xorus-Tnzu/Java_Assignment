import java.lang.*;
import java.util.Scanner;

public class Assignment3Q1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int numbers[]=new int[10];
		System.out.println("Enter 10 integers between 1 to 10: ");
		
		//taking input--
		for(int i=0;i<10;i++)
		{
			System.out.print(i+1+".Enter element at index "+i+" : ");
			numbers[i]=sc.nextInt();
		}
		
		//calculating the sum-- 
		int sum=0;
		for(int num:numbers)
		{
			sum+=num;
		}
		
		//calculating the frequency of each element--
		int frequency[]=new int[11];//bcz 0 is unused
		
		for(int num:numbers)
		{
			frequency[num]++;
		}
		
		//Printing the array--
		System.out.println("\n\nArray Elements: ");
		for(int num:numbers)
		{
			System.out.print(num+" ");
		}

		//Printing the sum
		System.out.println("\n\nSum of all elements: "+sum);
		
		System.out.println("\n\nFrequency of each elements: ");
		for(int i=1;i<=10;i++)
		{
			if(frequency[i]>0)
				System.out.println(i+" occurs "+frequency[i]+" time(s)");
		}
		sc.close();
	}
}
/*
OUTPUT:
H:\Java_Assignment\Assignment_3>javac Assignment3Q1.java

H:\Java_Assignment\Assignment_3>java Assignment3Q1
Enter 10 integers between 1 to 10:
1.Enter element at index 0: 2
2.Enter element at index 0: 5
3.Enter element at index 0: 7
4.Enter element at index 0: 10
5.Enter element at index 0: 6
6.Enter element at index 0: 9
7.Enter element at index 0: 9
8.Enter element at index 0: 5
9.Enter element at index 0: 10
10.Enter element at index 0: 3


Array Elements:
2 5 7 10 6 9 9 5 10 3

Sum of all elements: 66


Frequency of each elements:
2 occurs 1 time(s)
3 occurs 1 time(s)
5 occurs 2 time(s)
6 occurs 1 time(s)
7 occurs 1 time(s)
9 occurs 2 time(s)
10 occurs 2 time(s)
*/