package certificateApp;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class applicationForms implements ActionListener
{
	JFrame f6;
	applicationForms()
	{
		f6 = new JFrame();
		
		JLabel application_forms = new JLabel("Application forms ");
		application_forms.setBounds(110, 20, 120, 20);
		
		JButton BirthC = new JButton("Birth Certificate");
		BirthC.setBounds(80, 70, 150, 20);
		BirthC.addActionListener(this);
		
		JButton CasteC = new JButton("Caste Certificate");
		CasteC.setBounds(80, 100, 150, 20);
		CasteC.addActionListener(this);
		
		JButton DomicileC = new JButton("Domicile Certificate");
		DomicileC.setBounds(80, 130, 150, 20);
		DomicileC.addActionListener(this);
		
		JButton AadharC = new JButton("Aadhar Card");
		AadharC.setBounds(80, 160, 150, 20);
		AadharC.addActionListener(this);
		
		JButton IncomeC = new JButton("Income Certificate");
		IncomeC.setBounds(80, 190, 150, 20);
		IncomeC.addActionListener(this);
		
		f6.add(application_forms);
		f6.add(BirthC);
		f6.add(CasteC);
		f6.add(DomicileC);
		f6.add(AadharC);
		f6.add(IncomeC);
		f6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f6.getContentPane().setBackground(Color.PINK);
		f6.setSize(600,600);
		f6.setLayout(null);
		f6.setVisible(true);
	}
	public static void main (String []args) 
	{
		applicationForms s = new applicationForms();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		 if(command.equals("Birth Certificate"))
		 {
			 BirthCertificate birthcert = new BirthCertificate();
			 f6.setVisible(false);
		 }
		 else if(command.equals("Caste Certificate"))
		 {
			castCertificate castcert = new castCertificate();
			f6.setVisible(false);
		 }
		 else if(command.equals("Domicile Certificate"))
		 {
			 domicilecertificate domicilecert = new domicilecertificate();
			 f6.setVisible(false);
		 }
		 else if(command.equals("Aadhar Card"))
		 {
			 aadharCard aadharcert = new aadharCard();
			 f6.setVisible(false);
		 }
		 else if(command.equals("Income Certificate"))
		 {
			 IncomeCertificate Incomecert = new IncomeCertificate();
			 f6.setVisible(false);
		 }
		 
		
	}
}