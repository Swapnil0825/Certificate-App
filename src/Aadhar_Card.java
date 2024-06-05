import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Aadhar_Card implements ActionListener{
    JPanel P1, P2, P3;
    JLabel logo, Name, quots, logo1, logo2, logo3, logo4, logo5, logo6, logo7;
    JButton Birth, Cast, Domicile, Aadhar, Income, Logout;
    JLabel home;
    JTextField firstNameTF,mNameTF,fNameTF,dobTF,phnNumberTF,addressTF;
    JButton sbmt,rst,back;

    public Aadhar_Card() {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setBounds(100, 50, 1200, 700);
        f.setTitle("DashBoard");

        Container c = f.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        P1 = new JPanel();
        P1.setLayout(null);
        P1.setVisible(true);
        P1.setBounds(0, 0, 350, 800);
        P1.setBackground(Color.WHITE);
        c.add(P1);

        P2 = new JPanel();
        P2.setLayout(null);
        P2.setVisible(true);
        P2.setBounds(350, 0, 850, 800);
        P2.setBackground(Color.LIGHT_GRAY);
        c.add(P2);

        P3 = new JPanel();
        P3.setLayout(null);
        P3.setVisible(true);
        P3.setBounds(60, 100, 730, 550);
        P3.setBackground(Color.WHITE);
        P2.add(P3);

       

        Name = new JLabel("SWAPNIL SYSTEMS");
        Name.setVisible(true);
        Name.setBounds(100, 30, 250, 25);
        Font font1 = new Font("Arial Black", Font.BOLD, 20);
        Name.setFont(font1);
        P1.add(Name);

        quots = new JLabel("  Efficiency Is Everything");
        quots.setVisible(true);
        quots.setBounds(100, 60, 250, 25);
        Font font2 = new Font("Times New Roman", Font.PLAIN, 20);
        quots.setFont(font2);
        P1.add(quots);

        Birth = new JButton("Birth Certificate");
        Birth.setVisible(true);
        Birth.setBounds(50, 150, 270, 45);
        Font font4 = new Font("Arial Black", Font.BOLD, 20);
        Birth.setFont(font4);
        Birth.addActionListener(this);
        P1.add(Birth);

       

        Cast = new JButton("Cast Certificate");
        Cast.setVisible(true);
        Cast.setBounds(50, 230, 270, 45);
        Font font5 = new Font("Arial Black", Font.BOLD, 20);
        Cast.setFont(font5);
        Cast.addActionListener(this);
        P1.add(Cast);

       

        Domicile = new JButton("Domicile Certificate");
        Domicile.setVisible(true);
        Domicile.setBounds(50, 310, 270, 45);
        Font font6 = new Font("Arial Black", Font.BOLD, 20);
        Domicile.setFont(font6);
        Domicile.addActionListener(this);
        P1.add(Domicile);

      

        Aadhar = new JButton("Aadhar Card");
        Aadhar.setVisible(true);
        Aadhar.setBounds(50, 390, 270, 45);
        Font font7 = new Font("Arial Black", Font.BOLD, 20);
        Aadhar.setFont(font7);
        Aadhar.addActionListener(this);
        P1.add(Aadhar);

       

        Income = new JButton("Income Certificate");
        Income.setVisible(true);
        Income.setBounds(50, 470, 270, 45);
        Font font8 = new Font("Arial Black", Font.BOLD, 20);
        Income.setFont(font8);
        Income.addActionListener(this);
        P1.add(Income);

    
        Logout = new JButton("Logout");
        Logout.setVisible(true);
        Logout.setBounds(50, 580, 270, 45);
        Font font9 = new Font("Arial Black", Font.BOLD, 20);
        Logout.setFont(font9);
        Logout.addActionListener(this);
        P1.add(Logout);

        home = new JLabel("Aadhar Card");
        home.setVisible(true);
        home.setBounds(50, 50, 500, 35);
        Font font3 = new Font("Arial Black", Font.BOLD, 40);
        home.setFont(font3);
        P2.add(home);


        JLabel title = new JLabel ("Enter Details");
		Font font11 = new Font("Arial Black", Font.BOLD, 25);
        title.setFont(font11);
		title.setBounds(250, 10, 300, 35);
		
		JLabel firstName = new JLabel(" Name ");
		Font font10 = new Font("Arial Black", Font.BOLD, 20);
        firstName.setFont(font10);
		firstName.setBounds(20, 50, 250, 25);
		
		JLabel mName = new JLabel(" Mother Name ");
        Font font12 = new Font("Arial Black", Font.BOLD, 20);
        mName.setFont(font12);
		mName.setBounds(20, 100, 250, 25);
		
		JLabel fName = new JLabel(" Father Name ");
        Font font13 = new Font("Arial Black", Font.BOLD, 20);
        fName.setFont(font13);
		fName.setBounds(20, 150, 250, 25);
		
		JLabel dob = new JLabel(" Date Of Birth ");
        Font font14 = new Font("Arial Black", Font.BOLD, 20);
        dob.setFont(font14);
		dob.setBounds(20,200,250,25);
		
		JLabel phnNumber = new JLabel(" Phone Number ");
        Font font15 = new Font("Arial Black", Font.BOLD, 20);
        phnNumber.setFont(font15);
		phnNumber.setBounds(20,250,250,25);
		
		JLabel address = new JLabel(" Address ");
        Font font16 = new Font("Arial Black", Font.BOLD, 20);
        address.setFont(font16);
		address.setBounds(20,300,250,25);
		
		

		firstNameTF = new JTextField();
		firstNameTF.setBounds(250, 50, 200, 25);
		
		mNameTF = new JTextField();
		mNameTF.setBounds(250, 100, 200, 25);
		
		fNameTF = new JTextField();
		fNameTF.setBounds(250, 150, 200, 25);
		
		dobTF = new JTextField();
		dobTF.setBounds(250, 200, 200, 25);
		
		phnNumberTF = new JTextField();
		phnNumberTF.setBounds(250, 250, 200, 25);
		
		addressTF = new JTextField();
		addressTF.setBounds(250, 300, 200, 25);
		
	
		sbmt = new JButton ("Submit");
		sbmt.setBounds(90, 350, 150, 40);
        sbmt.addActionListener(this);

		
		rst = new JButton ("Reset");
		rst.setBounds(390, 350, 150, 40);
        rst.addActionListener(this);
		
		
		back = new JButton ("Back");
		back.setBounds(240, 400, 150, 40);
        back.addActionListener(this);
	
		
		
		P3.add(title);
		P3.add(firstName);
		P3.add(mName);
		P3.add(fName);
		P3.add(dob);
		P3.add(phnNumber);
		P3.add(address);
		
		P3.add(firstNameTF);
		P3.add(mNameTF);
		P3.add(fNameTF);
		P3.add(dobTF);
		P3.add(phnNumberTF);
		P3.add(addressTF);
		P3.add(sbmt);
		P3.add(rst);
		P3.add(back);
		// P3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// P3.getContentPane().setBackground(Color.PINK);

	
		P3.setLayout(null);
		P3.setVisible(true);

      
    }
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource()==Birth) {
                Birth_Certificate B = new Birth_Certificate();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();  
            } else if (e.getSource()==Cast) {
                Cast_Certificate B = new Cast_Certificate();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();   
            }else if (e.getSource()==Domicile) {
                Domicile_Certificate B = new Domicile_Certificate();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();   
            }else if (e.getSource()==Aadhar) {
                Aadhar_Card B = new Aadhar_Card();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose(); 
            }else if (e.getSource()==Income) {
                Income_Certificate B = new Income_Certificate();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose(); 
            }else if (e.getSource()==Logout) {
                LoginPage B = new LoginPage();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose(); 
            }else if(e.getSource()==sbmt){

                String name = firstNameTF.getText();
                String Mname = mNameTF.getText();
                String Fname = fNameTF.getText();
                String DOB = dobTF.getText();
                String phno = phnNumberTF.getText();
                String address = addressTF.getText();

                Conn c = new Conn();

                String query = "insert into `aadhar_certificate` values('" + name + "','" + Mname + "','" + Fname + "','"
                        + DOB + "','" + phno + "','"+address+"');";

                c.s.executeUpdate(query);

                System.out.println("Successfully Insert");

                JOptionPane.showMessageDialog(null, "Applied Succesfully!!");
                EndScreen d = new EndScreen();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose(); 
            }else if (e.getSource()==rst) {
                firstNameTF.setText(null);
                mNameTF.setText(null);
                fNameTF.setText(null);
                dobTF.setText(null);
                phnNumberTF.setText(null);
                addressTF.setText(null);
            }else if (e.getSource()==back) {
                DashBoard d = new DashBoard();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose(); 
            }         
            
        } catch (Exception e1) {
            System.out.println(e1);
        }
    }

    public static void main(String[] args) {
        new Aadhar_Card();
    }

}

