import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Map<String,String> admin = new HashMap<>();
        admin.put("niraj","123");
        admin.put("kendre","2345");
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
//        System.out.println("Hello User Please Enter Your Name: \n");

        try {

            while(true){
                boolean flag = false;
                System.out.println("---------------------");
                System.out.println("1. Login as a Admin");
                System.out.println("2. login as a Instructor");
                System.out.println("3. Login as a Student");
                System.out.println("Enter option :- ");
                int val = sc.nextInt();

                StudentDeo studentDeo = new StudentDeo();
                CourseDao course = new CourseDao();
                InstructorDao instructorDao = new InstructorDao();



                if(val == 1){
                    //----------------Admin----------------------//
                    System.out.println("Enter login id :- ");
                    String login = sc.next();
                    System.out.println("Enter password :- ");
                    String pass = sc.next();

                    if(admin.containsKey(login) && admin.containsValue(pass)){
                        while(true){

                            System.out.println("1. Add Course");
                            System.out.println("2. Remove Course");
                            System.out.println("3. Add Instructor");
                            System.out.println("4. Remove Instructor");
                            System.out.println("5. Add Student");
                            System.out.println("6. Remove Student");
                            System.out.println("7. Show all courses");
                            System.out.println("8. show all instructor");
                            System.out.println("9. show all student");
                            System.out.println("0. logout");


                            int option = sc.nextInt();


                            if(option == 1){
                                System.out.println("Enter Course id :- ");
                                int id = sc.nextInt();
                                System.out.println("Enter Course Name :- ");
                                String name = sc.next();
                                System.out.println("Enter Course Fee :- ");
                                int fee = sc.nextInt();
                                System.out.println("Enter Course Duration :- ");
                                String duration = sc.next();
                                course.addCourse(new Course(id,name,fee,duration));
                            } else if (option == 2) {
                                System.out.println("Enter the course id to remove course :- ");
                                int id = sc.nextInt();
                                course.removeCourse(id);
                            } else if (option == 3) {
                                System.out.println("Enter instructor id :- ");
                                int id = sc.nextInt();
                                System.out.println("Enter instructor Name :- ");
                                String name = sc.next();
                                System.out.println("Enter Course you teach:- ");
                                String courseTeach = sc.next();
                                instructorDao.addInstructor(new Instructor(id,name,courseTeach));
                            }else if (option == 4) {
                                System.out.println("Enter instructor id to remove :- ");
                                int id = sc.nextInt();
                                instructorDao.removeInstructor(id);
                            }else if (option == 5) {
                                System.out.println("Enter Student id :- ");
                                int id = sc.nextInt();
                                System.out.println("Enter Student Name :- ");
                                String name = sc.next();
                                System.out.println("Enter Student Mobile :- ");
                                String mobile = sc.next();
                                System.out.println("Enter Student Address :- ");
                                String address = sc.next();
                                System.out.println("Enter temporary password :- ");
                                String spass = sc.next();
                                studentDeo.addStudent(new Student(id,name,mobile,address,spass));

                            }else if (option == 6) {
                                System.out.println("Enter Student id :- ");
                                int id = sc.nextInt();
                                studentDeo.removeStudent(id);
                                studentDeo.removeStudent(id);
                            }else if (option == 7) {
                                course.showCourses();
                            }else if (option == 8) {
                                instructorDao.showInstructors();
                            }
                            else if (option == 9) {
                                studentDeo.showStudents();
                            }
                            else if (option == 0) {
                                System.out.println("Logout successfully.....!!!");
                                break;
                            }else {
                            }
                        }
                    }

                } else if (val == 2) {

                    System.out.println("Enter Instructor Id:- ");
                    int id = sc.nextInt();
                    System.out.println("Enter password :-");
                    String pass = sc.next();

                } else if (val == 3) {
                    System.out.println("Enter Student Id :- ");
                    int loginId = sc.nextInt();
                    System.out.println("Enter Student Password :- ");
                    String pass = sc.next();

                    if(studentDeo.loginAndPass(loginId,pass)){

                        System.out.println("1. choose course(if already choose ignore)");
                        System.out.println("2. choose instructor(if already choose ignore)");
                        System.out.println("3. Show my courses");
                        System.out.println("4. Logout");

                        int option = sc.nextInt();

                        if(option == 1 ){
                            System.out.println("1. JAVA(101)");
                            System.out.println("2. SPRING(102)");
                            System.out.println("3. MYSQL(103)");
                            System.out.println("4. HIBERNATE(104)");
                            int courseOption = sc.nextInt();
                        }else {

                        }

                    }else{
                        System.out.println("Record doesn't exists....!!!");
                    }

                }else {
                    break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
