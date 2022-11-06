package task2;

public class Student {
	//instance to send to Outside
	private static Student instance=new Student();
	private String name;
	

    //the primary constructor
	private Student() {
	this.name="Barret";
	}
	
	//method to send the student Instance to the outside
	public static Student getInstance() {
		return instance;
	}
	
	public void displayDetails() {
		System.out.println("Name of the Student is:"+ this.name);
	}
}
