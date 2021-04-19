package test1.com;
  
class Student{
	int id;
	String name;
	String course;
	
	public Student(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	
	public String toString()
	{
		return id+" "+name+" "+course;	
		}
}
public class Tostring {

	public static void main(String[] args) {
		  Student s = new Student(1, "ram", "ECE");
		  Student s1 = new Student(2, "sam", "EEE");
		  Student s2 = new Student(3, "tom", "CSE");
		  
		  System.out.println(s);
		  System.out.println(s1);
		  System.out.println(s2);

	}

}
