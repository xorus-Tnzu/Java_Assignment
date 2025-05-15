import java.lang.*;
import java.util.Scanner;

public class Assignment3Q6
{
    public static String reverse(String str)
    {
        StringBuffer rev = new StringBuffer();
        for (int i = 0; i < str.length(); i++)
        {
            rev.append(str.charAt(str.length() - i - 1));
        }
        return rev.toString();
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("Reversed String: " + reverse(str));
        
        sc.close();
    }
}
/*
OUTPUT:
H:\Java_Assignment\Assignment_3>javac Assignment3Q6.java

H:\Java_Assignment\Assignment_3>java Assignment3Q6
Enter a String:
Hello World
Reversed String: dlroW olleH
*/