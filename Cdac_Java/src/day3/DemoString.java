package day3;

public class DemoString {
	public static void main(String[] args) {
		String s = "apple";
		String s1 = "banana";
		
		int comparison1 = s1.compareTo(s);
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
//		s = s + "11";
//		System.out.println(s.hashCode());
		
		String n1 = new String("hello");
		String n2 = new String("Hello");
		String n3 = new String("hello");
		
		int comparison = n1.compareTo(n3);
		


		
		System.out.println("hello : "+ n1.hashCode());
		System.out.println("Hello : "+ n2.hashCode());
		System.out.println("hello : "+ n3.hashCode());
		
		System.out.println(comparison);
		System.out.println(comparison1);
		
		if(s==s1) {
			System.out.println("strings are equal");
		} 
		
		if(n1.equals(n2)) {
			System.out.println("strings are equal");
		}
		else {
			System.out.println("strings n1 and n2 not equal because value are not same");
		}
		
		if(n1.equals(n3)) {
			System.out.println("strings n1 and n3 are same");
		}
	}

}
