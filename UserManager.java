package Day2HW;

public class UserManager {
	
	public void add(User user) {
		System.out.println("New user added : " + user.getFirstName());
	}
	public void del(User user) {
		System.out.println("User deleted : " + user.getFirstName());
	}
}
