package com.javaThreads;

public class Example2TestClass {

	public static void main(String[] args) 
	{
		
		Example2 example1 = new Example2();
		Thread thread1 = new Thread(example1);
		thread1.start();
	}

}
