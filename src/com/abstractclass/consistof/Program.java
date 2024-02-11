package com.abstractclass.consistof;

abstract class Program {
	
	//static variables
	static int x,y;
	//Non static variables
	int p,q;
	
	
	//static block
	static
	{
		System.out.println("Inside static block");
	}
	//Non static block
	{
		System.out.println("Inside non static block");
	}
	
	
	//static method
	static void display1()
	{
		System.out.println("Inside static method display1");
	}
	//Non static method
	void display2()
	{
		System.out.println("Inside non static mehtod");
	}
	//abstract method 
	abstract void display3();
	
	
	//Constructor
	public Program()
	{
		System.out.println("Inside Program constructor");
	}
	
	
	//main method
    public static void main(String[] args) {
       System.out.println("Inside main method");

	}

}
