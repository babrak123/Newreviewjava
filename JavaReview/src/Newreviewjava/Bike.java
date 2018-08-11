package Newreviewjava;

public class Bike extends vehicle {
    
	int speed=10;
	
	void move() {
		System.out.println("bike is moving at speed.."+speed);
	}
	
	public static void main(String[] args) {
		Bike b=new Bike ();
	//	b.move();  method call happenns at compile time
		
		vehicle v=new Bike();//upcasting  

	}

}
