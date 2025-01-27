package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import day5.Employee;
import day5.NameComparator;

public class Stock {


	

	public List<Toy> FilterByCategory(List<Toy> toy,String criteria) {
		List <Toy> filter=new ArrayList<Toy>();
		for (Toy a : toy ) {
			String x=a.getCategory();
			if (x.equalsIgnoreCase(criteria)) {
				filter.add(a);			
				}
			
		}
		return filter;
	}
	
	public List<Toy> FilterByPrice(List<Toy> toy,double min_range, double max_range) {
		List <Toy> filter=new ArrayList<Toy>();
		for (Toy a : toy ) {
			double x=a.getToy_price();
			if (x<=max_range & x>=min_range) {
				filter.add(a);			
				}
			
		}
		return filter;
	}
	
	public List<Toy> FilterBySpecificAge(List<Toy> toy, int age ) {
		List <Toy> filter=new ArrayList<Toy>();
		for (Toy a : toy ) {
			int x=a.getAge();
			if (x==age) {
				filter.add(a);			
				}
			
		}
		return filter;
	}
	
	public List<Toy> FilterByDate(List<Toy> toy,int Year) {
		List <Toy> filter=new ArrayList<Toy>();
		for (Toy a : toy ) {
			int Y=a.getYear();
			if (Y<Year) {
				filter.add(a);			
				}
		}
		return filter;
	}
	
	public List<Toy> GroupByCategory(List<Toy> toy,String Category) {
		ArrayList filter=new ArrayList();
		System.out.println("Grouped by : "+Category);
		for (Toy a : toy ) {
			String x=a.getCategory();
			if (x.equalsIgnoreCase(Category)) {
				String y=a.getToy_name();
				filter.add(y);			
				}
			
		}
		return filter;
	}
	
	  public List<Toy> sortToys(List<Toy> Toylist) {
	        Collections.sort(Toylist);
	        System.out.println("\nSorted Toys by ToyId:");
	        return Toylist;
	    }
	
	
	public static void main(String[] args) {
		List<Toy> Stock1 = new ArrayList<Toy>();
		Stock stock = new Stock();
		Stock1.add(new Toy(5,"Action Figure",245.0,7,11,12,"Educational"));
		Stock1.add(new Toy(4,"Wizard doll",745.0,7,11,23,"Educational"));
		Stock1.add(new Toy(1,"Toy Gun",145.0,4,11,9,"Battery operated"));
		Stock1.add(new Toy(2,"Toy Bow",445.0,6,10,24,"Educational"));
		Stock1.add(new Toy(7,"Talking Tom",145.0,4,11,9,"Battery operated"));
		Stock1.add(new Toy(3,"Ben 10 watch",445.0,6,10,24,"Educational"));
		
		//Filtering Toys
		  System.out.println("*******************Filter out by Category********************");
		  System.out.println(" ");
		System.out.println(stock.FilterByCategory(Stock1,"educational"));
		System.out.println(" ");
		
		//Finding by Toy_ID
		  System.out.println("*******************Finding Toy ID********************");
		 int index = Collections.binarySearch(Stock1, new Toy(1,null,0,0,0,0,null));
	        if (index >= 0) {
	            System.out.println("\nEmployee found at index: " + index);
	        } else {
	            System.out.println("\nEmployee not found");
	        }
	        
	    //By Price Range
	        System.out.println("*******************Filter out by Price range********************");
	        System.out.println(" ");
	        System.out.println(stock.FilterByPrice(Stock1,250 ,450));
	        

        //By Specific Age
	        System.out.println("*******************Filter out by Specific age********************");
	        System.out.println(" ");
	        System.out.println(stock.FilterBySpecificAge(Stock1, 7));
	        
	    //Sorting of Toys
	        System.out.println("*******************Sorting Toys********************");
	        System.out.println(stock.sortToys(Stock1));
	        System.out.println(" ");
	    
	    //By Date of Manufacturing
	        System.out.println("*******************By Date of manufacturing********************");
	        System.out.println(" ");
	        System.out.println(stock.FilterByDate(Stock1,24));
	        System.out.println(" ");
	    //Group by Category    
	        System.out.println("*******************Group by Category********************");
	        System.out.println(" ");
	        System.out.println(stock.GroupByCategory(Stock1, "Battery operated"));
	        
	        

		
		
		
	}

}
