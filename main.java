import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main extends JFrame
{
	private static JTextField txtInput;
	private static JLabel lblOutput;
	private static String reverse = "";
	
	public static void enter() 
	{
		//get users data
		String suser = txtInput.getText();
		
		for (int a = suser.length() - 1 ; a >= 0 ; a--)
		{
			reverse = reverse + suser.charAt(a);
		}
		
		lblOutput.setText(reverse);
		reverse = "";
	}
	
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("String reverser");
		getContentPane().setLayout(null);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the String reverser!");
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToThe.setBounds(0, 11, 434, 42);
		getContentPane().add(lblWelcomeToThe);
		
		JLabel lblInsertHereYour = new JLabel("Insert here your string:");
		lblInsertHereYour.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblInsertHereYour.setBounds(10, 64, 145, 42);
		getContentPane().add(lblInsertHereYour);
		
		JLabel lblReversedString = new JLabel("Reversed string:");
		lblReversedString.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblReversedString.setBounds(10, 148, 134, 28);
		getContentPane().add(lblReversedString);
		
		lblOutput = new JLabel("...");
		lblOutput.setBounds(154, 156, 270, 76);
		getContentPane().add(lblOutput);
		
		txtInput = new JTextField();
		txtInput.setBounds(154, 69, 270, 76);
		getContentPane().add(txtInput);
		txtInput.setColumns(10);
		
		JButton btn = new JButton("Reverse it");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				enter();
			}
		});
		btn.setBounds(10, 198, 109, 28);
		getContentPane().add(btn);
	}
	
	public static void main(String[] args) 
	{
		main theGame = new main();
		theGame.setSize(new Dimension(450, 300));
		theGame.setVisible(true);
	}
}