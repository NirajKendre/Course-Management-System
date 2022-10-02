import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public  class CourseDao {

    public void addCourse(Course course){

        try(Connection connection = conn.createConn()){

            String query = "insert into course values(?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);

            ps.setInt(1,course.course_id);
            ps.setString(2,course.course_name);
            ps.setInt(3,course.fee);
            ps.setString(4,course.course_duration);

            int x = ps.executeUpdate();

            if(x>0){
                System.out.println("Course added successfully.....!!!");
            }else{
                System.out.println("please enter valid data....!!!!");
            }

        }catch(Exception e){
            e.getMessage();
        }
        System.out.println("Course added successfully....!!!!!");
    }


    public void removeCourse(int id){

        try(Connection connection = conn.createConn()){
            String query = "delete from course where idi=?";
            PreparedStatement ps = connection.prepareStatement(query);

            ps.setInt(1,id);

            int x = ps.executeUpdate();

            if(x>0){
                System.out.println("course remove successfully.....!!!");
            }else{
                System.out.println("course not exists....!!!!");
            }
        }catch (Exception e){
            e.getMessage();
        }
    }

    public void showCourses(){
        try(Connection con = conn.createConn()){

            String query = "select * from course";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
                System.out.println("--------------------------");
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int fee = rs.getInt(3);
                String duration = rs.getString(4);

                System.out.println("Course id :- "+id);
                System.out.println("Course name :- "+name);
                System.out.println("Course fee :- "+fee);
                System.out.println("Course duration :- "+duration);

                System.out.println("--------------------------");
            }

        }catch (Exception e){
            e.getMessage();
        }
    }


}
