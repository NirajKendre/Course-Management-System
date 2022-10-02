public class Course {

    int course_id;
    String course_name;
    int fee;
    String course_duration;

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getCourse_duration() {
        return course_duration;
    }

    public void setCourse_duration(String course_duration) {
        this.course_duration = course_duration;
    }

    public Course(int course_id, String course_name, int fee, String course_duration) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.fee = fee;
        this.course_duration = course_duration;
    }

    public Course() {
        super();
    }

    @Override
    public String toString() {
        return "Course{" +
                "course_id=" + course_id +
                ", course_name='" + course_name + '\'' +
                ", fee=" + fee +
                ", course_duration='" + course_duration + '\'' +
                '}';
    }
}
