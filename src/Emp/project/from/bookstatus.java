package Emp.project.from;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.xdevapi.Statement;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.net.ConnectException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class bookstatus {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookstatus window = new bookstatus();
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
	public bookstatus() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 595, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnshow = new JButton("Display");
		btnshow.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				 try {
					DB conn= new DB();
					 String query="select*from Book";
					//s=conn.createStatement();
					 ResultSet rs= conn.s.executeQuery(query);
//					JTable tbData 
					java.sql.ResultSetMetaData rsmd=rs.getMetaData();
					DefaultTableModel model= (DefaultTableModel) table.getModel(); 
					int cols=rsmd.getColumnCount();
					String[] colName=new String [cols];
					for(int i=0;i<cols;i++) {
						colName[i] = rsmd.getColumnName(i+1) ;
					model.setColumnIdentifiers(colName);
					String bookid,title, Author, Publisher, yearpublish,category;
				while(rs.next())
				{
						bookid=rs.getString(1);
						title=rs.getString(2);
						    Author=   rs.getString(3);
						Publisher=rs.getString(4);
					yearpublish=rs.getString(5);
					category=rs.getString(6);
					String[]row= {bookid,title,Author,Publisher,yearpublish,category};
					model.addRow(row);
					}
			 }}
			
				catch(Exception e1) {
					e1.printStackTrace();
				}
			
		}});
		btnshow.setBounds(109, 352, 105, 23);
		frame.getContentPane().add(btnshow);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(232, 272, 262, -212);
		frame.getContentPane().add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 91, 559, 206);
		frame.getContentPane().add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
	}
}
