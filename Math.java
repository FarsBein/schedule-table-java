import java.util.Hashtable;

public class Math extends Course{
    Hashtable<String, String> courses = new Hashtable<String, String>();
    String courseName;
    String courseCode;

    public Math(String courseCode) {
        courses.put("MTH110", "Discrete Mathematics I");
        courses.put("MTH207", "Calculus and Computational Methods I");
        courses.put("MTH108", "Linear Algebra");
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
