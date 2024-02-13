package certificateApp;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

public class IncomeCertificate implements ActionListener 
{
	JTextField currentTF;JTextField annualTF;JTextField panTF;JTextField nameTF;JTextField ageTF;
	JTextField employmentStatusTF;JMenuItem open;JFileChooser fc;JMenu file;JMenuBar mb;JFrame f11;
	Connection con=null;
    ResultSet rs=null;
    PreparedStatement ps=null;

	public IncomeCertificate() 
	{
		con=myconnection.getconnection();
		f11 = new JFrame();
		
		JLabel details = new JLabel("Fill Details Required For Income Certificate"); 
		details.setBounds(20, 30, 270, 20);
		
		JLabel name = new JLabel("Full Name");
		name.setBounds(20, 60, 80, 20);
		
		JLabel age = new JLabel("Age ");
		age.setBounds(20, 90, 80, 20);
		
		JLabel employmentStatus = new JLabel("Employment Status");
		employmentStatus.setBounds(20, 120, 120, 20);
		
		JLabel current = new JLabel("Current Company Name");
		current.setBounds(20, 150, 150, 20);
		
		JLabel annual = new JLabel("Annual Income");
		annual.setBounds(20, 180, 150, 20);
		
		JLabel pan = new JLabel("Pan Card Number");
		pan.setBounds(20, 210, 150, 20);
		
		nameTF = new JTextField();
		nameTF.setBounds(180, 60, 120, 20);
		
		ageTF = new JTextField();
		ageTF.setBounds(180,90,120,20);
		
		employmentStatusTF = new JTextField();
		employmentStatusTF.setBounds(180,120,120,20);
		
		currentTF = new JTextField();
		currentTF.setBounds(180,150,120,20);
		
		annualTF = new JTextField();
		annualTF.setBounds(180,180,120,20);
		
		panTF = new JTextField();
		panTF.setBounds(180,210,120,20);
		
		JButton sbmt = new JButton("Submit");
		sbmt.setBounds(60, 240, 100, 30);
		sbmt.addActionListener(this);
		
		
		JButton rst = new JButton("Reset");
		rst.setBounds(180, 240, 100, 30);
		rst.addActionListener(this);
		
		JButton back = new JButton ("Back");
		back.setBounds(120, 280, 100, 30);
		back.addActionListener(this);
		
	
		f11.add(details);
		f11.add(name);
		f11.add(age);
		f11.add(employmentStatus);
		f11.add(current);
		f11.add(annual);
		f11.add(pan);
		f11.add(nameTF);     
		f11.add(ageTF);
		f11.add(employmentStatusTF);
		f11.add(currentTF);
		f11.add(annualTF);
		f11.add(panTF);
		f11.add(sbmt);
		f11.add(rst);
		f11.add(back);
		
		f11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f11.getContentPane().setBackground(Color.PINK);
		f11.setSize(600,600);
		f11.setLayout(null);
		f11.setVisible(true);
	}
	public void insert(){
        String name = nameTF.getText();
        String age = ageTF.getText();
        String employment = employmentStatusTF.getText();
        String cJob = currentTF.getText();
        String annual = annualTF.getText();
        String pan = panTF.getText();
       
        
        try 
        {
            String sql = "INSERT INTO `income certificate`(`Full Name`, `Age`, `Employment Status`, `Current Company Name`, `Annual Income`, `Pan Card Number`) VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            
            pst.setString(1, name);
            pst.setString(2, age);
            pst.setString(3, employment);
            pst.setString(4, cJob);
            pst.setString(5, annual);
            pst.setString(6, pan);

            
            
            
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
	 public void actionPerformed(ActionEvent e)
	 {
		 
		 String command = e.getActionCommand();
		 if(command.equals("Submit"))
		 {
			 insert();
			EndScreen endS = new EndScreen();
			f11.setVisible(false);
		 }
		 else if(command.equals("Reset")) {
			 nameTF.setText(null);
			 ageTF.setText(null);
			 currentTF.setText(null);
			 annualTF.setText(null);
			 panTF.setText(null);
		 }
		 else if(command.equals("Back")) 
		  	{
				 applicationForms af  = new applicationForms();
				 f11.setVisible(false);
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
public static void main (String []args) {
	
	IncomeCertificate i = new IncomeCertificate();
	

	}
	}