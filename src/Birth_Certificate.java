import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;

import javax.swing.*;

public class Birth_Certificate implements ActionListener {
    JPanel P1, P2, P3;
    JLabel logo, Name, quots, logo1, logo2, logo3, logo4, logo5, logo6, logo7;
    JLabel Registration, fullname, Time, Date, Place, FatherName, MotherName, HospitalName, BloodGroup, Nationality;
    JButton Birth, Cast, Domicile, Aadhar, Income, Logout;
    JLabel home;
    JTextField fullnameTF, TimeTF, DateTF, PlaceTF, FatherNameTF, MotherNameTF, HospitalNameTF, BloodGroupTF,
            NationalityTF;
    JButton sbmt, rst, back;

    public Birth_Certificate() {
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

        home = new JLabel("Birth Certificate");
        home.setVisible(true);
        home.setBounds(50, 50, 500, 35);
        Font font3 = new Font("Arial Black", Font.BOLD, 40);
        home.setFont(font3);
        P2.add(home);

        Registration = new JLabel("Enter Details ");
        Font font19 = new Font("Arial Black", Font.BOLD, 25);
        Registration.setFont(font19);
        Registration.setBounds(250, 10, 300, 35);

        fullname = new JLabel("Full Name");
        Font font18 = new Font("Arial Black", Font.BOLD, 20);
        fullname.setFont(font18);
        fullname.setBounds(20, 50, 250, 25);

        Time = new JLabel("Time");
        Font font17 = new Font("Arial Black", Font.BOLD, 20);
        Time.setFont(font17);
        Time.setBounds(20, 100, 250, 25);

        Date = new JLabel("Date");
        Font font16 = new Font("Arial Black", Font.BOLD, 20);
        Date.setFont(font16);
        Date.setBounds(20, 150, 250, 25);

        Place = new JLabel("Place");
        Font font15 = new Font("Arial Black", Font.BOLD, 20);
        Place.setFont(font15);
        Place.setBounds(20, 200, 250, 25);

        FatherName = new JLabel("Father's Name");
        Font font14 = new Font("Arial Black", Font.BOLD, 20);
        FatherName.setFont(font14);
        FatherName.setBounds(20, 250, 250, 25);

        MotherName = new JLabel("Mother's Name");
        Font font13 = new Font("Arial Black", Font.BOLD, 20);
        MotherName.setFont(font13);
        MotherName.setBounds(20, 300, 250, 25);

        HospitalName = new JLabel("Hospital Name");
        Font font12 = new Font("Arial Black", Font.BOLD, 20);
        HospitalName.setFont(font12);
        HospitalName.setBounds(20, 350, 250, 25);

        BloodGroup = new JLabel("Blood Group");
        Font font11 = new Font("Arial Black", Font.BOLD, 20);
        BloodGroup.setFont(font11);
        BloodGroup.setBounds(20, 400, 250, 25);

        Nationality = new JLabel("Nationality");
        Font font10 = new Font("Arial Black", Font.BOLD, 20);
        Nationality.setFont(font10);
        Nationality.setBounds(20, 450, 250, 25);

        fullnameTF = new JTextField();
        fullnameTF.setBounds(250, 50, 200, 25);

        TimeTF = new JTextField();
        TimeTF.setBounds(250, 100, 200, 25);

        DateTF = new JTextField();
        DateTF.setBounds(250, 150, 200, 25);

        PlaceTF = new JTextField();
        PlaceTF.setBounds(250, 200, 200, 25);

        FatherNameTF = new JTextField();
        FatherNameTF.setBounds(250, 250, 200, 25);

        MotherNameTF = new JTextField();
        MotherNameTF.setBounds(250, 300, 200, 25);

        HospitalNameTF = new JTextField();
        HospitalNameTF.setBounds(250, 350, 200, 25);

        BloodGroupTF = new JTextField();
        BloodGroupTF.setBounds(250, 400, 200, 25);

        NationalityTF = new JTextField();
        NationalityTF.setBounds(250, 450, 200, 25);

        sbmt = new JButton("Submit");
        sbmt.setBounds(40, 500, 150, 40);
        sbmt.addActionListener(this);

        rst = new JButton("Reset");
        rst.setBounds(290, 500, 150, 40);
        rst.addActionListener(this);

        back = new JButton("Back");
        back.setBounds(540, 500, 150, 40);
        back.addActionListener(this);

        P3.add(Registration);
        P3.add(fullname);
        P3.add(Time);
        P3.add(Date);
        P3.add(Place);
        P3.add(FatherName);
        P3.add(MotherName);
        P3.add(HospitalName);
        P3.add(BloodGroup);
        P3.add(Nationality);
        P3.add(fullnameTF);
        P3.add(TimeTF);
        P3.add(DateTF);
        P3.add(PlaceTF);
        P3.add(FatherNameTF);
        P3.add(MotherNameTF);
        P3.add(HospitalNameTF);
        P3.add(BloodGroupTF);
        P3.add(NationalityTF);
        P3.add(back);

        P3.add(sbmt);
        P3.add(rst);

        P3.setLayout(null);
        P3.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == Birth) {
                Birth_Certificate B = new Birth_Certificate();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();
            } else if (e.getSource() == Cast) {
                Cast_Certificate B = new Cast_Certificate();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();
            } else if (e.getSource() == Domicile) {
                Domicile_Certificate B = new Domicile_Certificate();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();
            } else if (e.getSource() == Aadhar) {
                Aadhar_Card B = new Aadhar_Card();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();
            } else if (e.getSource() == Income) {
                Income_Certificate B = new Income_Certificate();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();
            } else if (e.getSource() == Logout) {
                LoginPage B = new LoginPage();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();
            } else if (e.getSource() == sbmt) {

                String name = fullnameTF.getText();
                String TOB = TimeTF.getText();
                String DOB = DateTF.getText();
                String place = PlaceTF.getText();
                String Fname = FatherNameTF.getText();
                String Mname = MotherNameTF.getText();
                String hospital = HospitalNameTF.getText();
                String blood = BloodGroupTF.getText();
                String nationality = NationalityTF.getText();

                Conn c = new Conn();

                String query = "insert into `birth_certificate` values('" + name + "','" + TOB + "','" + DOB + "','"
                        + place + "','" + Fname + "','" + Mname + "','" + hospital + "','" + blood + "','" + nationality
                        + "');";
                c.s.executeUpdate(query);

                System.out.println("Successfully Insert");
                JOptionPane.showMessageDialog(null, "Applied Succesfully!!");
                EndScreen d = new EndScreen();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose(); 

            } else if (e.getSource() == rst) {
                fullnameTF.setText(null);
                TimeTF.setText(null);
                DateTF.setText(null);
                PlaceTF.setText(null);
                FatherNameTF.setText(null);
                MotherNameTF.setText(null);
                HospitalNameTF.setText(null);
                BloodGroupTF.setText(null);
                NationalityTF.setText(null);
            } else if (e.getSource() == back) {
                DashBoard d = new DashBoard();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();
            }

        } catch (Exception e1) {
            System.out.println(e1);
        }
    }

    public static void main(String[] args) {
        new Birth_Certificate();
    }

}
