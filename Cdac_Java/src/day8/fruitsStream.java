package day8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class fruitsStream {
	
	public static void main(String[] args) {
		  String n = "n";
	        String fruits[] = {"Mango", "orange", "Grapes", "apple", "Banana", "strawberry", "Watermelon"};

	        List<String> upperCaseList = Arrays.stream(fruits).map(String::toUpperCase).collect(Collectors.toList());
	        System.out.println("*********************** UpperCase *******************************");
	        System.out.println(upperCaseList);

	        List<String> lowerCaseList = Arrays.stream(fruits).map(String::toLowerCase).collect(Collectors.toList());
	        System.out.println("*********************** LowerCase *******************************");
	        System.out.println(lowerCaseList);

	        List<String> greaterThanNList = Arrays.stream(fruits).filter(s -> s.compareTo(n) > 0).sorted().collect(Collectors.toList());
	        System.out.println("************************** Sorted Greater Than 'n' ****************************");
	        System.out.println(greaterThanNList);

	        List<String> lesserThanNList = Arrays.stream(fruits).filter(s -> s.compareTo(n) < 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	        System.out.println("************************** Sorted Lesser Than 'n' ****************************");
	        System.out.println(lesserThanNList);

	        List<String> upperCaseElementsList = Arrays.stream(fruits).filter(s -> Character.isUpperCase(s.charAt(0))).collect(Collectors.toList());
	        System.out.println("********************* UpperCase Elements Filtering *********************************");
	        System.out.println(upperCaseElementsList);

	        List<String> lengthLessThan6List = Arrays.stream(fruits).filter(s -> s.length() <= 6).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	        System.out.println("*********************** Filtering Elements Having Length Less Than 6 in Descending Order *******************************");
	        System.out.println(lengthLessThan6List);
	
	}

	

}
