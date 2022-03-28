package user;

import java.awt.EventQueue;



import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import business.Account;

import data.AccountDB;


import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CashierMenuAccountUI extends JInternalFrame {
	private JTextField txtaccid;
	private JTextField txtbal;
	private AccountDB acDB;
	private JTextField txtcusaddress;
	private JTextField txtcusphone;
	private JTextField txtcusid;
	private JTextField txtcusname;
	private JTextField txtbranch;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashierMenuAccountUI frame = new CashierMenuAccountUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void clearFields() {
		txtaccid.setText("");
		txtcusid.setText("");
		txtcusname.setText("");
		txtcusaddress.setText("");
		txtcusphone.setText("");
		txtbranch.setText("");
		txtbal.setText("");
	}

	/**
	 * Create the frame.
	 */
	public CashierMenuAccountUI() {
		getContentPane().setBackground(new Color(176, 196, 222));
		
		acDB=new AccountDB();
	
		
		setBounds(100, 100, 916, 721);
		getContentPane().setLayout(null);
		
		JLabel lblManageCustomers = new JLabel("Manage Accounts");
		lblManageCustomers.setFont(new Font("Verdana", Font.BOLD, 30));
		lblManageCustomers.setBounds(272, 22, 367, 48);
		getContentPane().add(lblManageCustomers);
		
		JLabel lblAccountNumber = new JLabel("Account Number");
		lblAccountNumber.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblAccountNumber.setBounds(10, 118, 126, 31);
		getContentPane().add(lblAccountNumber);
		
		txtaccid = new JTextField();
		txtaccid.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtaccid.setColumns(10);
		txtaccid.setBounds(185, 118, 171, 31);
		getContentPane().add(txtaccid);
		
		JLabel lblCustomerId = new JLabel("Customer ID");
		lblCustomerId.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCustomerId.setBounds(10, 168, 126, 31);
		getContentPane().add(lblCustomerId);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCustomerName.setBounds(10, 210, 126, 31);
		getContentPane().add(lblCustomerName);
		
		JLabel lblAccountType = new JLabel("Account Type");
		lblAccountType.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblAccountType.setBounds(425, 162, 126, 31);
		getContentPane().add(lblAccountType);
		
		JComboBox cmbacctype = new JComboBox();
		cmbacctype.setModel(new DefaultComboBoxModel(new String[] {"Savings", "FixedDeposit", "CurrentAC", "Kids", "18+"}));
		cmbacctype.setBounds(600, 164, 171, 22);
		getContentPane().add(cmbacctype);
		
		JLabel lblOpeningBalance = new JLabel("Opening Balance");
		lblOpeningBalance.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblOpeningBalance.setBounds(425, 210, 126, 31);
		getContentPane().add(lblOpeningBalance);
		
		txtbal = new JTextField();
		txtbal.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtbal.setColumns(10);
		txtbal.setBounds(600, 210, 171, 31);
		getContentPane().add(txtbal);
		
		JButton btnNewButton_3 = new JButton("Clear");
		btnNewButton_3.setBackground(new Color(204, 204, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearFields();
			}
		});
		btnNewButton_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_3.setFont(new Font("Yu Gothic Medium", Font.BOLD, 17));
		btnNewButton_3.setBounds(624, 268, 129, 48);
		getContentPane().add(btnNewButton_3);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBackground(new Color(204, 204, 255));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int accountID=Integer.valueOf(JOptionPane.showInputDialog(getContentPane(), "Enter the Account Number"));
				Account a=acDB.get(accountID);
				if(a!=null) {
					txtaccid.setText(String.valueOf(a.getAccountID()));
					txtcusid.setText(String.valueOf(a.getCustomerID()));
					txtcusname.setText(String.valueOf(a.getCustomerName()));
					txtcusaddress.setText(String.valueOf(a.getCustomerAddress()));
					txtcusphone.setText(String.valueOf(a.getCustomerPhone()));
					txtbranch.setText(String.valueOf(a.getBranch()));
					cmbacctype.setSelectedItem(a.getAccountType());
					txtbal.setText(String.valueOf(a.getBalance()));
				}else {
					JOptionPane.showMessageDialog(getContentPane(), "The Account number is not available");
				}
			}
		});
		btnSearch.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSearch.setFont(new Font("Yu Gothic Medium", Font.BOLD, 17));
		btnSearch.setBounds(10, 354, 129, 49);
		getContentPane().add(btnSearch);
		
		JTable tblAccount = new JTable();
		tblAccount .setBounds(80, 530, 453, 159);
		tblAccount .setEnabled(true);
		DefaultTableModel tblModel=new DefaultTableModel();
		tblAccount .setModel(tblModel);
		
		txtbranch = new JTextField();
		txtbranch.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtbranch.setColumns(10);
		txtbranch.setBounds(600, 118, 171, 31);
		getContentPane().add(txtbranch);
		
		txtcusname = new JTextField();
		txtcusname.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtcusname.setColumns(10);
		txtcusname.setBounds(185, 214, 171, 31);
		getContentPane().add(txtcusname);
		
		txtcusaddress = new JTextField();
		txtcusaddress.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtcusaddress.setColumns(10);
		txtcusaddress.setBounds(185, 256, 171, 31);
		getContentPane().add(txtcusaddress);
		
		txtcusphone = new JTextField();
		txtcusphone.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtcusphone.setColumns(10);
		txtcusphone.setBounds(185, 298, 171, 31);
		getContentPane().add(txtcusphone);
		
		txtcusid = new JTextField();
		txtcusid.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtcusid.setColumns(10);
		txtcusid.setBounds(185, 168, 171, 31);
		getContentPane().add(txtcusid);
		
		tblModel.addColumn("Account Number");
		tblModel.addColumn("Customer ID");
		tblModel.addColumn("Customer Name");
		tblModel.addColumn("Customer Address");
		tblModel.addColumn("Customer Phone");
		tblModel.addColumn("Branch");
		tblModel.addColumn("Account Type");
		tblModel.addColumn("Opening Balance");

		JScrollPane scrollPane = new JScrollPane();		
		scrollPane.setBounds(10, 414, 790, 254);
		scrollPane.setViewportView(tblAccount );
		getContentPane().add(scrollPane);
		
		
		JButton btnGetall = new JButton("GetAll");
		btnGetall.setBackground(new Color(204, 204, 255));
		btnGetall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Account> aList=acDB.getAll();
				tblModel.setRowCount(0);
				for(Account a:aList) {
					int accountID=a.getAccountID();
					String customerID=a.getCustomerID();
					String customerName=a.getCustomerName();
					String customerAddress=a.getCustomerAddress();
					String customerPhone=a.getCustomerPhone();
					String branch=a.getBranch();
					String accountType=a.getAccountType();
					Double balance=a.getBalance();
					tblModel.addRow(new Object[] {accountID,customerID,customerName,customerAddress,customerPhone,branch,accountType,balance});
				}
			}
		});
		btnGetall.setVerticalAlignment(SwingConstants.BOTTOM);
		btnGetall.setFont(new Font("Yu Gothic Medium", Font.BOLD, 17));
		btnGetall.setBounds(217, 354, 129, 49);
		getContentPane().add(btnGetall);
		
		
		
		JButton btnNewButton_1_1 = new JButton("Close");
		btnNewButton_1_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_1.setFont(new Font("Yu Gothic Medium", Font.BOLD, 17));
		btnNewButton_1_1.setBounds(807, 0, 93, 48);
		getContentPane().add(btnNewButton_1_1);
		
		JLabel lblCustomerName_1 = new JLabel("Customer Name");
		lblCustomerName_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCustomerName_1.setBounds(48, -73, 126, 31);
		getContentPane().add(lblCustomerName_1);
		
	
		JLabel lblCashierName_1_1_1 = new JLabel("Customer Address");
		lblCashierName_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCashierName_1_1_1.setBounds(10, 256, 171, 31);
		getContentPane().add(lblCashierName_1_1_1);
		
		JLabel lblCashierPhonenumber = new JLabel("Customer PhoneNumber");
		lblCashierPhonenumber.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCashierPhonenumber.setBounds(10, 298, 188, 31);
		getContentPane().add(lblCashierPhonenumber);
		
		
		
		
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblBranch.setBounds(425, 118, 188, 31);
		getContentPane().add(lblBranch);
		
		

	}
