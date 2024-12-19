package day5;

import java.util.Scanner;

public class Bank {
	static int Balance=10000;
	
	public static void withdraw() throws InsufficientFundException  {
		long amount;
		System.out.println("Enter Withdrawal Amount: ");
		Scanner sc = new Scanner(System.in);
		amount = sc.nextInt();
	
		if (amount>Balance) {
			throw new InsufficientFundException("No sufficient Balance in account");
		}
		else {
		Balance-=amount;
		System.out.println("The amount after withdrawal : "+Balance);	}
		
		
		
	}
	
	public static void Deposit() throws DenominationException {
		int Deposit_amount;
		System.out.println("Enter Deposit Amount: ");

		Scanner sc = new Scanner(System.in);
		Deposit_amount = sc.nextInt();
		
		if(Deposit_amount%10!=0)  {
			throw new DenominationException("Enter valid Denomination!");
		}
		else {
		Balance+=Deposit_amount;
		}
	}
	
	
	public static void main(String[] args) 
	{
//		Bank b = new Bank();
		try {
			Deposit();
			}
			catch (DenominationException e) {
				System.out.println(e.getMessage());
			}
		try {
		withdraw();
		}
		catch (InsufficientFundException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
