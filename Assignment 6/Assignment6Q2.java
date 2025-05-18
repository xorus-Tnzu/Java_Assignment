import java.lang.*;
import java.util.Scanner;

public class Assignment6Q2
{
	// Recursive method to find max
   	static int findMax(int[] arr, int index,int max) 
	{
        	// Base case
        	if (index == arr.length) 
		{
            		return max;
        	}
		
		if (arr[index]>max) 
		{
            		max=arr[index];
        	}

        	// Recursive case
        	return findMax(arr,index+1,max);
    	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
			
		System.out.println("***Finding the largest element in an 1D array using recursion***");
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
		System.out.println("\nArray Elements: ");
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
		
		System.out.println();
		
		// Call recursive function and display result
        	int max = findMax(arr, 0,arr[0]);
        	System.out.println("Largest element in the array is: " + max);

		sc.close();
	}
}

/*
OUTPUT:
H:\Java_Assignment\Assignment_6>javac Assignment6Q2.java

H:\Java_Assignment\Assignment_6>java Assignment6Q2
***Finding the largest element in an 1D array using recursion***
Enter the size of the array: 5
Enter 5 integers:
1.Enter element at index 0 : 10
2.Enter element at index 1 : 20
3.Enter element at index 2 : 30
4.Enter element at index 3 : 40
5.Enter element at index 4 : 50

Array Elements:
10 20 30 40 50
Largest element in the array is: 50
*/
