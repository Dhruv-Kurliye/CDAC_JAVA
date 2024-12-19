package day3;

public class Printer {
	public void printData(Printable p) {
		p.print();
		p.foo();
	}
	public static void main(String[] args) {
		Printer p = new Printer();
		Book b = new Book("head first java",900);
		p.printData(b);
		
		SalariedEmployee e = new SalariedEmployee(21,"aaa",90000);
		p.printData(e);
	}
}
