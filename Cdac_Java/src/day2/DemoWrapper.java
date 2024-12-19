package day2;

public class DemoWrapper {
	public static void main(String[] args) {
		int i = 5;
		
		// primitive to wrapper
		Integer j = Integer.valueOf(i); 
		System.out.println(j);
		
		
		//wrapper to primitive
		int k = j.intValue(); 
		
		//Auto Boxing
		int a = 12;
		Integer b = a;
		
		//Auto Unboxing
		int c = b;
		
		//parsing
		int x = Integer.parseInt("30");       // wrapper to primitive
		Integer y = Integer.valueOf("40");    // primitive to wrapper
		
		
		System.out.println(k);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(x);
		System.out.println(y);
	}
}
