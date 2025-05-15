import java.lang.*;

public class Assignment4Q4 
{
	public static int GCD(int m, int n) 
	{
		if(m > n)
			return GCD(n, m-n);
        	else if (n > m)
            		return GCD(m, n-m);
        	else
            		return m;
    	}
	
    	public static void main(String args[]) 
	{
        	if (args.length != 2) 
		{
            		System.out.println("Usage: java Assignment4Q4 <num1> <num2>");
            		return;
        	}

        	try 
		{
            		int m = Integer.parseInt(args[0]);
            		int n = Integer.parseInt(args[1]);

            		if (m <= 0 || n <= 0) 
			{
                		System.out.println("Please enter positive integers only.");
                		return;
            		}

	            	System.out.println("GCD(" + m + "," + n + ") = " + GCD(m, n));
        	} 
		catch (NumberFormatException e) 
		{
            		System.out.println("Invalid input. Please enter two integers.");
        	}
    	}
}
/*
OUTPUT:

H:\Java_Assignment\Assignment_4>javac Assignment4Q4.java

H:\Java_Assignment\Assignment_4>java Assignment4Q4
Usage: java Assignment4Q4 <num1> <num2>

H:\Java_Assignment\Assignment_4>java Assignment4Q4 18 48
GCD(18,48) = 6
*/
