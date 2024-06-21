package com.javaThreads;

public class Example4 implements Runnable
{

	public Example4()
	{
		
	}
	
	public void run() 
	
	{
		for(int i = 1; i <= 100; i++)
		{
			System.out.println(Thread.currentThread()+" : "+i);
			try
			{
				Thread.sleep(0);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
