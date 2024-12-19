package day3;

public class EmployeePortal {
	public static void main(String[] args) {
		Payroll payroll = new Payroll();
		
		SalariedEmployee se = new SalariedEmployee(345,"aaa",80000);
		payroll.displayGross(se);
		payroll.displayNet(se);
		
		//up casting
		Employee [] emps = new Employee[3];
		emps[0] = new SalariedEmployee(888,"dhruv",9000);
		emps[1] = new SalariedEmployee(988,"harshal",8000);
		emps[2] = new SalariedEmployee(878,"sachin",900);
		
		//down casting
		payroll.displayGross(emps[0]);
		SalariedEmployee ss = (SalariedEmployee)emps[0];
		SalariedEmployee s1 = (SalariedEmployee)emps[1];
		payroll.displayNet(s1);
		payroll.displayNet(ss);
		
		for(Employee e : emps) {
			payroll.displayGross(e);
			if(e instanceof ManagerEmployee) {
				((ManagerEmployee)e).calculateGross();
			}
		}
		
	}
//	public void displayGross(Employee e)

}
