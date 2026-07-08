package test;

public class Car {
	
	String model;
	int speed;
	
	Car (String model, int speed){
		this.model = model;
		this.speed = speed;
	}
	
	void display() {
		System.out.println("Car model is: "+this.model);	
		System.out.println("Car speed is: "+this.speed);
	}
	int increaseSpeed(int value) {
		this.speed = this.speed+value;
		return this.speed;
	}
	
	
	
	public static void main(String[] args) {
		Car car = new Car("Brezza", 40);
		car.increaseSpeed(30);
		car.display();
	}
}
