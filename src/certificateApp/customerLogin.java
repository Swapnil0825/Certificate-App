package certificateApp;
import java.sql.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class customerLogin implements ActionListener {
	JTextField mailTF;JPasswordField passwordTF;JFrame f4;
	Connection con=null;
	ResultSet rs=null;
	PreparedStatement ps=null;
	public int count=0;
	public customerLogin() {
		con=myconnection.getconnection();
		f4 = new JFrame();
		
		JLabel employee = new JLabel("Customer Login"); 
		employee.setBounds(20, 30, 90, 20);
		JLabel mail = new JLabel("Mail Id");
		mail.setBounds(20, 60, 80, 20);
		
		JLabel password = new JLabel("Password ");
		password.setBounds(20, 90, 80, 20);
		
		
		
		mailTF = new JTextField();
		mailTF.setBounds(120, 60, 100, 20);
		
		 passwordTF = new JPasswordField();
		passwordTF.setBounds(120,90,100,20);
		
		JButton sbmt = new JButton("Submit");
		sbmt.setBounds(20, 160, 100, 30);
		sbmt.addActionListener( this);
		
		JButton rst = new JButton("Reset");
		rst.setBounds(150, 160, 100, 30);
		rst.addActionListener( this);
		
		JButton back = new JButton ("Back");
		back.setBounds(80, 200, 100, 30);
		back.addActionListener(this);
		
		
	
		f4.add(employee);
		f4.add(mail);
		f4.add(password);
		f4.add(mailTF);
		f4.add(passwordTF);     
		f4.add(sbmt);
		f4.add(rst);
		f4.add(back);
		
		f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f4.getContentPane().setBackground(Color.PINK);
		f4.setSize(600,600);
		f4.setLayout(null);
		f4.setVisible(true);
	}
	public int LoginCheck(){
        String uname=mailTF.getText();
        String pass=passwordTF.getText();
        if (uname.equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null,"username field is empty");
        }else if (pass.equals(""))
        {
            JOptionPane.showMessageDialog(null,"password field is empty");
        }
        else{
            String query ="SELECT * FROM `login` where `Email` = ? AND `Password` = ?;";

            try{
                ps=con.prepareStatement(query);
              
                ps.setString(1,uname);
                ps.setString(2,pass);
               
                rs=ps.executeQuery();
                

                if(rs.next()){
                  
                    JOptionPane.showMessageDialog(null,"login successfully");
                  
                    
                }else
                {
                    JOptionPane.showMessageDialog(null,"login failed");
                    count++;
                    mailTF.setText("");
                    passwordTF.setText("");
                }
            }catch (Exception ex)
            {
                JOptionPane.showMessageDialog(null,ex);
            }}
        return count;
    }
	public void actionPerformed(ActionEvent e)
	 {
		 
		 String command = e.getActionCommand();
		 if(command.equals("Submit"))
		 {
			 int c=LoginCheck();
			 if(c==0)
			 {
			 LoginCheck();
			applicationForms options = new applicationForms();
			f4.setVisible(false);
			 }
		 }
		 else if (command.equals("Reset")) {
			 mailTF.setText(null);
			 passwordTF.setText(null);
		 }
		 else if(command.equals("Back")) 
		  	{
				 choice ch  = new choice();
				 f4.setVisible(false);
			}
		
		 
	 }
public static void main (String []args) {
	
	customerLogin c = new customerLogin();
	

	}

}