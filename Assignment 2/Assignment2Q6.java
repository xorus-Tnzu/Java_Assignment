import java.util.Scanner;

class Calculator 
{
	int add(int a, int b) { return a + b; }
    	float add(float a, float b) { return a + b; }
    	float add(int a, float b) { return a + b; }
    	float add(float a, int b) { return a + b; }

    	int sub(int a, int b) { return a - b; }
    	float sub(float a, float b) { return a - b; }
    	float sub(int a, float b) { return a - b; }
    	float sub(float a, int b) { return a - b; }

    	int mul(int a, int b) { return a * b; }
    	float mul(float a, float b) { return a * b; }
    	float mul(int a, float b) { return a * b; }
    	float mul(float a, int b) { return a * b; }

    	String div(int a, int b) 
	{
        	if (a == 0 && b == 0) return "Undefined";
        	if (b == 0) return "Infinity";
        	return String.valueOf(a / b);
    	}

    	String div(float a, float b) 
	{
        	if (a == 0 && b == 0) return "Undefined";
        	if (b == 0) return "Infinity";
        	return String.valueOf(a / b);
    	}

    	String div(int a, float b) 
	{
        	if (a == 0 && b == 0) return "Undefined";
        	if (b == 0) return "Infinity";
        	return String.valueOf(a / b);
    	}

    	String div(float a, int b) 
	{
        	if (a == 0 && b == 0) return "Undefined";
        	if (b == 0) return "Infinity";
        	return String.valueOf(a / b);
    	}
}

public class Assignment2Q6
{
    	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);
        	Calculator calc = new Calculator();

        	System.out.println("Welcome to the Calculator!");
        	System.out.println("Select Operation:\n1. Add\n2. Sub\n3. Mul\n4. Div");
        	System.out.print("Enter choice (1-4): ");
        	int op = sc.nextInt();

        	System.out.println("\nSelect Input Type:\n1. int + int\n2. float + float\n3. int + float\n4. float + int");
        	System.out.print("Enter type (1-4): ");
        	int type = sc.nextInt();

        	System.out.println();

        	switch (op)
		{
            		case 1: // Add
                		switch (type) 
				{
                    			case 1:
                        			System.out.print("Enter two ints: ");
                        			int a1 = sc.nextInt(), b1 = sc.nextInt();
                        			System.out.println("Result: " + calc.add(a1, b1));
                        			break;
                    			case 2:
                        			System.out.print("Enter two floats: ");
                        			float a2 = sc.nextFloat(), b2 = sc.nextFloat();
                        			System.out.println("Result: " + calc.add(a2, b2));
                        			break;
                    			case 3:
                        			System.out.print("Enter int and float: ");
                        			int a3 = sc.nextInt(); float b3 = sc.nextFloat();
                        			System.out.println("Result: " + calc.add(a3, b3));
                        			break;
                    			case 4:
                        			System.out.print("Enter float and int: ");
                        			float a4 = sc.nextFloat(); int b4 = sc.nextInt();
                        			System.out.println("Result: " + calc.add(a4, b4));
                        			break;
                		}
                		break;

            		case 2: // Sub
                		switch (type) 
				{
                   			 case 1:
                        			System.out.print("Enter two ints: ");
                        			int a1 = sc.nextInt(), b1 = sc.nextInt();
                        			System.out.println("Result: " + calc.sub(a1, b1));
                        			break;
                   			 case 2:
                        			System.out.print("Enter two floats: ");
                        			float a2 = sc.nextFloat(), b2 = sc.nextFloat();
                        			System.out.println("Result: " + calc.sub(a2, b2));
                        			break;
                   			 case 3:
                        			System.out.print("Enter int and float: ");
                        			int a3 = sc.nextInt(); float b3 = sc.nextFloat();
                        			System.out.println("Result: " + calc.sub(a3, b3));
                        			break;
                    			 case 4:
                        		 	System.out.print("Enter float and int: ");
                        			float a4 = sc.nextFloat(); int b4 = sc.nextInt();
                        			System.out.println("Result: " + calc.sub(a4, b4));
                        			break;
                		}
                		break;

            		case 3: // Mul
                		switch (type) 
				{
                   			case 1:
                        			System.out.print("Enter two ints: ");
                        			int a1 = sc.nextInt(), b1 = sc.nextInt();
                        			System.out.println("Result: " + calc.mul(a1, b1));
                        			break;
                   			case 2:
                        			System.out.print("Enter two floats: ");
                        			float a2 = sc.nextFloat(), b2 = sc.nextFloat();
                        			System.out.println("Result: " + calc.mul(a2, b2));
                        			break;
                    			case 3:
                        			System.out.print("Enter int and float: ");
                        			int a3 = sc.nextInt(); float b3 = sc.nextFloat();
                        			System.out.println("Result: " + calc.mul(a3, b3));
                        			break;
                    			case 4:
                        			System.out.print("Enter float and int: ");
                        			float a4 = sc.nextFloat(); int b4 = sc.nextInt();
                        			System.out.println("Result: " + calc.mul(a4, b4));
                        			break;
                		}
                		break;

            		case 4: // Div
                		switch (type) 
				{
                    			case 1:
                        			System.out.print("Enter two ints: ");
                       				int a1 = sc.nextInt(), b1 = sc.nextInt();
                        			System.out.println("Result: " + calc.div(a1, b1));
                        			break;
                    			case 2:
                        			System.out.print("Enter two floats: ");
                        			float a2 = sc.nextFloat(), b2 = sc.nextFloat();
                        			System.out.println("Result: " + calc.div(a2, b2));
                        			break;
                    			case 3:
                        			System.out.print("Enter int and float: ");
                        			int a3 = sc.nextInt(); float b3 = sc.nextFloat();
                        			System.out.println("Result: " + calc.div(a3, b3));
                        			break;
                    			case 4:
                        			System.out.print("Enter float and int: ");
                        			float a4 = sc.nextFloat(); int b4 = sc.nextInt();
                        			System.out.println("Result: " + calc.div(a4, b4));
                        			break;
                		}
                		break;

            		default:
                		System.out.println("Invalid operation.");
        }

        sc.close();
    }
}
/*
OUTPUT:
H:\Java_Assignment\Assignment_2>javac Assignment2Q6.java

H:\Java_Assignment\Assignment_2>java Assignment2Q6
Welcome to the Calculator!
Select Operation:
1. Add
2. Sub
3. Mul
4. Div
Enter choice (1-4): 1

Select Input Type:
1. int + int
2. float + float
3. int + float
4. float + int
Enter type (1-4): 4

Enter float and int: 15.7 8
Result: 23.7

H:\Java_Assignment\Assignment_2>java Assignment2Q6
Welcome to the Calculator!
Select Operation:
1. Add
2. Sub
3. Mul
4. Div
Enter choice (1-4): 4

Select Input Type:
1. int + int
2. float + float
3. int + float
4. float + int
Enter type (1-4): 4

Enter float and int: 0 0
Result: Undefined
*/