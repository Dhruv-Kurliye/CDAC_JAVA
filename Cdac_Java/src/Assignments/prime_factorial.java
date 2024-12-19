package Assignments;

public class prime_factorial {
	 public static void Factorial(int n) {
    	 int fact = 1;
    	 for(int i=2;i<=n;i++) {
    		 fact = fact * i;
    	 }
    	 System.out.println(fact);
     }
     public static boolean Prime(int n) {
    	 
    	 for(int i=2;i<n;i++) {
    		 if (n % i == 0){
    			 return false;   		
    		 }
    		
    	 }
    	 return true;
     }

}
