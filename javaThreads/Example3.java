package com.javaThreads;

public class Example3 implements Runnable
{
	public void run()
	{
		int a;

		for(a = 1; a <= 10; a++)
		{
			System.out.println(Thread.currentThread() +":" +a);
			
			try 
			{
				Thread.sleep(100);	
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	
}
