package d2hm1;

public class CourseManager {

	public void add(Course course) {
		System.out.println("Kayıt olundu : " + course.courseName);
	}

	public void delete(Course course) {
		System.out.println("Kayıt silindi : " + course.courseName);
	}

}
