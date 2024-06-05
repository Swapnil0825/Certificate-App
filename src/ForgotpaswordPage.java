import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class ForgotpaswordPage implements ActionListener {

    JLabel userName, Name, SEQ_Question, Answer, Password;
    JTextField userNamTextField, NameTextField, SEQ_QuestionTextField, AnswerTextField, PasswordTextField;
    JButton Search, Retrive, Back;

    public ForgotpaswordPage() {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setBounds(100, 50, 700, 500);
        f.setTitle("Forgot Password Page");

        Container c = f.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        userName = new JLabel("UserName  ");
        userName.setVisible(true);
        userName.setBounds(50, 50, 150, 20);
        Font font1 = new Font("Arial", Font.BOLD, 20);
        userName.setFont(font1);
        c.add(userName);

        userNamTextField = new JTextField();
        userNamTextField.setVisible(true);
        userNamTextField.setBounds(220, 50, 200, 25);
        Font font2 = new Font("Arial", Font.BOLD, 20);
        userNamTextField.setFont(font2);
        c.add(userNamTextField);

        Search = new JButton("Search");
        Search.setVisible(true);
        Search.setBounds(450, 50, 120, 25);
        Search.addActionListener(this);

        c.add(Search);

        Name = new JLabel("Name  ");
        Name.setVisible(true);
        Name.setBounds(50, 100, 150, 20);
        Font font3 = new Font("Arial", Font.BOLD, 20);
        Name.setFont(font3);
        c.add(Name);

        NameTextField = new JTextField();
        NameTextField.setVisible(true);
        NameTextField.setBounds(220, 100, 200, 25);
        Font font4 = new Font("Arial", Font.BOLD, 15);
        NameTextField.setFont(font4);
        c.add(NameTextField);

        SEQ_Question = new JLabel("Your SEQ.Question  ");
        SEQ_Question.setVisible(true);
        SEQ_Question.setBounds(50, 150, 150, 20);
        Font font5 = new Font("Arial", Font.BOLD, 20);
        SEQ_Question.setFont(font5);
        c.add(SEQ_Question);

        SEQ_QuestionTextField = new JTextField();
        SEQ_QuestionTextField.setVisible(true);
        SEQ_QuestionTextField.setBounds(220, 150, 200, 25);
        Font font6 = new Font("Arial", Font.BOLD, 13);
        SEQ_QuestionTextField.setFont(font6);
        c.add(SEQ_QuestionTextField);

        Answer = new JLabel("Answer ");
        Answer.setVisible(true);
        Answer.setBounds(50, 200, 150, 20);
        Font font7 = new Font("Arial", Font.BOLD, 20);
        Answer.setFont(font7);
        c.add(Answer);

        AnswerTextField = new JTextField();
        AnswerTextField.setVisible(true);
        AnswerTextField.setBounds(220, 200, 200, 25);
        Font font8 = new Font("Arial", Font.BOLD, 20);
        AnswerTextField.setFont(font8);
        c.add(AnswerTextField);

        Retrive = new JButton("Retrive");
        Retrive.setVisible(true);
        Retrive.setBounds(450, 200, 120, 25);
        Retrive.addActionListener(this);
 
        c.add(Retrive);

        Password = new JLabel("Password ");
        Password.setVisible(true);
        Password.setBounds(50, 250, 150, 20);
        Font font9 = new Font("Arial", Font.BOLD, 20);
        Password.setFont(font9);
        c.add(Password);

        PasswordTextField = new JTextField();
        PasswordTextField.setVisible(true);
        PasswordTextField.setBounds(220, 250, 200, 25);
        Font font10 = new Font("Arial", Font.BOLD, 20);
        PasswordTextField.setFont(font10);
        c.add(PasswordTextField);

        Back = new JButton("Back");
        Back.setVisible(true);
        Back.setBounds(200, 300, 120, 40);
        Back.addActionListener(this);

        c.add(Back);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == Search) {

                String enteredUsername = userNamTextField.getText();
                Conn c = new Conn();
                String query = "Select * from login where userName='" + enteredUsername + "'";
                ResultSet rs = c.s.executeQuery(query);

                if (rs.next()) {
                    String name = rs.getString("Name");
                    String seqQuestion = rs.getString("SEQ_Question");

                    NameTextField.setText(name);
                    SEQ_QuestionTextField.setText(seqQuestion);
                } else {
                    JOptionPane.showMessageDialog(null, "Username not found", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            if (e.getSource() == Retrive) {
                String ans = AnswerTextField.getText();

                Conn c = new Conn();
                String query = "Select * from login where Answer='" + ans + "' ";
                ResultSet rs = c.s.executeQuery(query);

                if (rs.next()) {
                    String password = rs.getString("Password");

                    PasswordTextField.setText(password);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Answer", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }

            if (e.getSource() == Back) {
                LoginPage l = new LoginPage();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();
            }


        } catch (Exception e1) {
            System.out.println(e1);
        }
    }
 

    public static void main(String[] args) {
        new ForgotpaswordPage();
    }


}
