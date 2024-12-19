package day3;

public class contractedEmployee extends Employee{
	protected int hrs;
	protected double wage;

	public contractedEmployee(int empid, String name , int hrs, double wage) {
		super(empid, name);
		this.hrs = hrs;
		this.wage = wage;
	}

	@Override
	public double calculateGross() {
		double gross = wage * hrs;
		return gross;
	}
	

}
