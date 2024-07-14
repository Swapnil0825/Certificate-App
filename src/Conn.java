import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn(){
        
        try {
            String url = " ";
            String user = " ";
            String Pass = " ";

            c = DriverManager.getConnection(url, user, Pass);
            s = c.createStatement();


        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
