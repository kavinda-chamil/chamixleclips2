package task2;

public class main {

	public static void main(String[] args) {
		
	//Create a Student Object
	//the following is not possible since the constructor is not visible to the outside
		//Student student=new Student()
		
		Student student=Student.getInstance();
		
		student.displayDetails();
	}
}
