package Emp.project.from;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class loginfrom {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JTextField user;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginfrom window = new loginfrom();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginfrom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.RED);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabl = new JLabel("         login id-");
		lblNewLabl.setBounds(10, 92, 101, 41);
		frame.getContentPane().add(lblNewLabl);
		
		lblNewLabel = new JLabel("           password-");
		lblNewLabel.setBounds(0, 136, 101, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
				
				
			}
		});
		btnNewButton_1.setBounds(72, 201, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//get text from user
				//get text from password
				String un=user.getText();
				String pas=pass.getText();
				if(un.equals ("Koila") &&pas.equals("2020")) {
					//JOptionPane.showMessageDialog(null, "Login Sucessful");
					new Homepage(); 
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid username or passwod");
				}
			}
		});
		btnNewButton.setBounds(200, 201, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		user =  new JTextField();
		user.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		user.setForeground(new Color(255, 0, 0));
		user.setBounds(132, 102, 143, 20);
		frame.getContentPane().add(user);
		user.setColumns(10);
		
		pass = new JPasswordField();
		pass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pass.setForeground(new Color(255, 0, 0));
		pass.setBounds(132, 133, 143, 20);
		frame.getContentPane().add(pass);
		
		JLabel lblNewLabel_1 = new JLabel("                                      Login From");
		lblNewLabel_1.setBounds(75, 11, 230, 41);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
