import java.lang.*;
import java.util.Scanner;

public class Assignment5Q5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("***Finding an element from a 1D array***");
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

		System.out.print("\nEnter the element to find: ");
		int key=sc.nextInt(); 
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				System.out.println(key+" is found at array index "+i);
				return;
			}	
		}
		
		System.out.println("\n"+key+" is Not found in the array.");
		
		sc.close();
	}
}
/*
OUTPUT:
H:\Java_Assignment\Assignment_5>javac Assignment5Q5.java

H:\Java_Assignment\Assignment_5>java Assignment5Q5
***Finding an element from a 1D array***
Enter the size of the array: 10
Enter 10 integers:
1.Enter element at index 0 : 5
2.Enter element at index 1 : 6
3.Enter element at index 2 : 7
4.Enter element at index 3 : 9
5.Enter element at index 4 : 4
6.Enter element at index 5 : 8
7.Enter element at index 6 : 3
8.Enter element at index 7 : 1
9.Enter element at index 8 : 2
10.Enter element at index 9 : 10


Array Elements:
5 6 7 9 4 8 3 1 2 10
Enter the element to find: 8
8 is found at array index 5
*/