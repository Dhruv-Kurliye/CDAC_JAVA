package day2;
import Day1.NewDate;
import day9.Date;

public class DemoArray {
	
	public static void main(String[] args) {
		int $arr[]= {12, 13,14,15,16};
		for (int i : $arr) {
			if(i%2==0)
				System.out.println("Even");
			else
				System.out.println("Odd");
		}
//		
//		Date[] dd = new Date[3];
//		dd[0] = new Date();
//		dd[0].setDate(2, "June", 2003);
//		dd[1] = new Date();
//		dd[1].setDate(4, "June", 2063);
//		dd[2] = new Date();
//		dd[2].setDate(34, "June", 2013);
//		dd[0].displayDate();
//		dd[1].displayDate();
//		dd[2].displayDate();
		
	}

}
