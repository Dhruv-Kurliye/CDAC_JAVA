package day2;

import java.lang.reflect.Array;
import java.util.Arrays;

import Day1.NewDate;
import day9.Date;

public class Math {
	public static int increment(int num) {
		num+=1;
		return num;
	}
	
	public static void incremant_date(NewDate d) {
		int day=d.getDay();
		d.setDay(day+1);
		
	}
	
	public static void Bubble_sort(int arr[]) {
		
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int n=10;
		System.out.println("Before Increment : "+ n);
		n=increment(n);
		System.out.println("After increment : " + n);
		
		NewDate d= new NewDate();
		d.setDay(2);
		d.setMonth("June");
		d.setYear(2003);
		System.out.println("Before: \n"+d);
		incremant_date(d);
		System.out.println("After: \n"+d);
		int arr[]= {1,5,6,2};
		Bubble_sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n"+Arrays.toString(arr));
		
	}

}
