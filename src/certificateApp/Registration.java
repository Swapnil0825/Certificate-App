package certificateApp;

import javax.swing.*;
import java.sql.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Registration implements ActionListener
{
	JTextField fullnameTF;JTextField EmailTF;JTextField dobTF;JTextField PasswordTF;JTextField ConfirmPasswordTF;
	JTextField addressTF;JTextField phnNumTF;JFrame f3;
	Connection con=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    String password;
    String Cpassword;
	Registration()
	{
		
		con=myconnection.getconnection();
		f3 = new JFrame();
		
		JLabel Registration = new JLabel("Registration ");
		Registration.setBounds(80, 20, 120, 20);
		
		JLabel fullname = new JLabel("Full Name ");
		fullname.setBounds(20, 50, 120, 20);
		
		JLabel Email = new JLabel("Email ");
		Email.setBounds(20, 80, 120, 20);
		
		JLabel phnNum = new JLabel("Phone Number");
		phnNum.setBounds(20,110,120,20);
		
		JLabel dob = new JLabel("Date of Birth");
		dob.setBounds(20,140,120,20);
		
		JLabel address = new JLabel("Address");
		address.setBounds(20,170,120,20);
					
		JLabel Password = new JLabel("Password");
		Password.setBounds(20,270,120,20);

		JLabel ConfirmPassword = new JLabel("Confirm Password");
		ConfirmPassword.setBounds(20,300,120,20);
		
		fullnameTF = new JTextField();
		fullnameTF.setBounds(140, 50, 100, 20);
		
		EmailTF = new JTextField();
		EmailTF.setBounds(140,80,100,20);
		
		phnNumTF = new JTextField();
		phnNumTF.setBounds(140, 110, 100, 20);
		
		dobTF = new JTextField();
		dobTF.setBounds(140, 140, 100, 20);
		
		addressTF = new JTextField();
		addressTF.setBounds(140, 170, 200, 80);
		
		PasswordTF= new JTextField();
		PasswordTF.setBounds(140, 270, 100, 20);
		
		ConfirmPasswordTF = new JTextField();
		ConfirmPasswordTF.setBounds(140, 300, 100, 20);
		
		JButton sbmt = new JButton("Submit");
		sbmt.setBounds(20, 350, 100, 30);
		sbmt.addActionListener(this);
		
		JButton rst = new JButton ("Reset");
		rst.setBounds(140, 350, 100, 30);
		rst.addActionListener(this);
		
		JButton back = new JButton ("Back");
		back.setBounds(80, 390, 100, 30);
		back.addActionListener(this);
		
		f3.add(Registration);
		f3.add(fullname);
		f3.add(Email);
		f3.add(dob);
		f3.add(Password);
		f3.add(ConfirmPassword);
		f3.add(fullnameTF);
		f3.add(EmailTF);
		f3.add(dobTF);
		f3.add(PasswordTF);
		f3.add(ConfirmPasswordTF);
		f3.add(sbmt);
		f3.add(addressTF);
		f3.add(address);
		f3.add(rst);
		f3.add(phnNum);
		f3.add(phnNumTF);
		f3.add(back);
		
		
		f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f3.getContentPane().setBackground(Color.PINK);
		f3.setSize(600,600);
		f3.setLayout(null);
		
		f3.setVisible(true);
	}
	public void insert(){
        String name = fullnameTF.getText();
        password = PasswordTF.getText();
        Cpassword = ConfirmPasswordTF.getText();
        String email = EmailTF.getText();
        String DOB = dobTF.getText();
        String address = addressTF.getText();
        String phno = phnNumTF.getText();
        
        try 
        {
            String sql = "INSERT INTO `login`(`Full Name`, `Email`, `Phone Number`, `Date Of Birth`, `Address`, `Password`) VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            
            pst.setString(1, name);
            pst.setString(2, email);
            pst.setString(3, phno);
            pst.setString(4, DOB);
            pst.setString(5, address);
            pst.setString(6, password);
            
            
            
            int updatedRowCount = pst.executeUpdate();
            
            if(updatedRowCount > 0){
                System.out.println( "Record inserted Successfully");
               
            }
            else{
                System.out.println("Try again");
            }
                
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
	public static void main (String []args) 
	{
		Registration s = new Registration();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		String command = e.getActionCommand();
		 if(command.equals("Submit"))
		 {
				insert();
				customerLogin custLog  = new customerLogin();
				f3.setVisible(false);
		 }
		 else if(command.equals("Reset")) {
			 fullnameTF.setText(null);
			 EmailTF.setText(null);
			 dobTF.setText(null);
			 addressTF.setText(null);
			 PasswordTF.setText(null);
			 ConfirmPasswordTF.setText(null);
			 phnNumTF.setText(null);
		 }
		 else if(command.equals("Back")) 
		  	{
				 choice af  = new choice();
			}
		
		
	}
}
