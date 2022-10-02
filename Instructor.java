public class Instructor {

    int instructor_id;
    String instructor_name;
    String course;

    public int getInstructor_id() {
        return instructor_id;
    }

    public void setInstructor_id(int instructor_id) {
        this.instructor_id = instructor_id;
    }

    public String getInstructor_name() {
        return instructor_name;
    }

    public void setInstructor_name(String instructor_name) {
        this.instructor_name = instructor_name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Instructor(int instructor_id, String instructor_name, String course) {
        this.instructor_id = instructor_id;
        this.instructor_name = instructor_name;
        this.course = course;
    }

    public Instructor() {
        super();
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "instructor_id=" + instructor_id +
                ", instructor_name='" + instructor_name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
