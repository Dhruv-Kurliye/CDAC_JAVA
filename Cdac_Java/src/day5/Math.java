package day5;

public class Math {
	public static void main(String[] args) throws NumberFormatException {
		try {
		int dividend = Integer.parseInt(args[0]);
		int divisor = Integer.parseInt(args[2]);
		
		int res = dividend/divisor;
		System.out.println(res);
	        }
		catch (ArithmeticException e) {
			System.out.println("The Divisor can not be zero");
			e.printStackTrace();
		}
		catch (NumberFormatException e) {
			System.out.println("Enters Integer Only");
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter 2 values as dividend and divisor");
			System.out.println(e.getMessage());
		}
		System.out.println("After Method");
	}

}
