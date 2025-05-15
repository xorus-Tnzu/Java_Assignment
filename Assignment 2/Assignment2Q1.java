import java.lang.*;
import java.util.Scanner;

class Rectangle
{
	private float length;
	private float width;
	
	public Rectangle(float length,float width)
	{
		this.length=length;
		this.width=width;
	}
	public float calculateArea()
	{
		return length*width;
	}
	public float calculatePerimeter()
	{
		return 2*(length+width);
	}
}
public class Assignment2Q1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("***Creating two Recatngle Objects using parameterized constructor***");		

		System.out.println("Enter length and width of Rectangle1: ");
		float length1=sc.nextFloat();
		float width1=sc.nextFloat();
		Rectangle rect1=new Rectangle(length1,width1);

		System.out.println("Enter length and width of Rectangle2: ");
		float length2=sc.nextFloat();
		float width2=sc.nextFloat();
		Rectangle rect2=new Rectangle(length2,width2);

		System.out.println("\nRectangle1:");
		System.out.println("Area: "+rect1.calculateArea());
		System.out.println("Perimeter: "+rect1.calculatePerimeter());

		System.out.println("\nRectangle2:");
		System.out.println("Area: "+rect2.calculateArea());
		System.out.println("Perimeter: "+rect2.calculatePerimeter());
		
		sc.close();
	}
}
/*
OUTPUT:
H:\Java_Assignment\Assignment_2>javac Assignment2Q1.java

H:\Java_Assignment\Assignment_2>java Assignment2Q1
***Creating two Recatngle Objects using parameterized constructor***
Enter length and width of Rectangle1:
10 20
Enter length and width of Rectangle2:
10.5 6.7

Rectangle1:
Area: 200.0
Perimeter: 60.0

Rectangle2:
Area: 70.35
Perimeter: 34.4
*/