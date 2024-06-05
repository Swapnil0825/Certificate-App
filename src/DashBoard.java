import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DashBoard implements ActionListener  {

    JPanel P1, P2;
    JLabel logo, Name, quots, logo1, logo2, logo3, logo4, logo5, logo6, logo7;
    JButton Birth, Cast, Domicile, Aadhar, Income, Logout;
    JLabel home;

    public DashBoard() {
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

       

        home = new JLabel("CERTIFICATE APP");
        home.setVisible(true);
        home.setBounds(50, 50, 500, 35);
        Font font3 = new Font("Arial Black", Font.BOLD, 40);
        home.setFont(font3);
        P2.add(home);

    }

    @Override
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
            }    
            
        } catch (Exception e1) {
            System.out.println(e1);
        }
    }

    public static void main(String[] args) {
        new DashBoard();
    }

  

}
