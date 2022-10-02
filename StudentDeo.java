import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDeo {

    public void addStudent(Student student){
        System.out.println("Student added successfully.....!!!");
       try(Connection connection = conn.createConn()){
           String query = "insert into student values(?,?,?,?,?)";
           PreparedStatement ps = connection.prepareStatement(query);

           ps.setInt(1,student.getStudent_id());
           ps.setString(2,student.getStudent_name());
           ps.setString(3,student.getStudent_mobile());
           ps.setString(4,student.getStudent_address());
           ps.setString(5,student.getPass());

           ps.executeUpdate();



       }catch (Exception e) {
          e.getMessage();
       }
    }

    public void removeStudent(int roll){
        try(Connection connection = conn.createConn()){

            String query = "delete from students where sid=?";
            PreparedStatement ps = connection.prepareStatement(query);

            ps.setInt(1,roll);

            int x = ps.executeUpdate();
            if(x>0){
                System.out.println("Student remove successfully.....!!!");
            }else{
                System.out.println("Student not exists....!!!!");
            }

            System.out.println("Student added successfully.....!!!");

        }catch (Exception e) {
            e.getMessage();
        }


    }

    public void UpdateStudent(int val, String toUpdate, int id, Student student){

        try( Connection con = conn.createConn()){

            if(val == 1) {
                //Update Name
                String query = "update student set sname=? where sid=?";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, toUpdate);
                ps.setInt(2, id);
                //execute..
                int x = ps.executeUpdate();

                if(x>0){
                    System.out.println("Student remove successfully.....!!!");
                }else{
                    System.out.println("Student not exists....!!!!");
                }
            }
            else if(val == 2) {
                //Update Phone
                String query = "update student set sphone=? where sid=?";
                PreparedStatement ps= con.prepareStatement(query);
                ps.setString(1, toUpdate);
                ps.setInt(2, id);

                //execute..
                int x = ps.executeUpdate();

                if(x>0){
                    System.out.println("Student remove successfully.....!!!");
                }else{
                    System.out.println("Student not exists....!!!!");
                }

            }
            else if(val == 3) {
                //Update City
                String query = "update student set scity=? where sid=?";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, toUpdate);
                ps.setInt(2, id);

                //execute..
                ps.executeUpdate();

                int x = ps.executeUpdate();

                if(x>0){
                    System.out.println("Student remove successfully.....!!!");
                }else{
                    System.out.println("Student not exists....!!!!");
                }
            }
            else {

            }
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Student information updated successfully....!!!");
    }

    public void showStudents(){

        List<Student> students= new ArrayList<>();

        try(Connection con = conn.createConn()){

            String query = "select * from student";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
                int roll = rs.getInt(1);
                String name = rs.getString(2);
                String mobile = rs.getString(3);
                String address = rs.getString(4);

                System.out.println("Student roll :- "+roll);
                System.out.println("Student name :- "+name);
                System.out.println("Student mobile :- "+mobile);
                System.out.println("Student address :- "+address);
            }

        }catch (Exception e){
            e.getMessage();
        }
    }

    public boolean loginAndPass(int id,String pass){

        boolean flag = false;

        try(Connection connection = conn.createConn()){

            String query = "SELECT sid,spass FROM student WHERE EXISTS(select snid,spass from where sid=? AND spass=?)";
            PreparedStatement ps = connection.prepareStatement(query);

            ps.setInt(1,id);
            ps.setString(2,pass);

            int x = ps.executeUpdate();
            if(x>0){
                flag = true;
                System.out.println("Login successfully.....!!!");
            }else{
                System.out.println("Not exists....!!!!");
            }


        }catch (Exception e) {
            e.getMessage();
        }


        return flag;
    }

//    public boolean chooseCourse(int val,int student_id,int course_id){
//
//        try(Connection connection = conn.createConn()){
//
////            java
//            if(val == 1 ){
//                String query = "insert alldeatilstables values(?,?)";
//                PreparedStatement ps = connection.prepareStatement(query);
//                ps.setString();
//                ps.setInt();
//                //execute..
//                int x = ps.executeUpdate();
//
//                if(x>0){
//                    System.out.println("Course choose successfully.....!!!");
//                }else{
//                    System.out.println("not selected....!!!!");
//                }
//            }
////          Spring
//            else if (val == 2) {
//                String query = "update student set sname=? where sid=?";
//                PreparedStatement ps = connection.prepareStatement(query);
//                ps.setString();
//                ps.setInt();
//                //execute..
//                int x = ps.executeUpdate();
//
//                if(x>0){
//                    System.out.println("Course choose successfully.....!!!");
//                }else{
//                    System.out.println("not selected....!!!!");
//                }
//            }
////          Mysql
//            else if (val == 3) {
//                String query = "update student set sname=? where sid=?";
//                PreparedStatement ps = connection.prepareStatement(query);
//                ps.setString();
//                ps.setInt();
//                //execute..
//                int x = ps.executeUpdate();
//
//                if(x>0){
//                    System.out.println("Course choose successfully.....!!!");
//                }else{
//                    System.out.println("not selected....!!!!");
//                }
//            }
////          hibernate
//            else if (val == 4) {
//                String query = "update student set sname=? where sid=?";
//                PreparedStatement ps = connection.prepareStatement(query);
//                ps.setString();
//                ps.setInt();
//                //execute..
//                int x = ps.executeUpdate();
//
//                if(x>0){
//                    System.out.println("Course choose successfully.....!!!");
//                }else{
//                    System.out.println("not selected....!!!!");
//                }
//            }
//
//        }catch (Exception e){
//            e.getMessage();
//        }
//
//        return true;
//    }
}

