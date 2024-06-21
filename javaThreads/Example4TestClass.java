package com.javaThreads;

public class Example4TestClass
{

	public static void main(String[] args)
	{


		Example4 example = new Example4();		
		Thread t1 = new Thread(example);
		
		t1.setName("My Country Name is INDIA");
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();		
		

	}

}
