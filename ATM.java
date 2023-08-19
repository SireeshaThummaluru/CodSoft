package siri1;
import java.util.Scanner;
public class AtmInterface {
	public static void main(String args[]) {
		int balance = 5000, withdraw, deposit;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("Automated Teller Machine");
		System.out.println("Choose 1 for withdraw");
		System.out.println("Choose 2 for Deposit"); 
		System.out.println("Choose 3 for Check Balance");
		System.out.println("Choose 4 for EXIT");
		System.out.print("Choose the operation you want to perform:");

		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
	System.out.print("Enter money to be withdrawn:");
	withdraw = sc.nextInt();
	if(balance >= withdraw)
	{
		balance=balance-withdraw;
		System.out.println("Please collect your money");
	}
	else
	{
		System.out.println("Insufficient Balance");
	}
	System.out.println("");
	break;
	
		case 2:
		System.out.print("Enter money to be deposited:");
		deposit = sc.nextInt();
		balance = balance + deposit;
		System.out.println("Your Money has been successfully depsited");
		System.out.println("");
		break;
		
		case 3:
			//displaying the total balance of the user
			System.out.println("Balance: "+balance);
			System.out.println("");
			break;
			
		case 4:
			//exit from the menu
			System.exit(0);
			sc.close();
		}
		}
	}}
	

			
			
			

