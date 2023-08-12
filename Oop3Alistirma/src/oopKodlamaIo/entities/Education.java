package oopKodlamaIo.entities;

public class Education {
    private String courseName;
    private String teacherName;
    private int coursePrice;

    public Education(String courseName, String teacherName, int coursePrice) {
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.coursePrice = coursePrice;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(int coursePrice) {
        this.coursePrice = coursePrice;
    }
}
