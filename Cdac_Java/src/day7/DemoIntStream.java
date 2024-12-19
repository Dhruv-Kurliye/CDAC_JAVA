package day7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoIntStream {
	
	public static void main(String[] args) {
		int [] nums= {12,4,7,3,23,18,26,37};
		IntStream stream= Arrays.stream(nums);
		
		System.out.println(stream.count());
		stream= Arrays.stream(nums);
		System.out.println(stream.distinct().sorted().count());
		
		stream = Arrays.stream(nums);
		stream.distinct().sorted().forEach(System.out::println);
		stream = Arrays.stream(nums);
		
		List<Integer> even = stream.filter((n)-> n%2==0).boxed().collect(Collectors.toList());
		stream = Arrays.stream(nums);
		List<Integer> squares = stream.map((n)-> n*n).boxed().collect(Collectors.toList());
		System.out.println(even);
		System.out.println(squares);
	
	}
	

}
