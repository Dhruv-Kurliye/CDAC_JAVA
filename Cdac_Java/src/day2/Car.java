package day2;



public class Car {
	private String make;
	private String mode1;
	private Date purchasedate;
	
	public Car(String make, String mode1, Date purchasedate) {
	this.make = make;
	this.mode1 = mode1;
	this.purchasedate = purchasedate;
}
public String toString() 
{
	return "Car Make - " + make + " , mode1 - " + mode1 + " , purchasedate - " + purchasedate; 
} 

public static void main(String[] args) {
	Car car = new Car("Honda", "city", new Date(21,"mar",2022));
	System.out.println(car);
}
}