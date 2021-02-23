package com.learning.reentrantlockdemo;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo implements Runnable {

	//if Reentrant lock is given a boolean param then
		//the thread which is waiting for the highest time will 
		//acquire the lock as soon as it is released by current thread
		//This is called as fair lock
		//final ReentrantLock rLock=new ReentrantLock(true);
	final ReentrantLock rLock=new ReentrantLock(true);
	
	public void show()
	{
		//once a lock is been acquired by a thread
		//then it keeps reentering in the same lock
		//again and again and hence it is called as
		//Reentrant lock
		rLock.lock();
		rLock.lock();
		rLock.lock();
		
		System.out.println(Thread.currentThread().getName()+" has acquired lock");
		System.out.println(Thread.currentThread().getName()+" has acquired total"+
															rLock.getHoldCount()+" locks");
		
		rLock.unlock();
		rLock.unlock();
		rLock.unlock();
		System.out.println(Thread.currentThread().getName()+" has released the lock");
	}
	
	@Override
	public void run() {
		show();
		
	}

	
	public static void main(String[] args) {
		ReentrantLockDemo demo=new ReentrantLockDemo();
		
		//Thread object should share the common copy of 
		//object of the class otherwise all threads will 
		//execute separate process
		Thread thread1=new Thread(demo);
		Thread thread2=new Thread(demo);
		Thread thread3=new Thread(demo);
		Thread thread4=new Thread(demo);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}


}

