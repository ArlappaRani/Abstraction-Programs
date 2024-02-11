package com.pure.impureabs;


//it is not mandatory to mention abstract class
 abstract class Program3 {
	//concrete method
	void add()
	{
		int a=10;
		int b=12;
		int c=a+b;
		System.out.println(c);
	}
	//concrete method
	void sub()
	{
		int a=10;
		int b=9;
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[]args)
	{
		//Program3 p3=new Program3();//error can not instantiate bcz abstract class
		//p3.add();
	}

}
