package com.abstarct.questions;

abstract class StaticInAbstractProgram {
	//abstract method
 //static abstract void display1();
	//error ,abstract method can not declared as static
	//abstract ,static both purposes are different
	
	
	//concrete method
  static void display2()
	{
		System.out.println("Dispaly");
	}
//No error,concrete method will be declared as static 
  
  
}
