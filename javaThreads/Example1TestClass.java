package com.javaThreads;

public class Example1TestClass {

	public static void main(String[] args) 
	{
		Example1 example = new Example1();
		Thread thread1 = new Thread(example);
		thread1.start();


	}

}
