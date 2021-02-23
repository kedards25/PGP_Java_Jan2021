package com.learning.synchronizeddemo;

public class SynchronizedDemo implements Runnable {

	@Override
	public void run() {
		show();
		
	}
	
	public synchronized void show()
	{
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}
	
	public static void main(String[] args) {
		
		SynchronizedDemo demo=new SynchronizedDemo();
		
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
