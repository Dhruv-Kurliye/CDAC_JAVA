package Day1;

public class NewDate {
	
	//variable declaration
	private int day;
	private String month;
	private int year;
	
//	method
	public void setDay(int day) {
		if(day<0)
			System.out.println();
		else
			this.day=day;
	}
//	calling the function it returns
	public int getDay() {
		return day;
	}
	
	public void setMonth(String month) {
		this.month=month;
	}
	
	public String getMonth() {
		return month;
	}
	
	public void setYear(int year) {
			this.year=year;
	}
	
	public int getYear() {
		return year;
	}
	
	public String toString() {
		return day + "/" + month + "/" + year;
	}
	
//	main function print the values
	public static void main(String[] args) {
		NewDate d=new NewDate();
		d.setDay(11);
		d.setMonth("oct");
		d.setYear(2001);
		
//		System.out.println(d.getDay());
//		System.out.println(d.getMonth());
//		System.out.println(d.getYear());
		System.out.println(d);
	}

}
