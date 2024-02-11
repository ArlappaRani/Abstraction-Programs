package com.multipltinheritance.abs;



class ProgramChild1 extends Program2//single inheritance
{
	void sub()
	{
		System.out.println("Dispaly");
}

//public class ProgramChild1 extends Program1,Program2
//{
	//error because we can not achieve multiple Inheritance
	//over ride
	void add()
	{
		System.out.println("Addition");
	}
	


}
