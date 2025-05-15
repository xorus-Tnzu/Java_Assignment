import java.lang.*;
import java.util.Scanner;
class BankAccount
{
	private String accountNumber;
	private float balance;
	
	public BankAccount(String accountNumber,float balance)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;	
	}
	public void deposit(float amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Deposited: "+amount);
		}
		else
		{
			System.out.println("Invalid Deposit Amount.");
		}
	}
	public void withdraw(float amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance-=amount;
			System.out.println("Withdrawn: "+amount);
		}
		else
		{
			System.out.println("Invalid or Insufficient Amount.");
		}
	}
	public void display()
	{ 
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Current Balance: "+balance);
	}

}
public class Assignment2Q2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Account Number: ");
		String accNum=sc.nextLine();
			
		System.out.println("Enter Initial Balance: ");
		float initBalance=sc.nextFloat();
		
		BankAccount userAccount = new BankAccount(accNum,initBalance);
		
		int choice;
		do
		{
			System.out.println("\nMenu:");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Display Account Details");
			System.out.println("4.Exit");
			
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();

			switch(choice)
			{
				case 1: 
					System.out.println("Enter amount to Deposit: ");
					float depositAmount=sc.nextFloat();
					userAccount.deposit(depositAmount);
					break;
				case 2:
					System.out.println("Enter amount to Withdraw: ");
					float withdrawAmount=sc.nextFloat();
					userAccount.withdraw(withdrawAmount);
					break;
				case 3:
					userAccount.display();
					break;
				case 4:
					System.out.println("Thank You! Exiting.....");
					break;
				default:
					System.out.println("Invalid Choice! Please Try Again.");
					break;
			}
		}while(choice!=4);
		
		sc.close();
	}
}
/*
OUTPUT-1:
H:\Java_Assignment\Assignment_2>javac Assignment2Q2.java

H:\Java_Assignment\Assignment_2>java Assignment2Q2
Enter Account Number:
SBIN203475954
Enter Initial Balance:
5000

Menu:
1.Deposit
2.Withdraw
3.Display Account Details
4.Exit
Enter your choice:
1
Enter amount to Deposit:
100
Deposited: 100.0

Menu:
1.Deposit
2.Withdraw
3.Display Account Details
4.Exit
Enter your choice:
3
Account Number: SBIN203475954
Current Balance: 5100.0

Menu:
1.Deposit
2.Withdraw
3.Display Account Details
4.Exit
Enter your choice:
2
Enter amount to Withdraw:
4000
Withdrawn: 4000.0

Menu:
1.Deposit
2.Withdraw
3.Display Account Details
4.Exit
Enter your choice:
3
Account Number: SBIN203475954
Current Balance: 1100.0

Menu:
1.Deposit
2.Withdraw
3.Display Account Details
4.Exit
Enter your choice:
4
Thank You! Exiting.....

*/