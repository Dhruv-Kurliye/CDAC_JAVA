package day8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;



import day8.Employee;

public class EmployeeList {
	
	  public List<Employee> initializeEmployeeData() {
	        List<Employee> emplist = new ArrayList<>();

	        // Adding five employees
	        Set<String> skills1 = new TreeSet<>();
	        skills1.add("Java");
	        skills1.add("Spring");
	        emplist.add(new Employee(567, "Alice", 30, skills1,"IT"));

	        Set<String> skills2 = new TreeSet<>();
	        skills2.add("Python");
	        skills2.add("Django");
	        emplist.add(new Employee(785, "Bob", 25, skills2,"IT"));

	        Set<String> skills3 = new TreeSet<>();
	        skills3.add("JavaScript");
	        skills3.add("React");
	        emplist.add(new Employee(985, "Charlie", 28, skills3,"Admin"));

	        Set<String> skills4 = new TreeSet<>();
	        skills4.add("C#");
	        skills4.add("ASP.NET");
	        emplist.add(new Employee(365, "David", 35, skills4,"Admin"));

	        Set<String> skills5 = new TreeSet<>();
	        skills5.add("Ruby");
	        skills5.add("Rails");
	        emplist.add(new Employee(967, "Eve", 22, skills5,"IT"));

	        return emplist;
	    }
	  
	  public static void main(String[] args) {
		EmployeeList e = new EmployeeList();
		List<Employee> emplist = e.initializeEmployeeData();
		Stream<Employee> stream = emplist.stream();
		
		Comparator<Employee> byname = Comparator.comparing(Employee::getName);
		System.out.println("Sorting by name: ");
		stream.sorted(byname).forEach(System.out::println);
		
		Comparator<Employee> bydept = Comparator.comparing(Employee::getDepartment).thenComparing(byname);
		System.out.println("Sorting by deptname: ");
		stream.sorted(bydept).forEach(System.out::println);
		
		System.out.println("---------------------------------------");
		stream = emplist.stream();
		Predicate<Employee> salrange = (emp)-> {
			if(emp.getSalary() >= 5000 && emp.getSalary() < 75000) 
				return true;
			else 
				return false;
		};
		
		System.out.println("-------------Filter by skill------------");
		stream=emplist.stream();
		Map<String, List<Employee>> empsBydept=stream.collect(Collectors.groupingBy(Employee::getDepartment));
		empsBydept.forEach((k,v)-> System.out.println(k+"=="+v));
		
		System.out.println("**************");
		stream=emplist.stream();
		stream.map((emp)-> new Department(emp.getEmpid()))
		
		
		
		}
		
	}

}
