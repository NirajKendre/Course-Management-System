import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InstructorDao {

    public void addInstructor(Instructor instructor){

        try(Connection connection = conn.createConn()){

            String query = "inset into instructor values(?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);

            ps.setInt(1,instructor.instructor_id);
            ps.setString(2,instructor.instructor_name);
            ps.setString(3,instructor.course);

            int x = ps.executeUpdate();

            if(x>0){
                System.out.println("Instructor added successfully.....!!!");
            }else{
                System.out.println("please enter valid data....!!!!");
            }

        }catch(Exception e){
            e.getMessage();
        }
        System.out.println("Instructor added successfully....!!!!!");
    }

    public void removeInstructor(int id){

        try(Connection connection = conn.createConn()){
            String query = "delete from instructor where idi=?";
            PreparedStatement ps = connection.prepareStatement(query);

            ps.setInt(1,id);

            int x = ps.executeUpdate();

            if(x>0){
                System.out.println("Student remove successfully.....!!!");
            }else{
                System.out.println("Student not exists....!!!!");
            }
        }catch (Exception e){
            e.getMessage();
        }


    }

    public void showInstructors(){

        try(Connection con = conn.createConn()){

            String query = "select * from instructor";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next()){

                System.out.println("--------------------------");
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String course = rs.getString(3);

                System.out.println("Instructor id :- "+id);
                System.out.println("Instructor name :- "+name);
                System.out.println("instructor course :- "+course);

                System.out.println("--------------------------");
            }

        }catch (Exception e){
            e.getMessage();
        }
    }

}
