package Day1;

public class Student {
	
	static int Roll_number=0;
	String Name;
	public Student(String name) {
		this.Name=name;
	}
	
	public void studentDetails() {
		Roll_number+=1;
		System.out.println("Student name is : "+ this.Name + ", Roll number is : "+Roll_number);
		
	}
	
	public static void main(String[] args) {
		Student s=new Student("Dhruv");
		Student s2=new Student("Harshal");
		Student s3=new Student("Harsh");
		s.studentDetails();
		s2.studentDetails();
		s3.studentDetails();
	}

}
