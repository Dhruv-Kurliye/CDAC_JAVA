package day7;

import java.util.ArrayList;
import java.util.List;

import day5.Employee;

public class Toy implements Comparable<Toy> {
	
	protected int Toy_ID;
	protected String Toy_name;
	protected double Toy_price;
	protected int age;
	protected int Month;
	protected int Year;
	protected String Category;

	


	public Toy(int toy_ID, String toy_name, double toy_price, int age, int month, int year, String category) {
		this.Toy_ID = toy_ID;
		this.Toy_name = toy_name;
		this.Toy_price = toy_price;
		this.age = age;
		this.Month = month;
		this.Year = year;
		this.Category = category;
	}




	@Override
	public String toString() {
		return "Toy [Toy_ID=" + Toy_ID + ", Toy_name=" + Toy_name + ", Toy_price=" + Toy_price + ", age=" + age
				+ ", Month=" + Month + ", Year=" + Year + ", Category=" + Category + "]";
	}




	public int getToy_ID() {
		return Toy_ID;
	}




	public void setToy_ID(int toy_ID) {
		Toy_ID = toy_ID;
	}




	public String getToy_name() {
		return Toy_name;
	}




	public void setToy_name(String toy_name) {
		Toy_name = toy_name;
	}




	public double getToy_price() {
		return Toy_price;
	}




	public void setToy_price(double toy_price) {
		Toy_price = toy_price;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public int getMonth() {
		return Month;
	}




	public void setMonth(int month) {
		Month = month;
	}




	public int getYear() {
		return Year;
	}




	public void setYear(int year) {
		Year = year;
	}




	public String getCategory() {
		return Category;
	}




	public void setCategory(String category) {
		Category = category;
	}




	@Override
	public int compareTo(Toy o) {
		if(this.Toy_ID < o.Toy_ID)
			return -1;
		else
			return this.Toy_ID-o.Toy_ID;
	}
	
	
	
//	
//	public List<Toy> FilterByCategory(List<Toy> toy,String criteria) {
//		List <Toy> filter=new ArrayList<Toy>();
//		for (Toy a : toy ) {
//			String x=a.getCategory();
//			if (x.equalsIgnoreCase(criteria)) {
//				filter.add(a);			
//				}
//			if(x.equalsIgnoreCase(criteria)) {
//				filter.add(a);
//			}
//		}
//		return filter;


	

	}
