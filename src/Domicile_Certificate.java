import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Domicile_Certificate implements ActionListener{
    JPanel P1, P2, P3;
    JLabel logo, Name, quots, logo1, logo2, logo3, logo4, logo5, logo6, logo7;
    JButton Birth, Cast, Domicile, Aadhar, Income, Logout;
    JLabel home;
    JTextField nameTF,addressTF,birthPlaceTF,aadharNumberTF,panNumTF;
    JMenuItem open;
	JMenu file;
    JMenuBar mb;
    JButton sbmt,rst,back;

    public Domicile_Certificate() {
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

        home = new JLabel("Domicile Certificate");
        home.setVisible(true);
        home.setBounds(50, 50, 500, 35);
        Font font3 = new Font("Arial Black", Font.BOLD, 40);
        home.setFont(font3);
        P2.add(home);


        JLabel title = new JLabel ("Enter Details");
        Font font11 = new Font("Arial Black", Font.BOLD, 25);
        title.setFont(font11);
		title.setBounds(250, 10, 300, 35);
		
		JLabel name = new JLabel(" Full Name ");
        Font font10 = new Font("Arial Black", Font.BOLD, 20);
        name.setFont(font10);
		name.setBounds(20, 50, 250, 25);
		
		
		JLabel address = new JLabel(" Address ");
        Font font12 = new Font("Arial Black", Font.BOLD, 20);
        address.setFont(font12);
		address.setBounds(20, 100, 250, 25);
		
		JLabel birthPlace = new JLabel(" Place of Birth");
        Font font13 = new Font("Arial Black", Font.BOLD, 20);
        birthPlace.setFont(font13);
		birthPlace.setBounds(20, 150, 250, 25);
		
		JLabel aadharNumber = new JLabel(" Aadhar Number");
        Font font14 = new Font("Arial Black", Font.BOLD, 20);
        aadharNumber.setFont(font14);
		aadharNumber.setBounds(20,200,250,25);
		
		JLabel panNum = new JLabel(" PAN Number");
        Font font15 = new Font("Arial Black", Font.BOLD, 20);
        panNum.setFont(font15);
		panNum.setBounds(20,250,250,25);
		
		
		JLabel heading = new JLabel("Upload Docs:-");
        Font font16 = new Font("Arial Black", Font.BOLD, 20);
        heading.setFont(font16);
		heading.setBounds(20, 300, 250, 25);
		
		
		
		nameTF = new JTextField();
		nameTF.setBounds(250, 50, 200, 25);
		
		addressTF = new JTextField();
		addressTF.setBounds(250,100,200,25);
		
		birthPlaceTF = new JTextField();
		birthPlaceTF.setBounds(250,150,200,25);
		
		aadharNumberTF = new JTextField();
		aadharNumberTF.setBounds(250,200,200,25);
		
		panNumTF = new JTextField();
		panNumTF.setBounds(250,250,200,25);
		
		
		
		
		sbmt = new JButton ("Submit");
		sbmt.setBounds(90, 450, 150, 40);
        sbmt.addActionListener(this);
		
		rst = new JButton ("Reset");
		rst.setBounds(390, 450, 150, 40);
		rst.addActionListener(this);
		
		back = new JButton ("Back");
		back.setBounds(240, 500, 150, 40);
        back.addActionListener(this);
		
		
		open=new JMenuItem("Open File");  // file chooser
		           
		file=new JMenu("1. Birth Certificate");
		
		file.add(open);             
		mb=new JMenuBar();    
		mb.setBounds(250, 300, 250, 25);    
		mb.add(file);
		P3.add(mb);
		
		
		P3.add(title);
		P3.add(name);
		P3.add(address);
		P3.add(birthPlace);
		P3.add(aadharNumber);
		P3.add(panNum);
		
		P3.add(nameTF);
		P3.add(addressTF);
		P3.add(birthPlaceTF);
		P3.add(aadharNumberTF);
		P3.add(panNumTF);
		P3.add(sbmt);
		P3.add(rst);
		P3.add(heading);
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

                String name = nameTF.getText();
                String address = addressTF.getText();
                String birthP = birthPlaceTF.getText();
                String aadharN = aadharNumberTF.getText();
                String panN = panNumTF.getText();
                

                Conn c = new Conn();

                String query = "insert into `domicile_certificate` values('" + name + "','" + address + "','" + birthP + "','"
                        + aadharN + "','" + panN + "');";

                c.s.executeUpdate(query);

                System.out.println("Successfully Insert");

                JOptionPane.showMessageDialog(null, "Applied Succesfully!!");
                EndScreen d = new EndScreen();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose(); 
            }else if (e.getSource()==rst) {
                nameTF.setText(null);
				 addressTF.setText(null);
				 birthPlaceTF.setText(null);
				 aadharNumberTF.setText(null);
				 panNumTF.setText(null);
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
        new Domicile_Certificate();
    }

}

