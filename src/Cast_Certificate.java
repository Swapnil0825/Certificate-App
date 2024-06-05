import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Cast_Certificate implements ActionListener {
    JPanel P1, P2, P3;
    JLabel logo, Name, quots, logo1, logo2, logo3, logo4, logo5, logo6, logo7;
    JButton Birth, Cast, Domicile, Aadhar, Income, Logout;
    JLabel home;
    JTextField fullNameTF,aadharnumTF;
    JMenuItem open1,open2,open3,open4,open5;
    JMenu file1,file2,file3,file4,file5;
    JMenuBar mb1,mb2,mb3,mb4,mb5;
    JButton sbmt,rst,back;

    public Cast_Certificate() {
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

        home = new JLabel("Cast Certificate");
        home.setVisible(true);
        home.setBounds(50, 50, 500, 35);
        Font font3 = new Font("Arial Black", Font.BOLD, 40);
        home.setFont(font3);
        P2.add(home);

        

        JLabel title = new JLabel ("Enter Details");
        Font font11 = new Font("Arial Black", Font.BOLD, 25);
        title.setFont(font11);
		title.setBounds(250, 10, 300, 35);
		
		JLabel fullName = new JLabel(" Full Name ");
        Font font10 = new Font("Arial Black", Font.BOLD, 20);
        fullName.setFont(font10);
		fullName.setBounds(20, 50, 250, 25);
		
		JLabel aadharNum = new JLabel("Aadhar Number");
        Font font12 = new Font("Arial Black", Font.BOLD, 20);
        aadharNum.setFont(font12);
		aadharNum.setBounds(20, 100, 250, 25);
		
		JLabel heading = new JLabel("Upload Docs:-");
        Font font13 = new Font("Arial Black", Font.BOLD, 20);
        heading.setFont(font13);
		heading.setBounds(20, 150, 250, 25);

      
		
		fullNameTF = new JTextField();
		fullNameTF.setBounds(250, 50, 200, 25);
		
		aadharnumTF = new JTextField();
		aadharnumTF.setBounds(250, 100, 200, 25);
		
		
		sbmt = new JButton ("Submit");
		sbmt.setBounds(90, 350, 150, 40);
        sbmt.addActionListener(this);

		
		rst = new JButton ("Reset");
		rst.setBounds(390, 350, 150, 40);
        rst.addActionListener(this);
		
		
		back = new JButton ("Back");
		back.setBounds(240, 400, 150, 40);
        back.addActionListener(this);
		
		
		open1=new JMenuItem("Open File");  // birth file chooser
		      
		file1=new JMenu("1.Birth Certificate");
		
		file1.add(open1);             
		mb1=new JMenuBar();    
		mb1.setBounds(250, 150, 200, 25);    
		mb1.add(file1);
		P3.add(mb1);

		
		open2=new JMenuItem("Open File");  // income file chooser
	     
		file2=new JMenu("2.Income Certificate");
		
		file2.add(open2);             
		mb2=new JMenuBar();    
		mb2.setBounds(250, 180, 200, 25);    
		mb2.add(file2);
		P3.add(mb2);

		
		open3=new JMenuItem("Open File");  // Ration file chooser
		      
		file3=new JMenu("3.Ration Card");
		
		file3.add(open3);             
		mb3=new JMenuBar();    
		mb3.setBounds(250, 210, 200, 25);     
		mb3.add(file3);
		P3.add(mb3);

		
		open4=new JMenuItem("Open File");  // address file chooser
		     
		file4=new JMenu("4.Address Proof");
		
		file4.add(open4);             
		mb4=new JMenuBar();    
		mb4.setBounds(250, 240, 200, 25);   
		mb4.add(file4);
		P3.add(mb4);

		
		open5=new JMenuItem("Open File");  // photo file chooser
		       
		file5=new JMenu("5.Photo");
		
		file5.add(open5);             
		mb5=new JMenuBar();    
		mb5.setBounds(250, 270, 200, 25);    
		mb5.add(file5);
		P3.add(mb5);
		
		
		
		P3.add(title);
		P3.add(fullName);
		P3.add(aadharNum);
		P3.add(fullNameTF);
		P3.add(heading);
		P3.add(aadharnumTF);
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

                String name = fullNameTF.getText();
                String aadharN = aadharnumTF.getText();

                Conn c = new Conn();

                String query = "insert into `cast_certificate` values('" + name + "','" + aadharN + "');";
                c.s.executeUpdate(query);

                System.out.println("Successfully Insert");

                JOptionPane.showMessageDialog(null, "Applied Succesfully!!");
                EndScreen d = new EndScreen();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose(); 

            }else if (e.getSource()==rst) {
                aadharnumTF.setText(null);
				fullNameTF.setText(null);
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
        new Cast_Certificate();
    }

}

