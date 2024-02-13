package certificateApp;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EndScreen implements ActionListener  
{
	JFrame f12;
    EndScreen()
    {
        f12 = new JFrame();

        JLabel ackn = new JLabel("Your Applicatrion is being processed. You will be notified through SMS.");
        ackn.setBounds(100, 200, 400, 30);

        JButton click = new JButton("Click to Continue");
        click.setBounds(220, 250, 150, 30);
        click.addActionListener(this);

        f12.add(ackn);
        f12.add(click);

        f12.setSize(600,600);
        f12.setLayout(null);
        f12.setVisible(true);
        f12.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f12.getContentPane().setBackground(Color.PINK);
    }



    public static void main (String [] args) 
    {
         EndScreen y = new EndScreen() ;





    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
         if(command.equals("Click to Continue"))
         {
             applicationForms end = new applicationForms();
             f12.setVisible(false);
         }



    }
}