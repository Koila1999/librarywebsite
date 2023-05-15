package Emp.project.from;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;

public class bookmaster extends JFrame implements ActionListener {
	
	Random ran=new Random();
	int number=ran.nextInt(9999999);

	private JFrame frame;
	JLabel lblid;
	
	JTextField tfbooktitle,tfauthor,tfpublisher,tfyearpublish;
	JComboBox cbcategory;
	JButton save,Back;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
				try {
					bookmaster window = new bookmaster();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		//});
	//}

	/**
	 * Create the application.
	 */
	public bookmaster() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Book id");
		lblNewLabel.setBounds(0, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblid = new JLabel(""+ number);
		lblid.setBounds(104, 8, 103, 20);
		frame.getContentPane().add(lblid);
		
		
		JLabel lblNewLabel_1 = new JLabel("Book title");
		lblNewLabel_1.setBounds(0, 36, 59, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfbooktitle = new JTextField();
		tfbooktitle.setBounds(104, 39, 209, 20);
		frame.getContentPane().add(tfbooktitle);
		tfbooktitle.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("  Author");
		lblNewLabel_2.setBounds(0, 70, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tfauthor = new JTextField();
		tfauthor.setBounds(104, 70, 209, 20);
		frame.getContentPane().add(tfauthor);
		tfauthor.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Publisher");
		lblNewLabel_3.setBounds(0, 104, 59, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tfpublisher = new JTextField();
		tfpublisher.setBounds(104, 101, 116, 20);
		frame.getContentPane().add(tfpublisher);
		tfpublisher.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("  Year Publish");
		lblNewLabel_4.setBounds(0, 139, 71, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tfyearpublish = new JTextField();
		tfyearpublish.setBounds(104, 132, 86, 20);
		frame.getContentPane().add(tfyearpublish);
		tfyearpublish.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Category");
		lblNewLabel_5.setBounds(0, 164, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		 cbcategory = new JComboBox();
		cbcategory.setModel(new DefaultComboBoxModel(new String[] {"programming", "html", "se", "java"}));
		cbcategory.setBounds(114, 163, 30, 22);
		frame.getContentPane().add(cbcategory);
		
//		JButton btnNewButton = new JButton("first");
//		btnNewButton.setBounds(0, 198, 80, 23);
//		frame.getContentPane().add(btnNewButton);
//		
//		JButton btnNewButton_1 = new JButton("prev");
//		btnNewButton_1.setBounds(87, 198, 71, 23);
//		frame.getContentPane().add(btnNewButton_1);
//		
//		JButton btnNewButton_2 = new JButton("next");
//		btnNewButton_2.setBounds(163, 198, 59, 23);
//		frame.getContentPane().add(btnNewButton_2);
//		
//		JButton btnNewButton_3 = new JButton("Lst");
//		btnNewButton_3.setBounds(232, 198, 46, 23);
//		frame.getContentPane().add(btnNewButton_3);
		
		 save = new JButton("save");
		save.setBounds(50, 227, 80, 23);
		frame.getContentPane().add(save);
		save.addActionListener(this);

		 Back = new JButton("Back");
		 Back.setBounds(200, 227, 80, 23);
		frame.getContentPane().add( Back);
		Back.addActionListener(this);
		
//		JButton btnNewButton_5 = new JButton("Edit");
//		btnNewButton_5.setBounds(87, 232, 71, 23);
//		frame.getContentPane().add(btnNewButton_5);
//		
//		JButton btnNewButton_6 = new JButton("save");
//		btnNewButton_6.setBounds(163, 227, 64, 23);
//		frame.getContentPane().add(btnNewButton_6);
		
		//JButton Back = new JButton("Back");
//		btnNewButton_7.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			System.exit(0);
//			}
//		});
//		btnNewButton_7.setBounds(242, 227, 89, 23);
//		frame.getContentPane().add(btnNewButton_7);
//		
//		JLabel lblNewLabel_6 = new JLabel("Search keyword");
//		lblNewLabel_6.setBounds(179, 164, 86, 14);
//		frame.getContentPane().add(lblNewLabel_6);
//		
//		textField_5 = new JTextField();
//		textField_5.setBounds(278, 161, 103, 20);
//		frame.getContentPane().add(textField_5);
//		textField_5.setColumns(10);
//		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==save) {
			
			String bookid=lblid.getText();
			String Booktitle=tfbooktitle.getText();
			String Author=tfauthor.getText();
			String publisher=tfpublisher.getText();
			String yearpublish=tfyearpublish.getText();
			String category=(String)cbcategory.getSelectedItem();
			try {
				DB conn=new DB();
				String query="insert into book values ('"+ bookid +"','"+ Booktitle +"','"+Author  +"','"+ publisher +"','"+ yearpublish +"','"+ category+"' )";
				conn.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null," Book Saved Successfully" );
				setVisible(false);
			}
			catch(Exception e) {
				e.printStackTrace();
			}




			
			
		}
		else {
			setVisible(false);
			new Homepage();
			
			
		}
		
		
	}
}
