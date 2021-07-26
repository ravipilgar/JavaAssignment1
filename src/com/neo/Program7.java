package com.neo;

import java.util.Scanner;

class Account{
	private double balance = 0;
	
	Account(){}
	
	Account(double bal){
		this.balance = bal;
	}
	
	public void withdraw(double withdraw_amount) throws InsufficientBalException {
		try {
			if(withdraw_amount>balance) {
				throw new InsufficientBalException("You have insufficient balance");	
			}
			else
			{
				balance = balance - withdraw_amount;
			}	
		}
		catch (InsufficientBalException e) {
			System.out.println("Exception occured: "+e.getMessage());
		}
	}
	
	public void showBalance() {
		System.out.println("Your current balance is: "+balance);
	}
}

public class Program7 {

	public static void main(String[] args) throws InsufficientBalException {
		
		double withdrawl_amount;
		Scanner sc = new Scanner(System.in);
		
		Account acc = new Account(25000);
		
		System.out.println("Enter amount to be withdarwn: ");
		withdrawl_amount = sc.nextDouble();
		
		acc.withdraw(withdrawl_amount);
		acc.showBalance();
	}

}
