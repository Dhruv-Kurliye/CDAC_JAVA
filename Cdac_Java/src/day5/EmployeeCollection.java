//package day5;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//import java.util.TreeMap;
//import java.util.TreeSet;
//
//public class EmployeeCollection {
//    public List<Employee> initializeEmployeeData() {
//        List<Employee> emplist = new ArrayList<>();
//
//        // Adding five employees
//        Set<String> skills1 = new TreeSet<>();
//        skills1.add("Java");
//        skills1.add("Spring");
//        emplist.add(new Employee(567, "Alice", 30, skills1));
//
//        Set<String> skills2 = new TreeSet<>();
//        skills2.add("Python");
//        skills2.add("Django");
//        emplist.add(new Employee(785, "Bob", 25, skills2));
//
//        Set<String> skills3 = new TreeSet<>();
//        skills3.add("JavaScript");
//        skills3.add("React");
//        emplist.add(new Employee(985, "Charlie", 28, skills3));
//
//        Set<String> skills4 = new TreeSet<>();
//        skills4.add("C#");
//        skills4.add("ASP.NET");
//        emplist.add(new Employee(365, "David", 35, skills4));
//
//        Set<String> skills5 = new TreeSet<>();
//        skills5.add("Ruby");
//        skills5.add("Rails");
//        emplist.add(new Employee(967, "Eve", 22, skills5));
//
//        return emplist;
//    }
//    
////    GetEmployee
//   
//    public static Employee getEmployee(List<Employee> emplist, int empid) {
//    	for (Employee e : emplist) {
//    		if(e.getEmpid()==empid) {
//    			return e;
//    		}
//    	}
//    	return null;
//    	
//    }
//    
//    public static void printList(List<Employee> emplist) {
//    	for(Employee e : emplist) {
//    		System.out.println(e);
//    	}
//    }
//    
//    public static Employee searchEmployee(List<Employee> emplist, int empid) {
//    	for(Employee e : emplist) {
//    		if(e.getEmpid()==empid) {
//    			return e;
//    		}
//    	}
//    	return null;
//    }
//    
//    public static List<Employee> filterEmployees(List<Employee> emplist, String criteria){
//    	List<Employee> filtered = new ArrayList<>();
//    	for(Employee e : emplist) {
//    		if(e.getSkillset().contains(criteria)) {
//    			filtered.add(e);
//    		}
//    	}
//    	return filtered;
//    }
//    
//    public static Map<Integer , Double> salaryMap(List<Employee> emplist){
//    	Map<Integer, Double> salmap = new TreeMap<>();
//    	for(Employee e : emplist) {
//    		salmap.put(e.getEmpid(),e.getSalary());
//    		}
//    	return salmap;
//    }
//    public void sortEmployees(List<Employee> emplist) {
//        Collections.sort(emplist);
//        System.out.println("\nSorted Employees by empid:");
//        printList(emplist);
//    }
//    	
//    
//	public static void main(String[] args) {
//    	
//   
//        EmployeeCollection e = new EmployeeCollection();
//        List<Employee> emplist = e.initializeEmployeeData();
//        
////        e.printList(emplist);
//
//        // Print employee data
//        for (Employee employee : emplist) {
//            System.out.println(employee);
//        }
//        
//        System.out.println("\nGet Employee with ID 567:");
//        Employee emp = getEmployee(emplist, 567);
//        System.out.println(emp != null ? emp : "Employee not found");
//
//        // Search for employee
//        System.out.println("\nSearch for Employee with ID 985:");
//        Employee searchedEmp = searchEmployee(emplist, 985);
//        System.out.println(searchedEmp != null ? searchedEmp : "Employee not found");
//
//        // Filter employees by skill
//        System.out.println("\nFilter Employees with skill 'Java':");
//        List<Employee> filteredEmps = filterEmployees(emplist, "Java");
//        printList(filteredEmps);
//
//        // Generate salary map
//        System.out.println("\nSalary Map:");
//        Map<Integer, Double> salaryMap = salaryMap(emplist);
//        for (Map.Entry<Integer, Double> entry : salaryMap.entrySet()) {
//            System.out.println("Employee ID: " + entry.getKey() + ", Salary: " + entry.getValue());
//        }
//        
//        System.out.println("..");
//        Collections.sort(emplist);
//        e.printList(emplist);
//        
//        
//        int index = Collections.binarySearch(emplist,new Employee(567, null, 0, null),
//        		new NameComparator();
//        
////        Collections.sort(emplist);
////        e.printList(emplist);
//        EmployeeCollection collection = new EmployeeCollection();
//		List<Employee> emplist1 = collection.initializeEmployeeData();
////        collection.printList(emplist1);
//        collection.sortEmployees(emplist1);
//    }
//}
	

