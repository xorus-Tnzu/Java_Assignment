import java.lang.*;
import java.util.Scanner;

public class Assignment3Q4
{
	public static int[] concatenateArrays(int arr1[],int arr2[])
	{
		int result[]=new int[arr1.length+arr2.length];

		// Copy elements from the first array
		for(int i=0;i<arr1.length;i++)
		{
			result[i]=arr1[i];
		}
		
		// Copy elements from the second array
        	for(int i=0;i<arr2.length;i++) 
		{
            		result[arr1.length + i] = arr2[i];
        	}
        	return result;
	}
	
	public static void printArray(String name, int arr[]) 
	{
        	System.out.print(name + ": ");
        	for(int num : arr) 
		{
            		System.out.print(num + " ");
        	}
        	System.out.println();
    	}

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);

		// Input for first array
		System.out.print("Enter the size of first array: ");
        	int size1 = sc.nextInt();

        	int array1[] = new int[size1];

        	System.out.println("Enter " + size1 + " elements for first array:");
        	for (int i = 0; i < size1; i++) 
		{
            		System.out.print(i+1+".Enter element at index 0: ");
			array1[i]=sc.nextInt();
        	}


        	// Input for second array
        	System.out.print("Enter the size of second array: ");
        	int size2 = sc.nextInt();
		
        	int array2[] = new int[size2];

        	System.out.println("Enter " + size2 + " elements for second array:");
        	for (int i = 0; i < size2; i++) 
		{
            		System.out.print(i+1+".Enter element at index 0: ");
			array2[i]=sc.nextInt();
        	}

		// Concatenate arrays
        	int concatenatedArray[] = concatenateArrays(array1, array2);

		System.out.println("\n");
        	// Display all arrays
        	printArray("Array 1", array1);
        	printArray("Array 2", array2);
        	printArray("Concatenated Array", concatenatedArray);
		
		sc.close();
	}
}
/*
OUTPUT:
H:\Java_Assignment\Assignment_3>javac Assignment3Q4.java

H:\Java_Assignment\Assignment_3>java Assignment3Q4
Enter the size of first array: 5
Enter 5 elements for first array:
1.Enter element at index 0: 1
2.Enter element at index 0: 2
3.Enter element at index 0: 3
4.Enter element at index 0: 4
5.Enter element at index 0: 5
Enter the size of second array: 5
Enter 5 elements for second array:
1.Enter element at index 0: 6
2.Enter element at index 0: 7
3.Enter element at index 0: 8
4.Enter element at index 0: 9
5.Enter element at index 0: 10


Array 1: 1 2 3 4 5
Array 2: 6 7 8 9 10
Concatenated Array: 1 2 3 4 5 6 7 8 9 10
*/