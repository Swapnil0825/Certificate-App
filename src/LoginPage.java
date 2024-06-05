import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.sql.*;

public class LoginPage implements ActionListener  {

    JLabel userName, password;
    JTextField userNamTextField;
    JPasswordField passwordTextField;
    JButton login, Signup, ForgotPassword;

    public LoginPage() {

        JFrame f = new JFrame();
        f.setVisible(true);
        f.setBounds(100, 50, 500, 500);
        f.setTitle("Login Page");

        Container c = f.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        userName = new JLabel("UserName :");
        userName.setVisible(true);
        userName.setBounds(50, 50, 150, 20);
        Font font1 = new Font("Arial", Font.BOLD, 20);
        userName.setFont(font1);
        c.add(userName);

        userNamTextField = new JTextField();
        userNamTextField.setVisible(true);
        userNamTextField.setBounds(200, 50, 200, 25);
        Font font2 = new Font("Arial", Font.BOLD, 20);
        userNamTextField.setFont(font2);
        c.add(userNamTextField);

        password = new JLabel("Password :");
        password.setVisible(true);
        password.setBounds(50, 120, 150, 20);
        Font font3 = new Font("Arial", Font.BOLD, 20);
        password.setFont(font3);
        c.add(password);

        passwordTextField = new JPasswordField();
        passwordTextField.setVisible(true);
        passwordTextField.setBounds(200, 120, 200, 25);
        Font font4 = new Font("Arial", Font.BOLD, 20);
        passwordTextField.setFont(font4);
        c.add(passwordTextField);

        login = new JButton("Login");
        login.setVisible(true);
        login.setBounds(70, 200, 120, 30);
        login.addActionListener(this);

        c.add(login);

        Signup = new JButton("SignUP");
        Signup.setVisible(true);
        Signup.setBounds(250, 200, 120, 30);
        Signup.addActionListener(this);
   
        c.add(Signup);

        ForgotPassword = new JButton("ForgotPassword");
        ForgotPassword.setVisible(true);
        ForgotPassword.setBounds(150, 250, 150, 40);
        ForgotPassword.addActionListener(this);
     
        c.add(ForgotPassword);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource()==login) {
                Conn c = new Conn();
                String query = "Select * from login where userName='" + userNamTextField.getText() + "' and Password='"+ passwordTextField.getText() + "'";
                ResultSet rs = c.s.executeQuery(query);

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Login Succesfull");
                    DashBoard d = new DashBoard();

                    JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                    currentFrame.dispose();   
                }else {
                    JOptionPane.showMessageDialog(null, "Invalid Username and Password");
                }    
            } else if (e.getSource()==Signup) {
                SignupPage S = new SignupPage();

                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();
            } else if (e.getSource()==ForgotPassword) {
                ForgotpaswordPage F = new ForgotpaswordPage();

                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();                
            }
            
        } catch (Exception e1) {
           System.out.println(e1);
        }
    }


    public static void main(String[] args) {
        new LoginPage();
    }
    
}
