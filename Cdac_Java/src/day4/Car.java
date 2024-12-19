package day4;

import java.util.Objects;

public class Car implements Cloneable {
	private String make;
	private String model;
	private int price;
	public Car(String make, String model, int price) {
		this.make = make;
		this.model = model;
		this.price = price;
	}
	@Override
	public boolean equals(Object o) {
		Car other = (Car)o;
		return this.make.equals(other.make) && this.model.equals(other.model) && this.price==other.price;	
	}

    @Override
    public int hashCode() {
        return Objects.hash(make, model, price); // Generate hash code using fields
    }

    @Override
    public String toString() {
        return "Car{make='" + make + "', model='" + model + "', price=" + price + '}';
    }
    
    public Object clone() throws CloneNotSupportedException {
    	return super.clone();
    	
    }
	public void setPrice(int i) {
		this.price = i;
		
	}
	public void setModel(String string) {
		this.model = string;
		
	}
}