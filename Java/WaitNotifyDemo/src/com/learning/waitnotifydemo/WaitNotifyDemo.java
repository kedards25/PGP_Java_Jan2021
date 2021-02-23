package com.learning.waitnotifydemo;

public class WaitNotifyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account person=new Account();
		
		//withdrawer and depositor are sharing common object of Account
		Withdrawer withdrawer=new Withdrawer(person);
		Depositor depositor=new Depositor(person);
		
		Thread withThread=new Thread(withdrawer);
		Thread depoThread=new Thread(depositor);
		
		withThread.setPriority(10);
		
		withThread.start();
		depoThread.start();
	}

}
