package day4;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private double total =0;
	private int count=0;
	List<Desserts> desserts = new ArrayList<>();
	public void addToCart(Desserts d) {
	    count+=d.quantity;
		total+=d.calculate_price();
		desserts.add(d);
	}
	
	public void display_Cart() {
		
		System.out.println("The total Bill is : "+ total + "and the items in carts is : "+ count);
		System.out.println("The Items are: ");
		for(Desserts d:desserts) {
			System.out.println(d+ " ");
			
		}
	}
	


}
