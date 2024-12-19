package day3;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter a first string");
		String str1 = "silent";
		
//		System.out.println("Enter a second string");
		String str2 = "LiSten";
		
		
		
		if(str1.length()==str2.length()) {
			str1.toLowerCase();
			str2.toLowerCase();
			
			char[] characters1 = str1.toCharArray();
			
	        Arrays.sort(characters1);

	        char[] characters2 = str2.toCharArray();
	        Arrays.sort(characters2);
	        
	        String chr1= new String (characters1);
	        String chr2= new String (characters2);
	        
	     
	        if (chr1.equals(chr2)) {
	        	System.out.println("the strings are anagram");
	        	
	        }
	        else {
	        	System.out.println("The strings are not anagram");
	        }
	        
		}
		else {
			System.out.println("The strings are not anagram");
		}
	}
}
