package Day2HW;

public class CourseManager {

	public void addCourse(Course course) {
		System.out.println("New course added : " + course.name
				+ "\n id: " + course.id);
	}
	public void delCourse(Course course) {
		System.out.println("Course deleted : " + course.name
				+ "\n id : " + course.id);

	}
}
