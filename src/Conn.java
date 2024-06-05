import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn(){
        
        try {
            String url = "jdbc:mysql://localhost:3306/certificateapp";
            String user = "root";
            String Pass = "Swapnil@12120131";

            c = DriverManager.getConnection(url, user, Pass);
            s = c.createStatement();


        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
