package com.abstarct.questions;

abstract class AccessModifiersInabs {
	//declaring access modifiers in abstract methods
	public abstract void display1();
	protected abstract void display2();
	 abstract void display3();
	// private abstract void display4();
	 
	 
	 
	 //error bcz private access modifier can not be declared
	 //in abstract class bcz method over ridding is not
	 //possible private not access the child classes
}
