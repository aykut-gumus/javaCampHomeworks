package d3hm2;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getEmail() + " sisteme kaydoldu.");
	}
	
	public void addMultiple(User[] users) {
		for(User user : users) {
			add(user);
		}
	}

}
