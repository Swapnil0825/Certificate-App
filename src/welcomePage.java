
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

        JButton clk = new JButton ("WELCOME");
        clk.setBounds(120, 150, 150, 30);
        clk.addActionListener(this);


        f0.add(clk);
        f0.setSize(400,400);
        f0.setLayout(null);
        f0.setVisible(true);
        f0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f0.getContentPane().setBackground(Color.LIGHT_GRAY);
        f0.setTitle("Welcome Page");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        try {
            LoginPage l = new LoginPage();
            f0.setVisible(false);
            
        } catch (Exception e1) {
            System.out.println(e1);
        }
        
    }
    public static void main (String [] args) 
    {
         welcomePage y = new welcomePage();
    }

}