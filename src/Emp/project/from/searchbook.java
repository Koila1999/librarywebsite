package Emp.project.from;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class searchbook extends JFrame implements ActionListener{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private Choice cecategory;
	private JLabel lblNewLabel,lbltitle, lblAuthor, lblPublisher,lblYearPublish;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchbook window = new searchbook();
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
	public searchbook() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(150, 30, 450, 300);
		frame.setSize(900,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 lblNewLabel = new JLabel("Search by Author");
		lblNewLabel.setBounds(10, 11, 200, 30);
		frame.getContentPane().add(lblNewLabel);
		
		cecategory=new Choice();
		cecategory.setBounds(160,11,200,30);
		frame.getContentPane().add(cecategory);
		try{
			DB conn=new DB();
			
					ResultSet rs=conn.s.executeQuery("select *from book ");
					
					while(rs.next()) {
						
						cecategory.add( rs.getString("Author"));
						
						
						
					}
				//table.setModel(DbUtils.resultSetToTableModel(rs));
		}
					catch(Exception e) {
						e.printStackTrace();
					}
		
		
		
		JLabel labeltitle=new JLabel("Book title");
		labeltitle.setBounds(10,90,150,30);
		//labeltitle.setFont(new Font("SERIF",Font.PLAIN,20));
		frame.add(labeltitle);
		
		 lbltitle= new JLabel();

		 lbltitle.setBounds(160,90,150,30);
		frame.add(lbltitle);
			
		
		JLabel labelAuthor=new JLabel("BookAuthor");
		labeltitle.setBounds(10,180,150,30);
		//Component labelAuthor;
		//labeltitle.setFont(new Font("SERIF",Font.PLAIN,20));
		frame.add(labelAuthor);
		
		  lblAuthor = new JLabel();

		 lblAuthor.setBounds(160,180,150,30);
		 frame.add(lblAuthor);
			
		
		JLabel labelPublisher=new JLabel("BookPublisher");
		labelPublisher.setBounds(10,270,150,30);
		//Component labePublisher;
		//labeltitle.setFont(new Font("SERIF",Font.PLAIN,20));
		frame.add(labelPublisher);
		
		  lblPublisher = new JLabel();

		 lblPublisher.setBounds(160,270,50,30);
		 frame.add(lblPublisher);
		
			JLabel labelYearPublish=new JLabel("YearPublish");
			labelYearPublish.setBounds(10,360,150,30);
			
			//labeltitle.setFont(new Font("SERIF",Font.PLAIN,20));
			frame.add(labelYearPublish);
			
			  lblYearPublish = new JLabel();

			 lblYearPublish.setBounds(160,360,150,30);
			 frame.add(lblYearPublish);{
				
			}
			
		
		
		 
		
//		textField = new JTextField();
//		textField.setBounds(92, 8, 86, 20);
//		frame.getContentPane().add(textField);
//		textField.setColumns(10);
//		
//		JLabel lblNewLabel_1 = new JLabel(" Title");
//		lblNewLabel_1.setBounds(202, 11, 46, 14);
//		frame.getContentPane().add(lblNewLabel_1);
//		
//		textField_1 = new JTextField();
//		textField_1.setBounds(258, 8, 86, 20);
//		frame.getContentPane().add(textField_1);
//		textField_1.setColumns(10);
//		
//		JLabel lblNewLabel_2 = new JLabel(" Keyword");
//		lblNewLabel_2.setBounds(102, 39, 65, 14);
//		frame.getContentPane().add(lblNewLabel_2);
//		
//		textField_2 = new JTextField();
//		textField_2.setBounds(177, 36, 96, 20);
//		frame.getContentPane().add(textField_2);
//		textField_2.setColumns(10);
//		
//		JButton btnNewButton = new JButton("Search");
//		btnNewButton.setBounds(309, 39, 89, 23);
//		frame.getContentPane().add(btnNewButton);
		
		try{
			DB conn=new DB();
			
					ResultSet rs=conn.s.executeQuery("select *from book where Author ='"+ cecategory.getSelectedItem()+"' ");
					
					while(rs.next()) {
						
					lbltitle.setText(rs.getString("Booktitle"));
					lblAuthor.setText(rs.getString("Author"));
					lblPublisher.setText(rs.getString("Publisher"));
					lblYearPublish.setText(rs.getString("yearPublish"));
				//	lbl.setText(rs.getString("address"));
					//lblphone.setText(rs.getString("phone"));
					//lblemail.setText(rs.getString("email"));
					//lbleducation.setText(rs.getString("education"));
					//lbldesignation.setText(rs.getString("designation"));
					//lbldhar.setText(rs.getString("aadhar"));
					//lblblood.setText(rs.getString("bloodgroup"));
					//lblGender.setText(rs.getString("gender"));


						
						
						
					}
					//table.setModel(DbUtils.resultSetToTableModel(rs));
		}
					catch(Exception e) {
						e.printStackTrace();
					}

		cecategory.addItemListener(new ItemListener(){
		        	@Override
		        	public void itemStateChanged(ItemEvent ie) {
		        		try{
		        			DB conn=new DB();
		        			
		        					ResultSet rs=conn.s.executeQuery("select *from book where Author ='"+ cecategory.getSelectedItem()+"' ");
		        					
		        					while(rs.next()) {
		        						lbltitle.setText(rs.getString("Booktitle"));
		        						lblAuthor.setText(rs.getString("Author"));
		        						lblPublisher.setText(rs.getString("Publisher"));
		        						lblYearPublish.setText(rs.getString("yearPublish"));
		        						
		        					


		        						
		        						
		        						
		        					}
		        					//table.setModel(DbUtils.resultSetToTableModel(rs));
		        		}
		        					catch(Exception e) {
		        						e.printStackTrace();
		        					}
		        		
		        	}});}
		
//		table = new JTable();
//		table.setSurrendersFocusOnKeystroke(true);
//		table.setModel(new DefaultTableModel(
//			new Object[][] {
//				{null, null, null, ""},
//				{null, null, null, ""},
//				{null, null, null, null},
//			},
//			new String[] {
//				"Bookid", "Title", "Keyword"
//			}
//		));
//		table.setBounds(36, 171, 371, -71);
//		frame.getContentPane().add(table);
//	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
