package certificateApp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import java.awt.Color;

public class domicilecertificate implements ActionListener 
{
	JTextField nameTF;JTextField addressTF;JTextField birthPlaceTF;JTextField aadharNumberTF;JTextField panNumTF;
	JMenuItem open;JFileChooser fc;JMenu file;JMenuBar mb;JFrame f9;
	Connection con=null;
    ResultSet rs=null;
    PreparedStatement ps=null;


public domicilecertificate() 
{
		
		con=myconnection.getconnection();
		f9 = new JFrame();
		
		JLabel title = new JLabel ("Domicile Certificate");
		title.setBounds(60, 10, 120, 20);
		
		JLabel name = new JLabel(" Full Name ");
		name.setBounds(20, 50, 80, 20);
		
		JLabel address = new JLabel(" Address ");
		address.setBounds(20, 80, 80, 20);
		
		JLabel birthPlace = new JLabel(" Place of Birth");
		birthPlace.setBounds(20,110,90,20);
		
		JLabel aadharNumber = new JLabel(" Aadhar Card Number");
		aadharNumber.setBounds(20,140,150,20);
		
		JLabel panNum = new JLabel(" PAN Card Number");
		panNum.setBounds(20,170,120,20);
		
		
		JLabel heading = new JLabel("Upload the following Documents:- ");
		heading.setBounds(20, 200, 210, 20);
		
		JLabel birthC = new JLabel("1.Birth Certificate ");
		birthC.setBounds(20, 230, 110, 20);
		
		
		nameTF = new JTextField();
		nameTF.setBounds(150, 50, 180, 20);
		
		addressTF = new JTextField();
		addressTF.setBounds(150,80,180,20);
		
		birthPlaceTF = new JTextField();
		birthPlaceTF.setBounds(150, 110, 180, 20);
		
		aadharNumberTF = new JTextField();
		aadharNumberTF.setBounds(150, 140, 180, 20);
		
		panNumTF = new JTextField();
		panNumTF.setBounds(150, 170, 180, 20);
		
		
		
		
		JButton sbmt = new JButton ("Submit");
		sbmt.setBounds(60, 370, 100, 30);
		sbmt.addActionListener(this);
		
		JButton rst = new JButton ("Reset");
		rst.setBounds(180, 370, 100, 30);
		rst.addActionListener(this);
		
		JButton back = new JButton ("Back");
		back.setBounds(120, 410, 100, 30);
		back.addActionListener(this);
		
		
		open=new JMenuItem("Open File");  // file chooser
		open.addActionListener(this);            
		file=new JMenu("Upload Birth Certificate");
		
		file.add(open);             
		mb=new JMenuBar();    
		mb.setBounds(150, 230, 150, 20);    
		mb.add(file);
		f9.add(mb);
		
		
		f9.add(title);
		f9.add(name);
		f9.add(address);
		f9.add(birthPlace);
		f9.add(aadharNumber);
		f9.add(panNum);
		
		f9.add(nameTF);
		f9.add(addressTF);
		f9.add(birthPlaceTF);
		f9.add(aadharNumberTF);
		f9.add(panNumTF);
		f9.add(sbmt);
		f9.add(rst);
		f9.add(heading);
		f9.add(birthC);
		f9.add(back);
	
		f9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f9.getContentPane().setBackground(Color.PINK);
		
		f9.setSize(600,600);
		f9.setLayout(null);
		f9.setVisible(true);
	}
public void insert(){
    String name = nameTF.getText();
    String birthP = birthPlaceTF.getText();
    String aadharN = aadharNumberTF.getText();
    String panN = panNumTF.getText();
    String address = addressTF.getText();
    
    try 
    {
        String sql = "INSERT INTO `domicile_certificate`(`Full_Name`, `Address`, `Place_Of_Birth`, `Aadhar_Card_Number`, `PAN_Card_Number`) VALUES (?,?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        
        
        pst.setString(1, name);
        pst.setString(2, address);
        pst.setString(3, birthP);
        pst.setString(4, aadharN);
        pst.setString(5, panN);

        
        
        
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
	    	domicilecertificate dc = new domicilecertificate();
	   }
		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			 if(command.equals("Submit"))
			 {
				 insert();
				EndScreen endS = new EndScreen();
				f9.setVisible(false);
			 }
			 else if(command.equals("Reset")) {
				 nameTF.setText(null);
				 addressTF.setText(null);
				 birthPlaceTF.setText(null);
				 aadharNumberTF.setText(null);
				 panNumTF.setText(null);
			 }
			else if(command.equals("Back")) 
		  	{
				 applicationForms af  = new applicationForms();
				 f9.setVisible(false);
			}
			else if (e.getSource()==open) 
			 {
				 fc= new JFileChooser();
				    int i=fc.showOpenDialog(null);    
				    if(i==JFileChooser.APPROVE_OPTION)
				    {    
				        File f=fc.getSelectedFile();    
				        String filepath=f.getPath();    
				        try{  
				        BufferedReader br=new BufferedReader(new FileReader(filepath));    
				        String s1="", s2="";                         
				        while((s1=br.readLine())!=null)
				        {    
				        	s2+=s1+"\n";    
				        }   
				            
				        br.close();    
				        }
				        catch (Exception ex) {ex.printStackTrace();  }                 
			        }     
			  }
		
			
		}

	}