package com.abstractclass.consistof;

public class ParentChildApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling static method using child class
		Child1.display1();
		
		//creating object
		Child1 ch=new Child1();
		
		//calling non static method
		ch.display2();
		
		//calling over ridden method
		ch.display3();
		
		

	}

}
