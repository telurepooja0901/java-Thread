package com.javaThreads;

public class Example3TestClass {

	public static void main(String[] args) 
	{
		Example3 example = new Example3();
		Thread thread1 = new Thread(example);
		
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
	}

}
