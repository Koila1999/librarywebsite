package Emp.project.from;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Homepage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		new Changepassword();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage window = new Homepage();
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
	public Homepage() {
		initialize();
		frame.setVisible(true);
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setSize(1000,800);
		frame.setLocation(250,0);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Exit");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("exit");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Menu");
		menuBar.add(mnNewMenu_1);
		
		// Add Book List
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Bookmaster");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new bookmaster();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		// Issue Book in Book List
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("searchbook");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new searchbook();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("book status page");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new bookstatus();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("book return");
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new receivedbook();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_12);
		
		JMenu mnNewMenu_4 = new JMenu("Help");
		menuBar.add(mnNewMenu_4);
		
		// Add Help Page.java
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("About");
		mnNewMenu_4.add(mntmNewMenuItem_7);
		
		// Link the Member List
		
		JLabel lblNewLabel = new JLabel("                                                          Home Page");
		frame.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
	}
}
