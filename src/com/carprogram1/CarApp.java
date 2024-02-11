package com.carprogram1;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the objects of child classes
		Cardetails cd=new Cardetails();
		ElectricCar ec=new ElectricCar();
		PetrolCar pc=new PetrolCar();
		DiesalCar dc=new DiesalCar();
		cd.doActivity(ec);
		System.out.println("------------------------");
		cd.doActivity(pc);
		System.out.println("------------------------");
		cd.doActivity(dc);
		System.out.println("------------------------");
		
		
		
	
}

}
