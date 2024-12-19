package day3;

import java.util.Arrays;

public class StringOperations {
	
	public static int upper(String s1) {
		char[] arr1 = s1.toCharArray();
		int upper_Count=0;
		for(char c : arr1) {
			if(Character.isUpperCase(c)) {
				upper_Count+=1;
			}
		}

		return upper_Count;
	}
	
	public static int lower(String s1) {
		char[] arr1 = s1.toCharArray();
		int lower_Count=0;
		for(char c : arr1) {
			if(Character.isLowerCase(c)) {
				lower_Count+=1;
			}
		}

		return lower_Count;
	}
	
	public static int special(String s1) {
		char[] arr1 = s1.toCharArray();
		int special_Count=0;
		for(char c : arr1) {
			if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)){
				special_Count+=1;
			}
		}

		return special_Count;
	}
	
	public static String shift_left(String s,int shiftBy) {
		 if (s == null || s.isEmpty()) {
		        return s; 
		    }
		    shiftBy = shiftBy % s.length(); 
		    return s.substring(shiftBy) + s.substring(0, shiftBy);
		
		
	}
	
	public static void main(String[] args) {
		String s1 = "aPPple&*";
		System.out.println(upper(s1));
		System.out.println(lower(s1));
		System.out.println(special(s1));
		System.out.println(shift_left(s1, 2));
		
		
	}
	


}
