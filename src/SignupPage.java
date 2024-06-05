import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SignupPage implements ActionListener {

    JLabel userName, Name, Password, SEQ_Question, Answer,Phone;
    JTextField userNamTextField, NameTextField, AnswerTextField,PhoneTextField;
    JPasswordField passwordTextField;
    JComboBox SQ;
    JButton Create, Back;

    public SignupPage() {

        JFrame f = new JFrame();
        f.setVisible(true);
        f.setBounds(100, 50, 600, 600);
        f.setTitle("Sign UP Page");

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

        Name = new JLabel("Name  ");
        Name.setVisible(true);
        Name.setBounds(50, 120, 150, 20);
        Font font3 = new Font("Arial", Font.BOLD, 20);
        Name.setFont(font3);
        c.add(Name);

        NameTextField = new JTextField();
        NameTextField.setVisible(true);
        NameTextField.setBounds(220, 120, 200, 25);
        Font font4 = new Font("Arial", Font.BOLD, 20);
        NameTextField.setFont(font4);
        c.add(NameTextField);

        Password = new JLabel("Password  ");
        Password.setVisible(true);
        Password.setBounds(50, 190, 150, 20);
        Font font5 = new Font("Arial", Font.BOLD, 20);
        Password.setFont(font5);
        c.add(Password);

        passwordTextField = new JPasswordField();
        passwordTextField.setVisible(true);
        passwordTextField.setBounds(220, 190, 200, 25);
        Font font6 = new Font("Arial", Font.BOLD, 20);
        passwordTextField.setFont(font6);
        c.add(passwordTextField);

        SEQ_Question = new JLabel("SEQ.Question  ");
        SEQ_Question.setVisible(true);
        SEQ_Question.setBounds(50, 260, 150, 20);
        Font font7 = new Font("Arial", Font.BOLD, 20);
        SEQ_Question.setFont(font7);
        c.add(SEQ_Question);

        String Valuse[] = { "What is Your Favourite Sport", "What is your Middle Name", "What is your Last Name" };

        SQ = new JComboBox<>(Valuse);
        SQ.setVisible(true);
        SQ.setBounds(220, 260, 200, 25);
        c.add(SQ);

        Answer = new JLabel("Answer  ");
        Answer.setVisible(true);
        Answer.setBounds(50, 330, 150, 20);
        Font font8 = new Font("Arial", Font.BOLD, 20);
        Answer.setFont(font8);
        c.add(Answer);

        AnswerTextField = new JTextField();
        AnswerTextField.setVisible(true);
        AnswerTextField.setBounds(220, 330, 200, 25);
        Font font9 = new Font("Arial", Font.BOLD, 20);
        AnswerTextField.setFont(font9);
        c.add(AnswerTextField);

        Phone = new JLabel("Phone No.  ");
        Phone.setVisible(true);
        Phone.setBounds(50, 400, 150, 20);
        Font font10 = new Font("Arial", Font.BOLD, 20);
        Phone.setFont(font10);
        c.add(Phone);

        PhoneTextField = new JTextField();
        PhoneTextField.setVisible(true);
        PhoneTextField.setBounds(220, 400, 200, 25);
        Font font11 = new Font("Arial", Font.BOLD, 20);
        PhoneTextField.setFont(font11);
        c.add(PhoneTextField);

        Create = new JButton("Create");
        Create.setVisible(true);
        Create.setBounds(110, 490, 120, 40);
        Create.addActionListener(this);
    
        c.add(Create);

        Back = new JButton("Back");
        Back.setVisible(true);
        Back.setBounds(370, 490, 120, 40);
        Back.addActionListener(this);

        c.add(Back);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       try {

        if (e.getSource()== Create) {

            String UserName = userNamTextField.getText();
            String Name = NameTextField.getText();
            String Password = passwordTextField.getText();
            String SEQ_Question = (String) SQ.getSelectedItem();
            String Answer = AnswerTextField.getText();
            String Phone = PhoneTextField.getText();

            Conn c = new Conn();

            String query = "insert into `login` values('" + UserName + "','" + Name + "','" + Password + "','"
                        + SEQ_Question + "','" + Answer + "','"+Phone+"');";
            c.s.executeUpdate(query);

            System.out.println("Successfully Insert");

            // JOptionPane.showMessageDialog(null, "Created Succesfull");
            // LoginPage l = new LoginPage();

            JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
            currentFrame.dispose(); 
        }else if (e.getSource()==Back) {
            LoginPage l = new LoginPage();
            

            JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
            currentFrame.dispose(); 
        }
       
       } catch (Exception e1) {
       System.out.println(e1);
       JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
        currentFrame.dispose();
       }
    }

    public static void main(String[] args) {
        new SignupPage();

    }

   

}
