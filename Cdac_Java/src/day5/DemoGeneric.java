package day5;

public class DemoGeneric <T> {
	
	T data;
//	public DemoGeneric
	
	public String getClassName() {
		return (data.getClass().getName());
	}
	
	public static void main(String[] args) {
		DemoGeneric<String> iobj = new DemoGeneric<String>("harsh");
		System.out.println(iobj.getClassName());
	}
}
