package Day2HW;

public class Course {
	
	 int id;
	 String name;
	 String instructor;
	 String departmant;
	
	public Course() {
		this(0,"None","None","None");
	}
	
	public Course(int id,String name,String instructor,String departmant) {
		this.id=id;
		this.name=name;
		this.instructor=instructor;
		this.departmant=departmant;
	}

}
