package day2;

import java.util.Scanner;

public class Year {
	public static void main(String[] args) 
	{
		Month month = Month.JAN;
		
		switch(month) {

		case JAN:
            System.out.println("January");
            break;
        case FEB:
            System.out.println("February");
            break;
        case MARCH:
            System.out.println("March");
            break;
        case APRIL:
            System.out.println("April");
            break;
        case MAY:
            System.out.println("May");
            break;
        case JUNE:
            System.out.println("June");
            break;
        case JULY:
            System.out.println("July");
            break;
        case AUG:
            System.out.println("August");
            break;
        case SEP:
            System.out.println("September");
            break;
        case OCT:
            System.out.println("October");
            break;
        case NOV:
            System.out.println("November");
            break;
        case DEC:
            System.out.println("December");
            break;
        default:
            System.out.println("Invalid month.");
            break;
		}
		System.out.println("*********************MENU*********************");
		Month[] menu= Month.values();
		for(Month m : menu) 
		{
			System.out.println(m);
		}
		System.out.println("Enter The month");
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		
		Month m = Month.valueOf(choice.toUpperCase());
		System.out.println("Selected month is : " + m);
		System.out.println("Days in " + m + " = "+ m.getMonth());
			
	}
	
	
}
