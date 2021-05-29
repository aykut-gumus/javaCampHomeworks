package d3hm2;

public class Main {

	public static void main(String[] args) {

		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Larry");
		student1.setLastName("Page");
		student1.setEmail("larry.page@kodlama.io");
		student1.setNickName("lp1");
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Sergey ");
		student2.setLastName("Brin");
		student2.setEmail("sergey.brin@kodlama.io");
		student2.setNickName("sb2");
		
		Student student3 = new Student();
		student3.setId(3);
		student3.setFirstName("Mark ");
		student3.setLastName("Zuckerberg");
		student3.setEmail("mark.zuckerberg@kodlama.io");
		student3.setNickName("mz3");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(4);
		instructor1.setFirstName("Engin ");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("engin.demirog@kodlama.io");
		instructor1.setTitle("Founder");
		
		
		UserManager userManager = new UserManager();
		
		User[] users = {student1, student2, student3, instructor1};
		
		userManager.addMultiple(users);
		
		System.out.println("-------------------------------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addJava(student1);
		studentManager.addC(student2);
		studentManager.deleteJava(student3);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
	}
}
