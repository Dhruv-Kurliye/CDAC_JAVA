package day4;

public class DemoObjectMethods {
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Car car1 = new Car("aaa","bbb",10000);
		Car car2 = new Car("aaa","bbb",10000);
		
		System.out.println(car1.equals(car2));
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		System.out.println(car1); 
        System.out.println(car2);
        
        Car car3 = (Car)car1.clone();
        car1.setPrice(80000);
        car1.setModel("ddd");
        System.out.println(car3);
        System.out.println(car1); 
	}
}
