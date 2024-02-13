package certificateApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Color;

import javax.swing.*;
public class castCertificate implements ActionListener
{
	JTextField fullNameTF;JTextField aadharnumTF;JMenuItem open;JFileChooser fc;JFrame f8;
	JMenu file1;JMenuBar mb1;JMenuItem open1;
	JMenu file2;JMenuBar mb2;JMenuItem open2;
	JMenu file3;JMenuBar mb3;JMenuItem open3;
	JMenu file4;JMenuBar mb4;JMenuItem open4;
	JMenu file5;JMenuBar mb5;JMenuItem open5;
	Connection con=null;
    ResultSet rs=null;
    PreparedStatement ps=null;

	castCertificate()
	{
		con=myconnection.getconnection();
		f8 = new JFrame();
		
		JLabel title = new JLabel ("Cast Certificate");
		title.setBounds(60, 10, 120, 20);
		
		JLabel fullName = new JLabel(" Full Name ");
		fullName.setBounds(20, 50, 80, 20);
		
		JLabel aadharNum = new JLabel("Aadhar Number");
		aadharNum.setBounds(20, 80, 110, 20);
		
		JLabel heading = new JLabel("Upload the following Documents:- ");
		heading.setBounds(20, 120, 210, 20);
		
		fullNameTF = new JTextField();
		fullNameTF.setBounds(120, 50, 100, 20);
		
		aadharnumTF = new JTextField();
		aadharnumTF.setBounds(120, 80, 100, 20);
		
		
		JButton sbmt = new JButton ("Submit");
		sbmt.setBounds(60, 340, 100, 30);
		sbmt.addActionListener(this);
		
		JButton rst = new JButton ("Reset");
		rst.setBounds(180, 340, 100, 30);
		rst.addActionListener(this);
		
		JButton back = new JButton ("Back");
		back.setBounds(120, 380, 100, 30);
		back.addActionListener(this);
		
		
		open1=new JMenuItem("Open File");  // birth file chooser
		open1.addActionListener(this);       
		file1=new JMenu("1.Birth Certificate");
		
		file1.add(open1);             
		mb1=new JMenuBar();    
		mb1.setBounds(180, 150, 150, 20);    
		mb1.add(file1);
		f8.add(mb1);
		
		open2=new JMenuItem("Open File");  // income file chooser
		open2.addActionListener(this);       
		file2=new JMenu("2.Income Certificate");
		
		file2.add(open2);             
		mb2=new JMenuBar();    
		mb2.setBounds(180, 180, 150, 20);    
		mb2.add(file2);
		f8.add(mb2);
		
		open3=new JMenuItem("Open File");  // Ration file chooser
		open3.addActionListener(this);       
		file3=new JMenu("3.Ration Card");
		
		file3.add(open3);             
		mb3=new JMenuBar();    
		mb3.setBounds(180, 210, 150, 20);    
		mb3.add(file3);
		f8.add(mb3);
		
		open4=new JMenuItem("Open File");  // address file chooser
		open4.addActionListener(this);       
		file4=new JMenu("4.Address Proof");
		
		file4.add(open4);             
		mb4=new JMenuBar();    
		mb4.setBounds(180, 240, 150, 20);    
		mb4.add(file4);
		f8.add(mb4);
		
		open5=new JMenuItem("Open File");  // photo file chooser
		open5.addActionListener(this);       
		file5=new JMenu("5.Photo");
		
		file5.add(open5);             
		mb5=new JMenuBar();    
		mb5.setBounds(180, 270, 150, 20);    
		mb5.add(file5);
		f8.add(mb5);
		
		
		
		f8.add(title);
		f8.add(fullName);
		f8.add(aadharNum);
		f8.add(fullNameTF);
		f8.add(heading);
		f8.add(aadharnumTF);
		f8.add(sbmt);
		f8.add(rst);
		f8.add(back);
		f8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f8.getContentPane().setBackground(Color.PINK);
		f8.setSize(600,600);
		f8.setLayout(null);
		f8.setVisible(true);
	}
	public void insert(){
        String name = fullNameTF.getText();
        String aadharN = aadharnumTF.getText();
		
       
        
        try 
        {
            String sql = "INSERT INTO `caste_certificate`(`Full_Name`, `Aadhar_Number`, `Birth_Certificate`, `Income_Certificate`, `Ration_Card`, `Address_Proof`, `Photo`) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            
            pst.setString(1, name);
			pst.setString(2, aadharN);
			pst.setString(3, null); // Birth Certificate
			pst.setString(4, null); // Income Certificate
			pst.setString(5, null); // Ration Card
			pst.setString(6, null); // Address
			pst.setString(7, null); // Photo
			           
            
            
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
	    	castCertificate SP = new castCertificate();
	   }
		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			 if(command.equals("Submit"))
			 {
				 insert();
				 EndScreen endS = new EndScreen();
				 f8.setVisible(false);
			 }
			 else if(command.equals("Reset")) {
				 aadharnumTF.setText(null);
				 fullNameTF.setText(null);
			 }
			else if(command.equals("Back")) 
		  	{
				 applicationForms af  = new applicationForms();
				 f8.setVisible(false);
			}
			else if (e.getSource()==open1) 
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
			else if (e.getSource()==open2) 
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
			else if (e.getSource()==open3) 
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
			else if (e.getSource()==open4) 
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