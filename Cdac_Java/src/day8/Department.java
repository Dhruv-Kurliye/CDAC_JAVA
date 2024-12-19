package day8;

public class Department {
	private String empid;
	private String deptname;
	
	
	
	public Department(String empid, String deptname) {
		this.empid = empid;
		this.deptname = deptname;

	}
	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	

}
