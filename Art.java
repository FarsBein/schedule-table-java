import java.util.Hashtable;

public class Art extends Course{
    Hashtable<String, String> courses = new Hashtable<String, String>();    
    String courseName;
    String courseCode;

    public Art(String courseCode) {
        courses.put("ANT100", "Introduction to Anthropology");
        courses.put("ARB 101", "Introductory Arabic I");
        courses.put("ARB 201", "Introductory Arabic II");

        courseCode = this.courseCode;
        courseName = courses.get(courseCode.toUpperCase());
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }
}