package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class EmployeeCollection {
    public List<Employee> initializeEmployeeData() {
        List<Employee> emplist = new ArrayList<>();

        // Adding five employees
        Set<String> skills1 = new TreeSet<>();
        skills1.add("Java");
        skills1.add("Spring");
        emplist.add(new Employee(567, "Alice", 30, skills1));

        Set<String> skills2 = new TreeSet<>();
        skills2.add("Python");
        skills2.add("Django");
        emplist.add(new Employee(785, "Bob", 25, skills2));

        Set<String> skills3 = new TreeSet<>();
        skills3.add("JavaScript");
        skills3.add("React");
        emplist.add(new Employee(985, "Charlie", 28, skills3));

        Set<String> skills4 = new TreeSet<>();
        skills4.add("C#");
        skills4.add("ASP.NET");
        emplist.add(new Employee(365, "David", 35, skills4));

        Set<String> skills5 = new TreeSet<>();
        skills5.add("Ruby");
        skills5.add("Rails");
        emplist.add(new Employee(967, "Eve", 22, skills5));

        return emplist;
    }

    public static Employee getEmployee(List<Employee> emplist, int empid) {
        for (Employee e : emplist) {
            if (e.getEmpid() == empid) {
                return e;
            }
        }
        return null;
    }

    public static void printList(List<Employee> emplist) {
        for (Employee e : emplist) {
            System.out.println(e);
        }
    }

    public static Employee searchEmployee(List<Employee> emplist, int empid) {
        return getEmployee(emplist, empid);
    }

    public static List<Employee> filterEmployees(List<Employee> emplist, String criteria) {
        List<Employee> filtered = new ArrayList<>();
        for (Employee e : emplist) {
            if (e.getSkillset().contains(criteria)) {
                filtered.add(e);
            }
        }
        return filtered;
    }

    public static Map<Integer, Double> salaryMap(List<Employee> emplist) {
        Map<Integer, Double> salmap = new TreeMap<>();
        for (Employee e : emplist) {
            salmap.put(e.getEmpid(), e.getSalary());
        }
        return salmap;
    }

    public void sortEmployees(List<Employee> emplist) {
        Collections.sort(emplist);
        System.out.println("\nSorted Employees by empid:");
        printList(emplist);
    }

    public void sortEmployeesByName(List<Employee> emplist) {
        Collections.sort(emplist, new NameComparator());
        System.out.println("\nSorted Employees by name:");
        printList(emplist);
    }

    public static void main(String[] args) {
        EmployeeCollection e = new EmployeeCollection();
        List<Employee> emplist = e.initializeEmployeeData();

        // Print employee data
        e.printList(emplist);

        // Get Employee
        System.out.println("\nGet Employee with ID 567:");
        Employee emp = getEmployee(emplist, 567);
        System.out.println(emp != null ? emp : "Employee not found");

        // Search for employee
        System.out.println("\nSearch for Employee with ID 985:");
        Employee searchedEmp = searchEmployee(emplist, 985);
        System.out.println(searchedEmp != null ? searchedEmp : "Employee not found");

        // Filter employees by skill
        System.out.println("\nFilter Employees with skill 'Java':");
        List<Employee> filteredEmps = filterEmployees(emplist, "Java");
        printList(filteredEmps);

        // Generate salary map
        System.out.println("\nSalary Map:");
        Map<Integer, Double> salaryMap = salaryMap(emplist);
        for (Map.Entry<Integer, Double> entry : salaryMap.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Salary: " + entry.getValue());
        }

        // Sort by empid
        e.sortEmployees(emplist);

        // Sort by name
        e.sortEmployeesByName(emplist);

        // Binary Search
        int index = Collections.binarySearch(emplist, new Employee(0, "dhruv", 0, null), new NameComparator());
        if (index >= 0) {
            System.out.println("\nEmployee found at index: " + index);
        } else {
            System.out.println("\nEmployee not found");
        }
    }
}

			
