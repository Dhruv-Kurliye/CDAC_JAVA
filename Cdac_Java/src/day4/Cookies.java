package day4;

public class Cookies extends Desserts {
	private static final double base_price = 100;
	private String flavour;
	public Cookies(int quantity, String type, String flavour){
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

	    @Override
	    public String toString() {
	        return "Dessert: " + type.toUpperCase() + ", Quantity: " + quantity + ", Flavour: " + flavour;
	    }
	}