package Day1;

public class Account {
	
	private int accid;
	private String name;
	
	private static float intrate;
	
	static {
		System.out.println("Static block 1");
		intrate=100;
		
	}
	
	static {
		System.out.println("Static block 2");
		intrate=1000;
		
	}
	
	public Account(){
//		accid=10000;
//		name="Honey Singh";
		this(10000,"Mika Singh");
	}
	
	public Account(int accid, String name) {
		this.accid=accid;
		this.name=name;
	}
	
	public static void displayInterestRate() {
		System.out.println("Current interst rate for account : " + intrate);
	}
	
	public static void main(String args[]) {
		Account.displayInterestRate();
//		Account a= new Account();
//		a.displayInterestRate();
//		System.out.println(a.name);
	}
}  
