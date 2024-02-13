package certificateApp;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

public class aadharCard implements ActionListener 
{
	JTextField firstNameTF;JTextField mNameTF;JTextField fNameTF;JTextField dobTF;JTextField phnNumberTF;JTextField addressTF;JFrame f10;
	Connection con=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    
	aadharCard()
	{
		con=myconnection.getconnection();
		f10 = new JFrame();
		
		JLabel title = new JLabel ("Aadhar Card");
		title.setBounds(60, 10, 120, 20);
		
		JLabel firstName = new JLabel(" Name ");
		firstName.setBounds(20, 50, 80, 20);
		
		JLabel mName = new JLabel(" Mother Name ");
		mName.setBounds(20, 80, 130, 20);
		
		JLabel fName = new JLabel(" Father Name ");
		fName.setBounds(20, 110, 80, 20);
		
		JLabel dob = new JLabel(" Date Of Birth ");
		dob.setBounds(20,140,100,20);
		
		JLabel phnNumber = new JLabel(" Phone Number ");
		phnNumber.setBounds(20,170,150,20);
		
		JLabel address = new JLabel(" Address ");
		address.setBounds(20,200,80,20);
		
		

		
		firstNameTF = new JTextField();
		firstNameTF.setBounds(120, 50, 100, 20);
		
		mNameTF = new JTextField();
		mNameTF.setBounds(120,80,100,20);
		
		fNameTF = new JTextField();
		fNameTF.setBounds(120,110,100,20);
		
		dobTF = new JTextField();
		dobTF.setBounds(120, 140, 100, 20);
		
		phnNumberTF = new JTextField();
		phnNumberTF.setBounds(120, 170, 100, 20);
		
		addressTF = new JTextField();
		addressTF.setBounds(120, 200, 100, 20);
		
	
		JButton sbmt = new JButton ("Submit");
		sbmt.setBounds(20, 280, 100, 30);
		sbmt.addActionListener(this);
		
		JButton rst = new JButton ("Reset");
		rst.setBounds(150, 280, 100, 30);
		rst.addActionListener(this);
		
		JButton back = new JButton ("Back");
		back.setBounds(70, 320, 100, 30);
		back.addActionListener(this);
		
		
		f10.add(title);
		f10.add(firstName);
		f10.add(mName);
		f10.add(fName);
		f10.add(dob);
		f10.add(phnNumber);
		f10.add(address);
		
		f10.add(firstNameTF);
		f10.add(mNameTF);
		f10.add(fNameTF);
		f10.add(dobTF);
		f10.add(phnNumberTF);
		f10.add(addressTF);
		f10.add(sbmt);
		f10.add(rst);
		f10.add(back);
		f10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f10.getContentPane().setBackground(Color.PINK);

		f10.setSize(600,600);
		f10.setLayout(null);
		f10.setVisible(true);
	}
	public void insert(){
        String name = firstNameTF.getText();
        String Mname = mNameTF.getText();
        String Fname = fNameTF.getText();
        String DOB = dobTF.getText();
        String phno = phnNumberTF.getText();
        String address = addressTF.getText();
       
        
        try 
        {
            String sql = "INSERT INTO `aadhar card`(`Name`, `Mother's Name`, `Father's Name`, `Date Of Birth`, `Phone Number`, `Address`) VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            
            pst.setString(1, name);
            pst.setString(2, Mname);
            pst.setString(3, Fname);
            pst.setString(4, DOB);
            pst.setString(5, phno);
            pst.setString(6, address);

            
            
            
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
	    	aadharCard ac = new aadharCard();
	   }
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String command = e.getActionCommand();
			 if(command.equals("Submit"))
			 {
				 insert();
				EndScreen endS = new EndScreen();
				f10.setVisible(false);
			 }
			 else if(command.equals("Reset")) 
			 {
				 firstNameTF.setText(null);
				 mNameTF.setText(null);
				 fNameTF.setText(null);
				 dobTF.setText(null);
				 phnNumberTF.setText(null);
				 addressTF.setText(null);
			 }
			 else if(command.equals("Back")) 
			 {
				 applicationForms af  = new applicationForms();
				 f10.setVisible(false);
			 }
			
		}
		
}
