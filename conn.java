import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conn {

    static Connection conn;

    public static Connection createConn() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        String url = "jdbc:mysql://localhost:3306/project";

        try {
             conn =  DriverManager.getConnection(url,"root","19@NiraJKendrE97");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

//        System.out.println("Connected......!!!");
        return conn;
    }


}
