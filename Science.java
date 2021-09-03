import java.util.Hashtable;

public class Science extends Course {
    Hashtable<String, String> courses = new Hashtable<String, String>();
    String courseName;
    String courseCode;

    public Science(String courseCode) {
        courses.put("BLG143", "Biology I");
        courses.put("CHY103", "General Chemistry I");
        courses.put("PCS110", "Physics");
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
