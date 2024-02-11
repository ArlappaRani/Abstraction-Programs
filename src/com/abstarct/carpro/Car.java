package com.abstarct.carpro;

    abstract class Car{


    void Start()
	{
		System.out.println("Car is starting");
	}
	void Stop()
	{
		System.out.println("Car is stoping");
	}
	//when we create a abstract method we have to create abstract class
	 abstract void refuel();
	
		
	

}
