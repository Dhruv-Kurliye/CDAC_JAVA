package day2;

public class Date {
	//variable declaration
	private int day;
	private String month;
	private int year;
	
	public Date(int i, String string, int j) {
		this.day = i;
		this.month = string;
		this.year = j;
			
	}

	//method declaration
	public void setDate(int d, String m, int y) {
		day=d;
		month=m;
		year=y;
		
	}
	public String displayDate() {
		return "Date: " + day + "/" +month +"/" + year;
	}
	
	public String toString() {
		return "Date: " + day + "/" +month +"/" + year;
	}
}