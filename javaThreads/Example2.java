package com.javaThreads;

public class Example2 implements Runnable
{
	
	public void run()
	{
		int value = 1;
		
		while(value <= 1000)
		{
			System.out.println(Thread.currentThread()+ ": "+value);
		}
	}
}
