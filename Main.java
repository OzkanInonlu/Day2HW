package Day2HW;

public class Main {

	public static void main(String[] args) {
		
		User user1=new User(1,"Özkan","Ýnönlü","ozkaanmax@gmail.com","1234",
				"Male");
	
		User user2=new User(2,"Engin","Demiroð","enginDemirog@gmai.com","1234",
				"Male");
		
		UserManager userManager=new UserManager();
		
		Course math=new Course(101,"MATH241","BlaBla","Math");
		Course java=new Course(102,"JAVA","Engin Demirog","Comp");
		
		CourseManager courseManager=new CourseManager();
		courseManager.addCourse(java);
		courseManager.addCourse(math);
		
		userManager.add(user1);
		userManager.add(user2);
		
		User[] users= {user1,user2};
		Course[] courses= {math,java};
		
		
	}

}
