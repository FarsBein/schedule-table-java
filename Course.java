public abstract class Course {
    
    public abstract String getCourseName();

    public abstract String getCourseCode();

    public String toString() {
        return  "Course Name:" + getCourseName() + "Course Code:" + getCourseCode();
    }
}