private boolean checkValidation() {
	
	if(txtaccid.getText().equals("")) {
		JOptionPane.showMessageDialog(getContentPane(), "Account Number cannot be blank");
		return false;
	}
	
	try {
		int accID=Integer.valueOf(txtaccid.getText());
	}catch(Exception e) {
		JOptionPane.showMessageDialog(getContentPane(), "Account Number must be numeric");
		return false;
	}

	if(txtcusid.getText().equals("")) {
		JOptionPane.showMessageDialog(getContentPane(), "Customer ID cannot be blank");
		return false;
	}
	
	
	if(txtcusname.getText().equals("")) {
		JOptionPane.showMessageDialog(getContentPane(), "Name cannot be blank");
		return false;
	}
	
	if(txtcusaddress.getText().equals("")) {
		JOptionPane.showMessageDialog(getContentPane(), "Address cannot be blank");
		return false;
	}
	
	if(txtcusphone.getText().equals("")) {
		JOptionPane.showMessageDialog(getContentPane(), "Phone Number cannot be blank");
		return false;
	}
	
	if(txtbal.getText().equals("")) {
		JOptionPane.showMessageDialog(getContentPane(), "Balance cannot be blank");
		return false;
	}
	
	if(txtbranch.getText().equals("")) {
		JOptionPane.showMessageDialog(getContentPane(), "Branch name cannot be blank");
		return false;
	}
	return true;
}
}
