package certificateApp;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class welcomePage implements ActionListener 
{
	JFrame f0;JLabel logo;
    public welcomePage() 
    {
        f0 = new JFrame();
        
        // logo = new JLabel("");
        // Image img = new ImageIcon(this.getClass().getResource("/CertificateHubLogo1.png")).getImage();
        // logo.setIcon(new ImageIcon(img));
        // logo.setBounds(180, 100, 400, 130);

        JLabel welC = new JLabel("Welcome");
        welC.setBounds(250, 200, 400, 30);

        JButton clk = new JButton ("Click to Continue");
        clk.setBounds(200, 250, 150, 30);
        clk.addActionListener(this);


        f0.add(clk);
        f0.add(welC);
        // f0.add(logo);
        f0.setSize(600,600);
        f0.setLayout(null);
        f0.setVisible(true);
        f0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f0.getContentPane().setBackground(Color.PINK);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String command = e.getActionCommand();
         if(command.equals("Click to Continue"))
         {
             choice chs = new choice();
             f0.setVisible(false);
         }

    }
    public static void main (String [] args) 
    {
         welcomePage y = new welcomePage();
    }

}