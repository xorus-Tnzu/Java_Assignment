import java.lang.*;
import java.util.Scanner;

class Box 
{
	private double length;
	private double width;
	private double height;

	public Box(double length,double width,double height)
	{
		this.length=length;
		this.width=width;
		this.height=height;
	}
	public double vol(){return length*width*height;}
}
public class Assignment5Q2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter length of the box: ");
		double a=sc.nextDouble();

		System.out.print("Enter width of the box: ");
		double b=sc.nextDouble();

		System.out.print("Enter height of the box: ");
		double c=sc.nextDouble();

		System.out.println();

		Box box=new Box(a,b,c);
		double volume=box.vol();

		System.out.printf("Volume of the box is %.3f cubic units",volume);
		sc.close();
	}
}
/*
OUTPUT:
H:\Java_Assignment\Assignment_5>javac Assignment5Q2.java

H:\Java_Assignment\Assignment_5>java Assignment5Q2
Enter length of the box: 5.5
Enter width of the box: 7.5
Enter height of the box: 10

Volume of the box is 412.500 cubic units
*/