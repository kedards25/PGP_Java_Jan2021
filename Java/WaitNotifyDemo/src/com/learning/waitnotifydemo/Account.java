package com.learning.waitnotifydemo;

public class Account {
	int balance = 10000;

	synchronized void withdraw(int amount) 
	{
		System.out.println("Withdrawal going on..");
		if (balance < amount) {

			try {
				System.out.println("Insufficient amount..please deposit money");
				System.out.println("Withdrawal paused..waiting for money to be deposited");

				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance-=amount;	//balance=balance-amount
			System.out.println("Balance after withdrawal: "+balance);
		}
		else
		{
			balance-=amount;
			System.out.println("Balance after withdrawal: "+balance);
		}
	}
	
	synchronized void deposit(int amount)
	{
		System.out.println("deposit process started..");
		balance+=amount;
		notify();
		System.out.println("Balance after depositing: "+balance);
	}
}
