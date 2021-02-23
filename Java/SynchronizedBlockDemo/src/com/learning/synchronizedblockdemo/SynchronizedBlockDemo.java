package com.learning.synchronizedblockdemo;


public class SynchronizedBlockDemo implements Runnable {

	@Override
	public void run() {
		
		synchronized(this)
		{
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName()+"-"+i);
			}
		}
		
		System.out.println("outside sync block "+Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {

		SynchronizedBlockDemo demo=new SynchronizedBlockDemo();
		
		Thread thread1=new Thread(demo);
		Thread thread2=new Thread(demo);
		Thread thread3=new Thread(demo);
		Thread thread4=new Thread(demo);
		
		thread1.setName("Thread 1");
		thread2.setName("Thread 2");
		thread3.setName("Thread 3");
		thread4.setName("Thread 4");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

	}

}
