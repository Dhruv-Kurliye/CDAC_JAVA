package day4;

public class Candies extends Desserts {
	private static final double base_price = 50;
	private String flavour;
	public Candies(int quantity, String type, String flavour){
		super(quantity,type);
		this.flavour =flavour;
	}
	
	@Override
	public double calculate_price() {
		
		
		double Total = base_price * quantity;
		
		return Total;
	}

	@Override
	public String getFlavour() {
		
		return flavour;
	}
	public String toString() {
        return "Dessert: " + type.toUpperCase() + ", Quantity: " + quantity + ", Flavor: " + flavour;
    }
	
}
