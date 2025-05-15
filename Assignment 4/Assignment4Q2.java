import java.lang.*;

abstract class Shape
{
	public abstract double calculateArea();
}
class Circle extends Shape
{
	private double radius;
	
	public Circle(double radius){ this.radius=radius;}
	public double calculateArea(){ return Math.PI*radius*radius;}
}
class Rectangle extends Shape
{
	private double length;
	private double breadth;
	
	public Rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public double calculateArea(){ return length*breadth;}
}
class Triangle extends Shape
{
	private double base;
	private double height;
	
	public Triangle(double base,double height)
	{
		this.base=base;
		this.height=height;
	}
	public double calculateArea(){ return 0.5*base*height;}
}
public class Assignment4Q2
{
	public static void main(String args[])
	{
		Shape circle = new Circle(5);
        	Shape rectangle = new Rectangle(4, 6);
        	Shape triangle = new Triangle(3, 7);

        	System.out.println("\nCircle Area: " + circle.calculateArea());
        	System.out.println("\nRectangle Area: " + rectangle.calculateArea());
        	System.out.println("\nTriangle Area: " + triangle.calculateArea());
	}
}
/*
OUTPUT:
H:\Java_Assignment\Assignment_4>javac Assignment4Q2.java

H:\Java_Assignment\Assignment_4>java Assignment4Q2

Circle Area: 78.53981633974483

Rectangle Area: 24.0

Triangle Area: 10.5
*/