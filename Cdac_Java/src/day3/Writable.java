package day3;

public interface Writable {
	void write();
	default void foo() {
		System.out.println("this is dafault funtionality");
	}

}
