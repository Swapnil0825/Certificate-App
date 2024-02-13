package certificateApp;

import java.sql.*;

public class myconnection {
    public static Connection getconnection(){
       Connection con=null;
       try
      {
       Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver is registered");
	con= DriverManager.getConnection("jdbc:mysql://localhost:3306/certificate", "root","");
	if(con.isClosed())
			{
				System.out.println("connection closed ");
			}
			else
			{
				System.out.println("Connection created ");
			}
       
}catch(Exception e){
    System.out.println(e.getMessage());
}
        return con;
    
}
public static void main(String arg[])
	{
		myconnection c=new myconnection();
		System.out.println("hello");
		c.getconnection();
		
	
}}
