package Assignment7thOct;

public class Target {
	public static void main(String[] args) {
		String A = "harshal";
		
//		for(int i=0;i<A.length();i++) {
//			B = B + " " + A.charAt(i);
//			System.out.println(B);
		
		for(int i=A.length();i>0;i--) {
			String B = "";
			for(int j=0;j<i;j++) {
				B = B +" "+A.charAt(j);
			}
			System.out.println(B);
		}
	}

}




//h a r s h a l
//h a r s h a
//h a r s h
//h a r s
//h a r
//h a
//h