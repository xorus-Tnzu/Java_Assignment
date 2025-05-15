import java.lang.*;

public class Assignment4Q3
{
    	public static void main(String[] args) 
	{
        	if (args.length < 3) 
		{
            		System.out.println("Usage: java Calculator <num1> <num2> <operator>");
            		System.out.println("Operators: +, -, *, /");
            		return;
        	}

        	try 
		{
            		double num1 = Double.parseDouble(args[0]);
            		double num2 = Double.parseDouble(args[1]);
            		char operator = args[2].charAt(0);
            		double result;

            		switch (operator) 
			{
				case '+':
					result = num1 + num2;
                    			System.out.println("Addition = " + result);
                    			break;

                		case '-':
                    			result = num1 - num2;
                    			System.out.println("Subtraction = " + result);
                    			break;

                		case '*':
                    			result = num1 * num2;
                    			System.out.println("Multiplication = " + result);
                    			break;

                		case '/':	
    					try 
					{
        					if (num2 == 0)
            						throw new ArithmeticException();
        					result = num1 / num2;
        					System.out.println("Division = " + result);
    					} 
					catch (ArithmeticException e) 
					{
        					if (num1 == 0)
            						System.out.println("Undefined");
        					else
            						System.out.println("Infinity");
    					}
    					break;

                		default:
                    			System.out.println("Invalid operator. Use +, -, *, or /.");
					break;
            		}
        	} 
		catch (NumberFormatException e) 
		{
            		System.out.println("Error: Please enter valid numbers.");
        	} 
		catch (Exception e) 
		{
            		System.out.println("An unexpected error occurred: " + e.getMessage());
        	}
    	}
}
/*
OUTPUT:

H:\Java_Assignment\Assignment_4>javac Assignment4Q3.java

H:\Java_Assignment\Assignment_4>java Assignment4Q3 10 20 +
Addition = 30.0

H:\Java_Assignment\Assignment_4>java Assignment4Q3 10 20 -
Subtraction = -10.0

H:\Java_Assignment\Assignment_4>java Assignment4Q3 10 20 *
Invalid operator. Use +, -, *, or /.

H:\Java_Assignment\Assignment_4>java Assignment4Q3 10 20 /
Division = 0.5

H:\Java_Assignment\Assignment_4>java Assignment4Q3 10 0 /
Infinity

H:\Java_Assignment\Assignment_4>java Assignment4Q3 0 0 /
Undefined

*/