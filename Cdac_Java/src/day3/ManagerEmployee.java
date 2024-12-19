package day3;

public class ManagerEmployee extends SalariedEmployee{
	protected double allowance;

	public ManagerEmployee(int empid, String name, double basic , double allowance) {
		super(empid, name, basic);
		this.allowance = allowance;
	}
	@Override
    public double calculateGross() {
        double baseGross = super.calculateGross(); 
        return baseGross + allowance; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Allowance - " + allowance;
}
} 
