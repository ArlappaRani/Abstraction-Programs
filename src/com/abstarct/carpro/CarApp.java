package com.abstarct.carpro;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the object
		ElectricCar ec=new ElectricCar();
		PetrolCar pc=new PetrolCar();
		DieselCar dc=new DieselCar();
		
		CarApp.doActivity(ec);
		System.out.println("----------------------");
		CarApp.doActivity(pc);
		System.out.println("--------------------------");
		CarApp.doActivity(dc);
		
		
	}
		
      static void doActivity(Car cr)
	{
		cr.Start();
		cr.Stop();
		cr.refuel();
		
	}
		
		

	

}
