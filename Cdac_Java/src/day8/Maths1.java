package day8;

public class Maths1 {
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
     
     public static void add(int ...num) {
    	 int res=0;
//    	 for (int i=0; i<num.length; i++) {
//    		 res+=num[i];
//    	 }
//    	 System.out.println(res);
    	 
    	 for (int i:num) {
    		 res+=i;
    	 }
    	 System.out.println(res);
     }
     
     public static void add(int i, float f, int a) {
    	 System.out.println(i+f+a);
     }
     public static void add(int i, float f) {
    	 System.out.println(i+f);
     }
     
     public static void main(String args[]) {
    	 Maths1.Factorial(5);
    	 System.out.println(Maths1.Prime(3));
    	 Maths1.add(10, 20);
    	 Maths1.add(45,78,45,45,45,45);
     }
     }
