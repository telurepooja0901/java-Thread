package com.javaThreads;

public class Example5TestClas {

	public static void main(String[] args) 
	{
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		
		System.out.println("The Thread Name is:" + t1.getName());
		System.out.println("The Thread Name is:" + t2.getName());
		System.out.println("The Thread Name is:" + t3.getName());
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}

