import java.lang.*;
import java.util.Scanner;

public class Assignment5Q4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("***Finding Largest and Smallest element in an Array***");
		System.out.print("Enter the size of the array: ");

		int n=sc.nextInt();
		int arr[]=new int[n];

		System.out.println("Enter "+n+" integers: ");
		
		//taking input--
		for(int i=0;i<n;i++)
		{
			System.out.print(i+1+".Enter element at index "+i+" : ");
			arr[i]=sc.nextInt();
		}
		
		//Printing the array--
		System.out.println("\n\nArray Elements: ");
		for(int num:arr)
		{
			System.out.print(num+" ");
		}

		int max,min; 
		max = min = arr[0];
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		
		System.out.println("\n\nThe Largest element in the array is: "+max);
		System.out.println("\nThe Smallest element in the array is: "+min);
		
		sc.close();
	}
}
/*
OUTPUT:
H:\Java_Assignment\Assignment_5>javac Assignment5Q4.java

H:\Java_Assignment\Assignment_5>java Assignment5Q4
***Finding Largest and Smallest element in an Array***
Enter the size of the array: 10
Enter 10 integers:
1.Enter element at index 0 : 7
2.Enter element at index 1 : 19
3.Enter element at index 2 : 27
4.Enter element at index 3 : 35
5.Enter element at index 4 : 14
6.Enter element at index 5 : 15
7.Enter element at index 6 : 8
8.Enter element at index 7 : 6
9.Enter element at index 8 : 9
10.Enter element at index 9 : 2


Array Elements:
7 19 27 35 14 15 8 6 9 2

The Largest element in the array is: 35

The Smallest element in the array is: 2
*/