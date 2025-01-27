package day9;

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
     
    public int getMonthAsNumber() {
        switch (month.toLowerCase()) {
            case "jan": return 1;
            case "feb": return 2;
            case "march": return 3;
            case "april": return 4;
            case "may": return 5;
            case "june": return 6;
            case "july": return 7;
            case "aug": return 8;
            case "sept": return 9;
            case "oct": return 10;
            case "nov": return 11;
            case "dec": return 12;
            default: return -1; 
        }
    }
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
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
