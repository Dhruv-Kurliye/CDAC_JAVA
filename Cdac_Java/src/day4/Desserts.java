package day4;

public abstract class Desserts {
	protected int quantity;
	protected String type;
	
	public Desserts(int quantity, String type){
		this.quantity = quantity;
		this.type=type;
	}
	
	public abstract double calculate_price();
	
	public abstract String getFlavour();
	
}
