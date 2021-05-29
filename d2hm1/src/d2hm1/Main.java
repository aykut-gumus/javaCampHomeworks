package d2hm1;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "C#+ANGULAR Kampý", "2 ay sürecek yazýlým geliþtirici yetiþtirme kampý",
				"Engin Demiroð");
		Course course2 = new Course(2, "JAVA+REACT Kampý", "2 ay sürecek yazýlým geliþtirici yetiþtirme kampý",
				"Engin Demiroð");

		Course[] courses = { course1, course2 };
		for (Course course : courses) {
			System.out.println(course.courseName + " / " + course.courseDetail + " / " + course.courseInstructor);
		}
		System.out.println("----------------------------------------------------------");

		CourseManager courseManager = new CourseManager();

		courseManager.add(course1);
		courseManager.delete(course2);
	}
}