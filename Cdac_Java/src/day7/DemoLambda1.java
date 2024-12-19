package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoLambda1 {
	
	public boolean operatorOnNum(Predicate p, int n) {
		return p.test(n);
	}
	
	public List<Integer> operatorOnNum(Predicate p, List<Integer> n)
	{
		List<Integer> filtered = new ArrayList<>();
		
		for (Integer i:n)
		{
			if(p.test(i))
			{
				filtered.add(i);
			}
		}
		return filtered;
	}
	
	public String OperationOnString(StringPredicate p, String s) {
		return p.test(s);
	}
	
	
	
	public static void main(String[] args) {
		Integer [] nums = {12,-3,-4,3,3,-5,200,400};
		List<Integer> vals = Arrays.asList(nums);
		DemoLambda1 demo = new DemoLambda1();
		boolean ispositive = demo.operatorOnNum((n) -> n>0,12);
		System.out.println(ispositive);
		
		List<Integer> positives = demo.operatorOnNum((n)-> n>0,vals);
		System.out.println(positives);
		

		List<Integer> Multiplier = demo.operatorOnNum((n)-> n%100==0,vals);
		System.out.println(Multiplier);
		
		String toUpperCase= demo.OperationOnString((n)-> n.toUpperCase(), "Hello ji Namaste!");
		System.out.println(toUpperCase);
		
		String reversedString=demo.OperationOnString((n)->{ 
			String rev="";
			for (int i = n.length() - 1; i >= 0; i--)
			{
				rev+= n.charAt(i); 
			}
		return rev;
        
			
		}, "hhello");
		System.out.println(reversedString);
		
	}

}
