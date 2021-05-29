package d3hm2;

public class StudentManager {

	public void addJava(Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " Java eğitimine katıldı.");
	}
	
	public void deleteJava(Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " Java kaydı silindi.");
	}
	
	public void addC(Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " C# eğitimine katıldı.");
	}
	
}
	
