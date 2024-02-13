package certificateApp;
import javax.swing.*;
import java.awt.Event;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Emplogin {
    JTextField UserIDTF;JPasswordField passwordTF;JFrame f5;
    public Emplogin() {
        f5 = new JFrame();

        JLabel employee = new JLabel("Employee Login"); 
        employee.setBounds(20, 30, 90, 20);
        JLabel UserID = new JLabel("UserID ");
        UserID.setBounds(20, 60, 80, 20);

        JLabel password = new JLabel("Password ");
        password.setBounds(20, 90, 80, 20);



        UserIDTF = new JTextField();
        UserIDTF.setBounds(120, 60, 100, 20);

         passwordTF = new JPasswordField();
        passwordTF.setBounds(120,90,100,20);

        JButton sbmt = new JButton("Submit");
        sbmt.setBounds(20, 160, 100, 30);

        JButton rst = new JButton("Reset");
        rst.setBounds(150, 160, 100, 30);


        f5.add(employee);
        f5.add(UserID);
        f5.add(password);
        f5.add(UserIDTF);
        f5.add(passwordTF);
        f5.add(sbmt);
        f5.add(rst);

        f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f5.getContentPane().setBackground(Color.PINK);
        f5.setSize(300,300);
        f5.setLayout(null);
        f5.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
     {

         String command = e.getActionCommand();
         if(command.equals("Submit"))
         {

         }
         else if (command.equals("Reset")) {
             UserIDTF.setText(null);
             passwordTF.setText(null);
         }

     }
    public static void main (String []args) {
        Emplogin e = new Emplogin();
    }



    }