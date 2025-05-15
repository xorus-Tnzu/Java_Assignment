import java.lang.*;
import java.util.Scanner;

class Calculator
{
	public int add(int x,int y)
	{
		return x+y;
	}
	public float add(float x,float y)
	{
		return x+y;
	}
	public float add(int x,float y)
	{
		return x+y;
	}
	public float add(float x,int y)	
	{
		return x+y;
	}
}
public class Assignment2Q4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Calculator calc=new Calculator();
		
		System.out.println("Welcome to the Calculator!");
        	System.out.println("Choose the type of addition:");
        	System.out.println("1. int + int");
        	System.out.println("2. float + float");
        	System.out.println("3. int + float");
        	System.out.println("4. float + int");
       		System.out.print("Enter your choice (1-4): ");
        	int choice = sc.nextInt();

        	switch(choice) 
		{
            		case 1:
                		System.out.print("Enter two integers: ");
                		int a = sc.nextInt();
                		int b = sc.nextInt();
                		System.out.println("Result: " + calc.add(a, b));
                		break;
            		case 2:
                		System.out.print("Enter two floats: ");
                		float c = sc.nextFloat();
                		float d = sc.nextFloat();
                		System.out.println("Result: " + calc.add(c, d));
                		break;
            		case 3:
                		System.out.print("Enter an integer and a float: ");
                		int e = sc.nextInt();
                		float f = sc.nextFloat();
                		System.out.println("Result: " + calc.add(e, f));
                		break;
            		case 4:
                		System.out.print("Enter a float and an integer: ");
                		float g = sc.nextFloat();
                		int h = sc.nextInt();
                		System.out.println("Result: " + calc.add(g, h));
                		break;
            		default:
                		System.out.println("Invalid choice. Please run the program again.");
        	}

        	sc.close();
	
	}
}

/*
OUTPUT:
Welcome to the Calculator!
Choose the type of addition:
1. int + int
2. float + float
3. int + float
4. float + int
Enter your choice (1-4): 1
Enter two integers: 5 7
Result: 12

H:\Java_Assignment\Assignment_2>java Assignment2Q4
Welcome to the Calculator!
Choose the type of addition:
1. int + int
2. float + float
3. int + float
4. float + int
Enter your choice (1-4): 2
Enter two floats: 15.7 71.8
Result: 87.5

H:\Java_Assignment\Assignment_2>java Assignment2Q4
Welcome to the Calculator!
Choose the type of addition:
1. int + int
2. float + float
3. int + float
4. float + int
Enter your choice (1-4): 3
Enter an integer and a float: 1 5.6
Result: 6.6

H:\Java_Assignment\Assignment_2>java Assignment2Q4
Welcome to the Calculator!
Choose the type of addition:
1. int + int
2. float + float
3. int + float
4. float + int
Enter your choice (1-4): 4
Enter a float and an integer: 1.57 59
Result: 60.57
*/