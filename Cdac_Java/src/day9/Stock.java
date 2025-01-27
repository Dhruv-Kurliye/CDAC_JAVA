package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;



public class Stock {
	
	
	
	
	public static void main(String[] args) {
		List<Toy> Stock1 = new ArrayList<Toy>();
		Stock stock = new Stock();
		Stock1.add(new Toy(5,"Action Figure",245.0,7,11,2012,"Educational"));
		Stock1.add(new Toy(4,"Wizard doll",745.0,7,11,2023,"Educational"));
		Stock1.add(new Toy(1,"Toy Gun",145.0,4,11,2009,"Battery operated"));
		Stock1.add(new Toy(2,"Toy Bow",445.0,6,10,2024,"Educational"));
		Stock1.add(new Toy(7,"Talking Tom",345.67,4,11,2009,"Battery operated"));
		Stock1.add(new Toy(3,"Ben 10 watch",445.0,6,10,2024,"Educational"));
		
		//Listing toys using streams
		 System.out.println("Listing Toys : ");
		 List<Toy> Toys = Stock1.stream().collect(Collectors.toList());
		 System.out.println(Toys);
		 System.out.println(" ");
		 
		 //Filtering Toys by category using streams
		 System.out.println("Educational Toys : ");
		 List<Toy> Educational_Toys = Stock1.stream().filter(s->s.getCategory()=="Educational").collect(Collectors.toList());
		 System.out.println(Educational_Toys);
		 System.out.println(" ");
		 
		 System.out.println("Battery operated Toys : ");
		 List<Toy> BatteryOperated_Toys = Stock1.stream().filter(s->s.getCategory()=="Battery operated").collect(Collectors.toList());
		 System.out.println(BatteryOperated_Toys);
		 System.out.println(" ");
		 
		 //Listing toys by price range
		 System.out.println("Toys in price range between 300 and 500 : ");
		 List<Toy> RangeToys = Stock1.stream().filter(s->s.getToy_price()>=300 && s.getToy_price()<=500).collect(Collectors.toList());
		 System.out.println(RangeToys);
		 System.out.println(" ");
		 
		 //Sorting toys by price and category
		 System.out.println("Sorting Toys by category and price wise  : ");
		 List<Toy> SortedToys = Stock1.stream().sorted(Comparator.comparing(Toy::getCategory).thenComparing(Toy::getToy_price)).collect(Collectors.toList());
		 System.out.println(SortedToys);
		 System.out.println(" ");
		
		 
		 //Listing Toys older than 1 year
		 System.out.println("Toys older than 1 year: ");
		 List<Toy> OlderToys = Stock1.stream().filter(s->s.getYear()<2024).collect(Collectors.toList());
		 System.out.println(OlderToys);
		 System.out.println(" ");
		 
		 //Listing Toys by category and counting their count
		 System.out.println("Educational Toys: ");
		 List<String> Educational_Count_Toys = Stock1.stream().filter(s->s.getCategory()=="Educational").map(Toy::getToy_name).collect(Collectors.toList());
		 System.out.println(Educational_Count_Toys);
		 System.out.println("Count: "+ Educational_Count_Toys.size());
		 System.out.println(" ");
		 System.out.println("Battery operated Toys: ");
		 List<String> BatteryOperated_Count_Toys = Stock1.stream().filter(s->s.getCategory()=="Battery operated").map(Toy::getToy_name).collect(Collectors.toList());
		 System.out.println(BatteryOperated_Count_Toys);
		 System.out.println("Count: "+ BatteryOperated_Count_Toys.size());
		 System.out.println(" ");
		 
		 //Display the most expensive/least expensive toy in given category
		 Optional<Toy> Educational_max = Stock1.stream().filter(s->s.getCategory()=="Educational").max((p1, p2) -> Double.compare(p1.getToy_price(), p2.getToy_price()));
		 System.out.println("Most expensive toy in Educational category: "+ Educational_max);
		 System.out.println(" ");
		 Optional<Toy> Educational_min = Stock1.stream().filter(s->s.getCategory()=="Educational").min((p1, p2) -> Double.compare(p1.getToy_price(), p2.getToy_price()));
		 System.out.println("least expensive toy in Educational category: "+ Educational_min);
		 System.out.println(" ");
		 Optional<Toy> Battery_max = Stock1.stream().filter(s->s.getCategory()=="Battery operated").max((p1, p2) -> Double.compare(p1.getToy_price(), p2.getToy_price()));
		 System.out.println("Most expensive toy in Battery operated: "+ Battery_max);
		 System.out.println(" ");
		 Optional<Toy> Battery_min = Stock1.stream().filter(s->s.getCategory()=="Battery operated").min((p1, p2) -> Double.compare(p1.getToy_price(), p2.getToy_price()));
		 System.out.println("least expensive toy in Battery operated category: "+ Battery_min);
		 System.out.println(" ");
		 
		 //total number of toys in each age group
		 Map<Integer,Long > ageCount= Stock1.stream().collect(Collectors.groupingBy(Toy::getAge, Collectors.counting()));
		 System.out.println(ageCount);
		 
		 Toy a = new Toy(5,"Action Figure",245.0,7,11,2012,"Educational");
		 a.Year =100;
		 System.out.println(a.Year);
//		 a.Month = 11;
//		 System.out.println(a.Month);
		 a.setMonth(11);
		 System.out.println(a.getMonth());


}}
