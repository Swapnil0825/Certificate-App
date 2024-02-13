package certificateApp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Color;
import javax.swing.*;
public class BirthCertificate implements ActionListener
{
	JTextField fullnameTF;JTextField TimeTF;JTextField DateTF;JTextField PlaceTF;JTextField FatherNameTF;JTextField MotherNameTF;
	JTextField HospitalNameTF;JTextField BloodGroupTF;JTextField NationalityTF;JFrame f;
	Connection con=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
	
	BirthCertificate() 
	{
		con=myconnection.getconnection();
		f = new JFrame();
		
		JLabel Registration = new JLabel("Birth Certificate ");
		Registration.setBounds(80, 20, 120, 20);
		
		JLabel fullname = new JLabel("Full Name");
		fullname.setBounds(20, 50, 120, 20);
		
		JLabel Time = new JLabel("Time");
		Time.setBounds(20, 80, 120, 20);
		
		JLabel Date = new JLabel("Date");
		Date.setBounds(20,110,120,20);
		
		JLabel Place = new JLabel("Place");
		Place.setBounds(20,140,120,20);

		JLabel FatherName = new JLabel("Father's Name");
		FatherName.setBounds(20,170,120,20);
		
		JLabel MotherName = new JLabel("Mother's Name");
		MotherName.setBounds(20,200,120,20);
		
		JLabel HospitalName = new JLabel("Hospital Name");
		HospitalName.setBounds(20,230,120,20);
		
		JLabel BloodGroup = new JLabel("Blood Group");
		BloodGroup.setBounds(20,260,120,20);
		
		JLabel Nationality = new JLabel("Nationality");
		Nationality.setBounds(20,290,120,20);
		
		fullnameTF = new JTextField();
		fullnameTF.setBounds(120, 50, 100, 20);
		
		TimeTF = new JTextField();
		TimeTF.setBounds(120,80,100,20);
		
		DateTF = new JTextField();
		DateTF.setBounds(120, 110, 100, 20);
		
		PlaceTF = new JTextField();
		PlaceTF.setBounds(120, 140, 100, 20);
		
		FatherNameTF = new JTextField();
		FatherNameTF.setBounds(120, 170, 100, 20);
		
		MotherNameTF = new JTextField();
		MotherNameTF.setBounds(120, 200, 100, 20);
		
		HospitalNameTF = new JTextField();
		HospitalNameTF.setBounds(120, 230, 100, 20);
		
		BloodGroupTF = new JTextField();
		BloodGroupTF.setBounds(120, 260, 100, 20);
		
		NationalityTF = new JTextField();
		NationalityTF.setBounds(120, 290, 100, 20);
		
		JButton sbmt = new JButton("Submit");
		sbmt.setBounds(20, 350, 100, 30);
		sbmt.addActionListener(this);
		
		JButton rst = new JButton ("Reset");
		rst.setBounds(120, 350, 100, 30);
		rst.addActionListener(this);
		
		JButton back = new JButton ("Back");
		back.setBounds(70, 390, 100, 30);
		back.addActionListener(this);
		
		f.add(Registration);
		f.add(fullname);
		f.add(Time);
		f.add(Date);
		f.add(Place);
		f.add(FatherName);
		f.add(MotherName);
		f.add(HospitalName);
		f.add(BloodGroup);
		f.add(Nationality);
		f.add(fullnameTF);
		f.add(TimeTF);
		f.add(DateTF);
		f.add(PlaceTF);
		f.add(FatherNameTF);
		f.add(MotherNameTF);
		f.add(HospitalNameTF);
		f.add(BloodGroupTF);
		f.add(NationalityTF);
		f.add(back);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(Color.PINK);
		f.add(sbmt);
		f.add(rst);
		
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void insert(){
        String name = fullnameTF.getText();
        String Mname = MotherNameTF.getText();
        String Fname = FatherNameTF.getText();
        String DOB = DateTF.getText();
        String TOB = TimeTF.getText();
        String place = PlaceTF.getText();
        String hospital = HospitalNameTF.getText();
        String blood = BloodGroupTF.getText();
        String nationality = NationalityTF.getText();
        
        try 
        {
            String sql = "INSERT INTO `birth certificate`(`Full Name`, `Time Of Birth`, `Date Of Birth`, `Place Of Birth`, `Father's Name`, `Mother's Name`, `Hospital Name`, `Blood Group`, `Nationality`) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            
            pst.setString(1, name);
            pst.setString(2, TOB);
            pst.setString(3, DOB);
            pst.setString(4, place);
            pst.setString(5, Fname);
            pst.setString(6, Mname);
            pst.setString(7, hospital);
            pst.setString(8, blood);
            pst.setString(9, nationality);

            
            
            
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
		BirthCertificate s = new BirthCertificate();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{		
		String command = e.getActionCommand();
		 if(command.equals("Submit"))
		 {
			 insert();
			 EndScreen endS = new EndScreen();
			 f.setVisible(false);
		 }
		 else if(command.equals("Reset")) {
			    fullnameTF.setText(null);
				TimeTF.setText(null);
				DateTF.setText(null);
				PlaceTF.setText(null);
				FatherNameTF.setText(null);
				MotherNameTF.setText(null);
				HospitalNameTF.setText(null);
				BloodGroupTF.setText(null);
				NationalityTF.setText(null);
		 }
		  else if(command.equals("Back")) 
		  	{
				 applicationForms af  = new applicationForms();
				 f.setVisible(false);
			}
		
	}
}