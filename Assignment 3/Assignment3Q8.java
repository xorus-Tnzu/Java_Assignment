import java.lang.*;
import java.util.Scanner;

public class Assignment3Q8 
{
    	private static Scanner sc = new Scanner(System.in);

    	public static StringBuffer Append(StringBuffer strb1) 
	{
        	System.out.print("Enter another string to concatenate: ");
        	String st = sc.nextLine();
        	return strb1.append(st);
    	}

    	public static StringBuffer insertAtPosition(int index, StringBuffer strb1) 
	{
        	System.out.print("Enter another string to insert: ");
        	String st = sc.nextLine();
        	return strb1.insert(index, st);
    	}
	
	//Overloading
    	public static StringBuffer insertAtPosition(int begin, int end, StringBuffer strb1) 
	{
        	System.out.print("Enter a string to replace in the specified range: ");
        	String st = sc.nextLine();
        	return strb1.replace(begin, end, st);
    	}

    	public static StringBuffer Delete(int begin, int end, StringBuffer strb1) 
	{
        	return strb1.delete(begin, end);
    	}

    
	public static void main(String[] args) 
	{
        	System.out.print("Enter a string: ");
       		String str = sc.nextLine();
        	StringBuffer strb = new StringBuffer(str);
		
		int choice;	
		do
		{
        		System.out.println("\nMENU1:");
        		System.out.println("1 - Append a string");
                	System.out.println("2 - Insert a string at a specific position");
        		System.out.println("3 - Delete a portion of the string");
			System.out.println("4 - Exit");
        		System.out.print("Enter your choice(1-4): ");
        		choice = sc.nextInt();
        		sc.nextLine(); // clear buffer

        		switch (choice) {
            		case 1:
                		System.out.println("Now new string is: " + Append(strb));
                		break;

            		case 2:
                		System.out.println("\nMENU2:");
                		System.out.println("1 - Insert at the beginning");
                		System.out.println("2 - Insert at the end");
                		System.out.println("3 - Replace part of string (in between)");
                		System.out.print("Enter your choice: ");
                		int choice2 = sc.nextInt();
                		sc.nextLine(); // clear buffer

                		switch (choice2) {
                    		case 1:
                        		System.out.println("Now new string is: " + insertAtPosition(0, strb));
                        		break;
                    		case 2:
                        		System.out.println("Now new string is: " + insertAtPosition(strb.length(), strb));
                        		break;
                    		case 3:
                        		System.out.print("Enter starting index: ");
                        		int begin = sc.nextInt();
                        		System.out.print("Enter ending index(exclusive): ");
                        		int end = sc.nextInt();
                        		sc.nextLine(); // clear buffer
                        		System.out.println("Now new string is: " + insertAtPosition(begin, end, strb));
                        		break;
                    		default:
                        		System.out.println("Invalid sub-choice.");
					break;
                		}
                		break;

            		case 3:
                		System.out.print("Enter starting and ending index(exclusive) to delete: ");
                		int begin = sc.nextInt();
                		int end = sc.nextInt();
                		System.out.println("Now new string is: " + Delete(begin, end, strb));
                		break;

            		default:
                		System.out.println("Invalid choice!");
				break;
			}
		System.out.println("--------------------");
		}while(choice!=4);
		sc.close();
        }
}
/*
OUTPUT:
H:\Java_Assignment\Assignment_3>javac Assignment3Q8.java

H:\Java_Assignment\Assignment_3>java Assignment3Q8
Enter a string: Hello World

MENU1:
1 - Append a string
2 - Insert a string at a specific position
3 - Delete a portion of the string
4 - Exit
Enter your choice(1-4): 1
Enter another string to concatenate:  Welcome
Now new string is: Hello World Welcome
--------------------

MENU1:
1 - Append a string
2 - Insert a string at a specific position
3 - Delete a portion of the string
4 - Exit
Enter your choice(1-4): 2

MENU2:
1 - Insert at the beginning
2 - Insert at the end
3 - Replace part of string (in between)
Enter your choice: 3
Enter starting index: 6
Enter ending index(exclusive): 11
Enter a string to replace in the specified range: India
Now new string is: Hello India Welcome
--------------------

MENU1:
1 - Append a string
2 - Insert a string at a specific position
3 - Delete a portion of the string
4 - Exit
Enter your choice(1-4): 3
Enter starting and ending index(exclusive) to delete: 12 19
Now new string is: Hello India
--------------------

MENU1:
1 - Append a string
2 - Insert a string at a specific position
3 - Delete a portion of the string
4 - Exit
Enter your choice(1-4): 4
Invalid choice!
--------------------
*/

