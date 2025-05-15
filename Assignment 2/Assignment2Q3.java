import java.lang.*;
import java.util.Scanner;
class Student
{
	private String name;
	private int rollNumber;
	private char grade;

	public Student()
	{
		name="Not Assigned";
		rollNumber=0;
		grade='N';
	}
	public Student(String name,int rollNumber)
	{
		this.name=name;
		this.rollNumber=rollNumber;
	}
	public Student(String name,int rollNumber,char grade)
	{
		this.name=name;
		this.rollNumber=rollNumber;
		this.grade=grade;
	}
	public void displayDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Grade: "+grade);
		System.out.println("------------------------");
	}
}
public class Assignment2Q3
{
	public static void main(String args[])
	{
		Student student1=new Student(); // Default constructor
		Student student2=new Student("Partha",7);// Constructor with name and rollNumber
		Student student3=new Student("Kohil",12,'A');// Constructor with all attributes

		student1.displayDetails();
		student2.displayDetails();
		student3.displayDetails();
	}
}
/*
OUTPUT:
H:\Java_Assignment\Assignment_2>javac Assignment2Q3.java

H:\Java_Assignment\Assignment_2>java Assignment2Q3
Name: Not Assigned
Roll Number: 0
Grade: N
------------------------
Name: Partha
Roll Number: 7
Grade:
------------------------
Name: Kohil
Roll Number: 12
Grade: A
------------------------
*/