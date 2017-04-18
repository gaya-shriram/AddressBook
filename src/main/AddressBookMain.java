package main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JLabel;

public class AddressBookMain {

	private JFrame frame;
	private JTextField headerTitle;
	private JButton btnDisplay;
	private JPanel buttonPanel;
	private JButton btnNew;
	private JButton btnRemove;
	private JPanel addPanel;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblLastname;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JTextField textField_2;
	private JLabel lblCity;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblState;
	private JLabel lblZip;
	private JTextField textField_5;
	private JLabel lblPhone;
	private JTextField textField_6;
	private JLabel lblEmail;
	private JTextField textField_7;
	private JTable table;
	private JTable displayTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddressBookMain window = new AddressBookMain();
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
	public AddressBookMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		headerTitle = new JTextField();
		headerTitle.setEditable(false);
		headerTitle.setHorizontalAlignment(SwingConstants.CENTER);
		headerTitle.setFont(new Font("Garamond", Font.BOLD, 18));
		headerTitle.setBackground(new Color(240, 255, 255));
		headerTitle.setText("Your Address Book");
		frame.getContentPane().add(headerTitle, BorderLayout.NORTH);
		headerTitle.setColumns(10);
		
		buttonPanel = new JPanel();
		frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnDisplay = new JButton("DISPLAY");
		buttonPanel.add(btnDisplay);
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				addPanel.setVisible(false);
				String cols[] = new String[] {"First Name", "Last Name", "Street", "City", "State", "Zip", "Phone", "Email"};
				AddressBook ab = new AddressBook();
				ab.loadingFromFile("data.txt");
				List<AddressEntry> entries = ab.list();
				TableModel model = new DefaultTableModel(cols, entries.size());
				int row = 0;
				for (AddressEntry entry : entries) {
					model.setValueAt(entry.getFirstName(), row, 0);
					model.setValueAt(entry.getLastName(), row, 1);
					model.setValueAt(entry.getStreet(), row, 2);
					model.setValueAt(entry.getCity(), row, 3);
					model.setValueAt(entry.getState(), row, 4);
					model.setValueAt(Integer.toString(entry.getZip()), row, 5);
					model.setValueAt(entry.getPhone(), row, 6);
					model.setValueAt(entry.getEmail(), row, 7);
					row++;
				}
				displayTable.setModel(model);
				displayTable.setVisible(true);
			}
		});
		btnDisplay.setBackground(new Color(220, 20, 60));
		btnDisplay.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		
		btnNew = new JButton("NEW");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ent) {
				displayTable.setVisible(false);
				addPanel.setVisible(true);
			}
		});
		btnNew.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		buttonPanel.add(btnNew);
		
		btnRemove = new JButton("REMOVE");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addPanel.setVisible(false);
				displayTable.setVisible(true);
			}
		});
		btnRemove.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		buttonPanel.add(btnRemove);
		
		addPanel = new JPanel();
		frame.getContentPane().add(addPanel, BorderLayout.CENTER);
		
		lblNewLabel = new JLabel("FirstName");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		addPanel.add(lblNewLabel);
		
		textField = new JTextField();
		addPanel.add(textField);
		textField.setColumns(10);
		
		lblLastname = new JLabel("LastName");
		addPanel.add(lblLastname);
		
		textField_1 = new JTextField();
		addPanel.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Street");
		addPanel.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		addPanel.add(textField_2);
		textField_2.setColumns(10);
		
		lblCity = new JLabel("City");
		addPanel.add(lblCity);
		
		textField_3 = new JTextField();
		addPanel.add(textField_3);
		textField_3.setColumns(10);
		
		lblState = new JLabel("State");
		addPanel.add(lblState);
		
		textField_4 = new JTextField();
		addPanel.add(textField_4);
		textField_4.setColumns(2);
		
		lblZip = new JLabel("Zip");
		addPanel.add(lblZip);
		
		textField_5 = new JTextField();
		addPanel.add(textField_5);
		textField_5.setColumns(3);
		
		lblPhone = new JLabel("Phone");
		addPanel.add(lblPhone);
		
		textField_6 = new JTextField();
		addPanel.add(textField_6);
		textField_6.setColumns(8);
		
		lblEmail = new JLabel("Email");
		lblEmail.setVerticalAlignment(SwingConstants.TOP);
		addPanel.add(lblEmail);
		
		textField_7 = new JTextField();
		addPanel.add(textField_7);
		textField_7.setColumns(10);
		
		table = new JTable();
		addPanel.add(table);
		
		displayTable = new JTable();
		frame.getContentPane().add(displayTable, BorderLayout.WEST);
	}

}
