package com.parentchild;

public class ParentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Parent p=new Parent();//error,abstract classes can not instantiated
		Child c=new Child();
	//	p=c; 
	//	p.display();
		c.display();;

}
}
