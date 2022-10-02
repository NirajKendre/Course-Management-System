public class Student {

    private int student_id;
    private String student_name;
    private String student_mobile;
    private String student_address;

    private String pass;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_mobile() {
        return student_mobile;
    }

    public void setStudent_mobile(String student_mobile) {
        this.student_mobile = student_mobile;
    }

    public String getStudent_address() {
        return student_address;
    }

    public void setStudent_address(String student_address) {
        this.student_address = student_address;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Student(int student_id, String student_name, String student_mobile, String student_address, String pass) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_mobile = student_mobile;
        this.student_address = student_address;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                ", student_mobile='" + student_mobile + '\'' +
                ", student_address='" + student_address + '\'' +
                '}';
    }

    public Student() {
        super();
    }
}

