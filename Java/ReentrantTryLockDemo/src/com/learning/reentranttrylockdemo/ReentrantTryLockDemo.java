package com.learning.reentranttrylockdemo;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantTryLockDemo implements Runnable {

	final ReentrantLock rLock=new ReentrantLock(true);
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" has fairness enabled: "+rLock.isFair());
		
		if(rLock.tryLock())
		{
				System.out.println(Thread.currentThread().getName()+" is in tryLock");
				
				try
				{
					throw new Exception();
				}
				catch (Exception e) {
					System.out.println(Thread.currentThread().getName()+" threw an exception");
				}
				finally {
					rLock.unlock();
					System.out.println(Thread.currentThread().getName()+" is releasing the tryLock");
				}
		}
		
	}
	
	public static void main(String[] args) {
		
		ReentrantTryLockDemo reLock=new ReentrantTryLockDemo();
		Thread t1=new Thread(reLock);
		Thread t2=new Thread(reLock);
		Thread t3=new Thread(reLock);

		t1.start();
		t2.start();
		t3.start();
		
	}




}
