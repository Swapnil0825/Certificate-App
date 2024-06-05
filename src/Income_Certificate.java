import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Income_Certificate implements ActionListener{
    JPanel P1, P2, P3;
    JLabel logo, Name, quots, logo1, logo2, logo3, logo4, logo5, logo6, logo7;
    JButton Birth, Cast, Domicile, Aadhar, Income, Logout;
    JLabel home;
    JTextField nameTF,ageTF,employmentStatusTF,currentTF,annualTF,panTF;
    JButton sbmt,rst,back;

    public Income_Certificate() {
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

        home = new JLabel("Income Certificate");
        home.setVisible(true);
        home.setBounds(50, 50, 500, 35);
        Font font3 = new Font("Arial Black", Font.BOLD, 40);
        home.setFont(font3);
        P2.add(home);


        JLabel details = new JLabel("Enter Details"); 
		Font font10 = new Font("Arial Black", Font.BOLD, 25);
        details.setFont(font10);
		details.setBounds(250, 10, 300, 35);
		
		JLabel name = new JLabel("Full Name");
        Font font11 = new Font("Arial Black", Font.BOLD, 20);
        name.setFont(font11);
		name.setBounds(20, 50, 250, 25);
		
		JLabel age = new JLabel("Age ");
        Font font12 = new Font("Arial Black", Font.BOLD, 20);
        age.setFont(font12);
		age.setBounds(20, 100, 250, 25);
		
		JLabel employmentStatus = new JLabel("Employment Status");
        Font font13 = new Font("Arial Black", Font.BOLD, 20);
        employmentStatus.setFont(font13);
		employmentStatus.setBounds(20, 150, 250, 25);
		
		JLabel current = new JLabel("Current Company Name");
		Font font14 = new Font("Arial Black", Font.BOLD, 20);
        current.setFont(font14);
		current.setBounds(20, 200, 300, 25);
		
		JLabel annual = new JLabel("Annual Income");
		Font font15 = new Font("Arial Black", Font.BOLD, 20);
        annual.setFont(font15);
		annual.setBounds(20, 250, 250, 25);
		
		JLabel pan = new JLabel("Pan Card Number");
		Font font16 = new Font("Arial Black", Font.BOLD, 20);
        pan.setFont(font16);
		pan.setBounds(20, 300, 250, 25);
		

      

		nameTF = new JTextField();
		nameTF.setBounds(350, 50, 200, 25);
		
		ageTF = new JTextField();
		ageTF.setBounds(350, 100, 200, 25);
		
		employmentStatusTF = new JTextField();
		employmentStatusTF.setBounds(350, 150, 200, 25);
		
		currentTF = new JTextField();
		currentTF.setBounds(350, 200, 200, 25);
		
		annualTF = new JTextField();
		annualTF.setBounds(350, 250, 200, 25);
		
		panTF = new JTextField();
		panTF.setBounds(350, 300, 200, 25);

		
		sbmt = new JButton ("Submit");
		sbmt.setBounds(90, 350, 150, 40);
        sbmt.addActionListener(this);

		
		rst = new JButton ("Reset");
		rst.setBounds(390, 350, 150, 40);
        rst.addActionListener(this);
		
		
		back = new JButton ("Back");
		back.setBounds(240, 400, 150, 40);
        back.addActionListener(this);
	

		
		
	
		P3.add(details);
		P3.add(name);
		P3.add(age);
		P3.add(employmentStatus);
		P3.add(current);
		P3.add(annual);
		P3.add(pan);
		P3.add(nameTF);     
		P3.add(ageTF);
		P3.add(employmentStatusTF);
		P3.add(currentTF);
		P3.add(annualTF);
		P3.add(panTF);
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

                String name = nameTF.getText();
                String age = ageTF.getText();
                String employment = employmentStatusTF.getText();
                String cJob = currentTF.getText();
                String annual = annualTF.getText();
                String pan = panTF.getText();

                Conn c = new Conn();

                String query = "insert into `income_certificate` values('" + name + "','" + age + "','" + employment + "','"
                        + cJob + "','" + annual + "','"+pan+"');";
                c.s.executeUpdate(query);

                System.out.println("Successfully Insert");

                JOptionPane.showMessageDialog(null, "Applied Succesfully!!");
                EndScreen d = new EndScreen();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose(); 
            }else if (e.getSource()==rst) {
                nameTF.setText(null);
                ageTF.setText(null);
                currentTF.setText(null);
                annualTF.setText(null);
                panTF.setText(null);
                employmentStatusTF.setText(null);
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
        new Income_Certificate();
    }

}

