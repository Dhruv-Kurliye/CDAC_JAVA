package day3;

public class Book implements Printable, Writable {
	private String title;
	private int price;
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	@Override
	public void write() {
		System.out.println("Writting a book");
	}
	@Override
	public void print() {
		System.out.println("printing a book");
	}
	@Override
	public void foo() {
//		Printable.super.foo();
		System.out.println("fjfvf");
	}

}
