package day3;

public class SalariedEmployee extends Employee {
	
	protected double basic;
	
	public SalariedEmployee(int empid, String name,double basic) {
		super(empid, name);
		this.basic=basic;
		
	}

	@Override
	public double calculateGross() {
		double hra = basic * 0.40;
		double da = basic * 0.12;
		return hra + da + basic;
	}
	public double calculateNet() 
	{
		double gross = this.calculateGross();
		double tax = gross * 0.20;
		return gross - tax;
		
	}
}
