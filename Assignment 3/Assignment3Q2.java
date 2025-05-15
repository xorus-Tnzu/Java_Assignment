import java.lang.*;
import java.util.Scanner;

class Assignment3Q2
{
	public static void printMatrix(int mat[][])
	{
		for(int[] row:mat)
		{
			for(int val:row)
			{
				System.out.print(val+" ");
			}
		System.out.println();	
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of matrix(n): ");
		int n=sc.nextInt();
		
		int matrix[][]=new int[n][n];

		//Input matrix elements--
		System.out.println("Enter the elements of "+n+"x"+n+" matrix: ");
		int count=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(count+".Enter element at matrix["+i+"]["+j+"]: ");
				matrix[i][j]=sc.nextInt();
				count++;
			}
		}

		//Dispalying Original Matrix--
		System.out.println("\nOriginal Matrix: ");
		printMatrix(matrix);

		//sum of all elements in each row--
		for(int i=0;i<n;i++)
		{
		int rowSum=0;
			for(int j=0;j<n;j++)
			{
				rowSum+=matrix[i][j];	
			}
		System.out.println("The sum of all elements in row "+(i+1)+" is "+rowSum);
		}

		//sum of all elements in each coloumn--
		for(int j=0;j<n;j++)
		{
		int colSum=0;
			for(int i=0;i<n;i++)
			{
				colSum+=matrix[i][j];	
			}
		System.out.println("The sum of all elements in coloumn "+(j+1)+" is "+colSum);
		}

		//Sum of elements in both principal diagonals--
		int mainDiagonalSum=0,secondaryDiagonalSum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
					mainDiagonalSum+=matrix[i][j];	
				if(i+j==n-1)
					secondaryDiagonalSum+=matrix[i][j];
			}
		}
		System.out.println("\nSum of Main Diagonal: " + mainDiagonalSum);
        	System.out.println("Sum of Secondary Diagonal: " + secondaryDiagonalSum);

		//calculating and Printing transpose of the matrix
		System.out.println("\nTranspose of the matrix: ");
		int transpose[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				transpose[i][j]=matrix[j][i];	
			}
		}
		printMatrix(transpose);

		//sum of all elements of the matrix--
		int totalSum=0;
		for(int j=0;j<n;j++)
		{
			for(int i=0;i<n;i++)
			{
				totalSum+=matrix[i][j];	
			}
		}
		System.out.print("\nSum of all elements of matrix: "+totalSum);
		
		sc.close();
	}

}
/*
OUTPUT:
H:\Java_Assignment\Assignment_3>javac Assignment3Q2.java

H:\Java_Assignment\Assignment_3>java Assignment3Q2
Enter the size of matrix(n): 3
Enter the elements of 3x3 matrix:
1.Enter element at matrix[0][0]: 1
2.Enter element at matrix[0][1]: 2
3.Enter element at matrix[0][2]: 3
4.Enter element at matrix[1][0]: 4
5.Enter element at matrix[1][1]: 5
6.Enter element at matrix[1][2]: 6
7.Enter element at matrix[2][0]: 7
8.Enter element at matrix[2][1]: 8
9.Enter element at matrix[2][2]: 9

Original Matrix:
1 2 3
4 5 6
7 8 9
The sum of all elements in row 1 is 6
The sum of all elements in row 2 is 15
The sum of all elements in row 3 is 24
The sum of all elements in coloumn 1 is 12
The sum of all elements in coloumn 2 is 15
The sum of all elements in coloumn 3 is 18

Sum of Main Diagonal: 15
Sum of Secondary Diagonal: 15

Transpose of the matrix:
1 4 7
2 5 8
3 6 9

Sum of all elements of matrix: 45*/