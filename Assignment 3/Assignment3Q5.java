import java.lang.*;
import java.util.Scanner;

public class Assignment3Q5 
{

    	// 1. User-defined method to find the length of a string
    	public static int findLength(String str) 
	{
        	int length=0;
        	for(char c : str.toCharArray()) 
		{
            		length++;
        	}
        	return length;
    	}

    	// 2. User-defined method to convert uppercase to lowercase
    	public static String convertToLower(String str) 
	{
        	StringBuilder result = new StringBuilder();
        	for(char c : str.toCharArray()) 
		{
            		if (c >= 'A' && c <= 'Z') 
                		result.append((char)(c + 32));
			else 
                		result.append(c);
            	}
        	return result.toString();
    	}

    	// 3. User-defined method to check if string contains a specific substring
    	public static boolean hasSubString(String st, String sub) 
	{
    		char ch1[] = convertToLower(st).toCharArray();
    		char ch2[] = convertToLower(sub).toCharArray();

    		int j = 0;
    		while (j <= ch1.length - ch2.length) 
		{
        		boolean match = true;
        		for(int i=0; i<findLength(sub); i++) 
			{ 
            			if (ch1[i + j] != ch2[i]) 
				{
                			match = false;
                			break;
            			}
        		}
        		if (match) return true; // Found full match
        		j++;
    		}
    		return false; // No match found
	}


    	// 4. User-defined method to replace all occurrences of a character
    	public static String replaceChar(String st, char oldChar, char newChar) 
	{
    		char ch[] = st.toCharArray();

    		for (int i=0; i<findLength(st); i++) 
		{ 
        		if (ch[i] == oldChar) 
            			ch[i] = newChar;
        	}

    		String result = new String(ch);
    		return result;
	}


    	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int choice;
        do 
	{
            	System.out.println("\n--- MENU ---");
            	System.out.println("1. Find Length");
            	System.out.println("2. Convert to Lowercase");
            	System.out.println("3. Check for Substring");
            	System.out.println("4. Replace Character");
            	System.out.println("5. Exit");
            	System.out.print("Enter your choice (1-5): ");
            	choice = sc.nextInt();
            	sc.nextLine(); // Consume newline

            	switch (choice) 
		{
                	case 1:
                    		System.out.println("Length of the string: " + findLength(str));
                    		break;

                	case 2:
                    		System.out.println("Lowercase string: " + convertToLower(str));
                    		break;

                	case 3:
                    		System.out.print("Enter a substring to search: ");
                    		String sub = sc.nextLine();
                    		System.out.println("Substring found? " + hasSubString(str, sub));
                    		break;

                	case 4:
                    		System.out.print("Enter character to replace: ");
                    		char oldChar = sc.next().charAt(0);
                    		System.out.print("Enter new character: ");
                    		char newChar = sc.next().charAt(0);
                   		str = replaceChar(str, oldChar, newChar); // update string
                    		System.out.println("Modified string: " + str);
                    		sc.nextLine(); // Consume newline
                    		break;

                	case 5:
                    		System.out.println("Exiting the program.");
                    		break;

                	default:
                    		System.out.println("Invalid choice! Please enter 1-5.");
            	}
	System.out.println("--------------------");
        } while (choice != 5);

        sc.close();
    }
}
/*
OUTPUT:
H:\Java_Assignment\Assignment_3>javac Assignment3Q5.java

H:\Java_Assignment\Assignment_3>java Assignment3Q5
Enter a string: KOHIL SARKAR

--- MENU ---
1. Find Length
2. Convert to Lowercase
3. Check for Substring
4. Replace Character
5. Exit
Enter your choice (1-5): 1
Length of the string: 12
--------------------

--- MENU ---
1. Find Length
2. Convert to Lowercase
3. Check for Substring
4. Replace Character
5. Exit
Enter your choice (1-5): 2
Lowercase string: kohil sarkar
--------------------

--- MENU ---
1. Find Length
2. Convert to Lowercase
3. Check for Substring
4. Replace Character
5. Exit
Enter your choice (1-5): 3
Enter a substring to search: sarkar
Substring found? true
--------------------

--- MENU ---
1. Find Length
2. Convert to Lowercase
3. Check for Substring
4. Replace Character
5. Exit
Enter your choice (1-5): 4
Enter character to replace: A
Enter new character: O
Modified string: KOHIL SORKOR
--------------------

--- MENU ---
1. Find Length
2. Convert to Lowercase
3. Check for Substring
4. Replace Character
5. Exit
Enter your choice (1-5): 5
Exiting the program.
--------------------
*/