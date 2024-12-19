package day8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class streams {
	
	public static void main(String[] args) {
		int [] nums= {12,4,7,3,23,18,26,37};
		IntStream stream= Arrays.stream(nums);
		
		System.out.println(stream.count());
		stream= Arrays.stream(nums);
		System.out.println(stream.distinct().sorted().count());
		
		stream = Arrays.stream(nums);
		stream.distinct().sorted().forEach(System.out::println);
		stream = Arrays.stream(nums);
		
		//squares and evens using map and filter
		List<Integer> even = stream.filter((n)-> n%2==0).boxed().collect(Collectors.toList());
		stream = Arrays.stream(nums);
		List<Integer> squares = stream.map((n)-> n*n).boxed().collect(Collectors.toList());
		System.out.println(even);
		System.out.println(squares);
		
		//min
		stream = Arrays.stream(nums);
		OptionalInt min = stream.min();
		if(min.isPresent())
			System.out.println(min.getAsInt());
		
		//max
		stream = Arrays.stream(nums);
		OptionalInt max = stream.max();
		if(max.isPresent())
			System.out.println(max.getAsInt());
		
		//average
		stream = Arrays.stream(nums);
		OptionalDouble average = stream.average();
		if(average.isPresent())
			System.out.println(average.getAsDouble());
		
		//reduce method
		stream = Arrays.stream(nums);
		OptionalInt total = stream.reduce((n1,n2)->n1*n2);
		if(total.isPresent())
			System.out.println(total.getAsInt());
		
		stream = Arrays.stream(nums);
		long totalval = stream.reduce(1,(n1,n2)-> n1*n2);
		System.out.println(totalval);
		
		
		
		
	}

}
