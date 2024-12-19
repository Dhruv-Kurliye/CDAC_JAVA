package day7;

public class GenericLambda {
	
	public static <T> T operationOnData(Function<T> f,T data) {
		return f.apply(data);
	}
	
	public static void main(String[] args) {
		
		String substring = operationOnData((s)-> s.substring(2,10), "Dhruv Kurliye");
		System.out.println(substring);
		
		Integer square = operationOnData((n)-> n*(7+n)*n^2/n , 8);
		System.out.println(square);
	}

}
