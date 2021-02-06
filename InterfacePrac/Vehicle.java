package InterfacePrac;

import java.io.*; 

interface Vehicl { 

	void changeGear(int a); 
	void speedUp(int a); 
	void applyBrakes(int a); 
} 

class Bicycle implements Vehicl{ 
	
	int speed; 
	int gear; 
 
	@Override
	public void changeGear(int newGear){ 
		
		gear = newGear; 
	} 
	

	@Override
	public void speedUp(int increment){ 
		
		speed = speed + increment; 
	} 
	

	@Override
	public void applyBrakes(int decrement){ 
		
		speed = speed - decrement; 
	} 
	
	public void printStates() { 
		System.out.println("speed: " + speed 
			+ " gear: " + gear); 
	} 
} 

class Bike implements Vehicl { 
	
	int speed; 
	int gear; 

	@Override
	public void changeGear(int newGear){ 
		
		gear = newGear; 
	} 
	
	@Override
	public void speedUp(int increment){ 
		
		speed = speed + increment; 
	} 
	
	@Override
	public void applyBrakes(int decrement){ 
		
		speed = speed - decrement; 
	} 
	
	public void printStates() { 
		System.out.println("speed: " + speed 
			+ " gear: " + gear); 
	} 
	
	public void say()
	{
		System.out.println("I am accessible only from Bike referenced object");
	}
	
} 
class Vehicle { 
	
	public static void main (String[] args) { 

		Bicycle bicycle = new Bicycle(); 
		bicycle.changeGear(2); 
		bicycle.speedUp(3); 
		bicycle.applyBrakes(1); 
		
		System.out.println("Bicycle present state :"); 
		bicycle.printStates(); 
	
		Bike bike = new Bike(); 
		bike.changeGear(1); 
		bike.speedUp(4); 
		bike.applyBrakes(3); 
		
		System.out.println("Bike present state :"); 
		bike.printStates(); 
		bike.say();
		
		System.out.println("Bike present state (Interface reference):"); 
		Vehicl v = new Bike();
		v.changeGear(6);
		v.speedUp(8);
		v.applyBrakes(3);
		System.out.println("Bike present state (Interface reference) cannot access printStates"); 
	} 
} 
