import java.util.Hashtable;

public class Computer extends Course{
    Hashtable<String, String> courses = new Hashtable<String, String>();
    String courseName;
    String courseCode;

    public Computer(String courseCode) {
        courses.put("CPS109", "Computer Science I");
        courses.put("CPS213", "Computer Organization I");
        courses.put("CPS310", "Computer Organization II");
        this.courseCode = courseCode;
        courseName = courses.get(courseCode.toUpperCase());
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }
}
