package certificateApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.*;

public class choice implements ActionListener 
{
	JFrame f2;
    public choice() 
    {
        f2 = new JFrame();


        JButton reg = new JButton("Registration");
        reg.setBounds(180, 60, 180, 30);
        reg.addActionListener(this);

        JButton login = new JButton("Login");
        login.setBounds(180, 90, 180, 30);
        login.addActionListener(this);

        f2.add(reg);
        f2.add(login);
        f2.setTitle("Choice");
        f2.setSize(600,600);
        f2.setLayout(null);
        f2.setVisible(true);


        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.getContentPane().setBackground(Color.PINK);
    }



public static void main (String []args) 
{
    choice c = new choice();
}



@Override
public void actionPerformed(ActionEvent e) {
    String command = e.getActionCommand();
     if(command.equals("Registration"))
     {
        Registration regist = new Registration();
        f2.setVisible(false);
     }
     else if(command.equals("Login")) {
         customerLogin custLogin = new customerLogin();
         f2.setVisible(false);
     }
}


}