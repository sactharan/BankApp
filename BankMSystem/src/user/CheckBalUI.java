package user;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import business.Account;
import data.AccountDB;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CheckBalUI extends JInternalFrame {
	private JTextField txtaccid;
	private JTextField txtcusid;
	private JTextField txtcusname;
	private JTextField txtacctype;
	private JTextField txtbal;
	 private AccountDB acDB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBalUI frame = new CheckBalUI();
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
		txtbal.setText("");
		txtacctype.setText("");
	}

	/**
	 * Create the frame.
	 */
	public CheckBalUI() {
		getContentPane().setBackground(new Color(216, 191, 216));
		
		acDB=new AccountDB();
		
		setBounds(100, 100, 780, 609);
		getContentPane().setLayout(null);
		
		JLabel lblManageDeposits = new JLabel("Check Account Balances");
		lblManageDeposits.setFont(new Font("Verdana", Font.BOLD, 30));
		lblManageDeposits.setBounds(151, 0, 464, 48);
		getContentPane().add(lblManageDeposits);
		
		JButton btnFindAccountNumber = new JButton("Enter Account Number to Check Balance");
		btnFindAccountNumber.setBackground(new Color(255, 255, 0));
		btnFindAccountNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int accountID=Integer.valueOf(JOptionPane.showInputDialog(getContentPane(), "Enter the Account Number "));
				Account a=acDB.get(accountID);
				if(a!=null) {
					txtaccid.setText(String.valueOf(a.getAccountID()));
					txtcusid.setText(String.valueOf(a.getCustomerID()));
					txtcusname.setText(String.valueOf(a.getCustomerName()));
					txtacctype.setText(String.valueOf(a.getAccountType()));
					txtbal.setText(String.valueOf(a.getBalance()));
				}else {
					JOptionPane.showMessageDialog(getContentPane(), "Invalid Account Number");
				}
			}
		});
		btnFindAccountNumber.setVerticalAlignment(SwingConstants.BOTTOM);
		btnFindAccountNumber.setFont(new Font("Yu Gothic Medium", Font.BOLD, 17));
		btnFindAccountNumber.setBounds(32, 77, 385, 48);
		getContentPane().add(btnFindAccountNumber);
		
		JLabel lblAccountNumber = new JLabel("Account Number");
		lblAccountNumber.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblAccountNumber.setBounds(184, 148, 126, 31);
		getContentPane().add(lblAccountNumber);
		
		txtaccid = new JTextField();
		txtaccid.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtaccid.setColumns(10);
		txtaccid.setBounds(403, 148, 171, 31);
		getContentPane().add(txtaccid);
		
		JLabel lblCustomerId = new JLabel("Customer ID");
		lblCustomerId.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCustomerId.setBounds(184, 200, 126, 31);
		getContentPane().add(lblCustomerId);
		
		txtcusid = new JTextField();
		txtcusid.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtcusid.setColumns(10);
		txtcusid.setBounds(403, 200, 171, 31);
		getContentPane().add(txtcusid);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCustomerName.setBounds(184, 254, 126, 31);
		getContentPane().add(lblCustomerName);
		
		txtcusname = new JTextField();
		txtcusname.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtcusname.setColumns(10);
		txtcusname.setBounds(403, 254, 171, 31);
		getContentPane().add(txtcusname);
		
		JLabel lblCashierName_1_1_1_1_2 = new JLabel("Account Type");
		lblCashierName_1_1_1_1_2.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCashierName_1_1_1_1_2.setBounds(184, 311, 126, 31);
		getContentPane().add(lblCashierName_1_1_1_1_2);
		
		txtacctype = new JTextField();
		txtacctype.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtacctype.setColumns(10);
		txtacctype.setBounds(403, 311, 171, 31);
		getContentPane().add(txtacctype);
		
		JLabel lblCashierName_1_1_1_1 = new JLabel("Balance");
		lblCashierName_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCashierName_1_1_1_1.setBounds(184, 364, 126, 31);
		getContentPane().add(lblCashierName_1_1_1_1);
		
		txtbal = new JTextField();
		txtbal.setBackground(new Color(255, 215, 0));
		txtbal.setFont(new Font("Verdana", Font.BOLD, 17));
		txtbal.setColumns(10);
		txtbal.setBounds(403, 364, 171, 31);
		getContentPane().add(txtbal);
		
		JButton btnNewButton_3 = new JButton("Clear");
		btnNewButton_3.setBackground(new Color(255, 248, 220));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearFields();
			}
		});
		btnNewButton_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_3.setFont(new Font("Yu Gothic Medium", Font.BOLD, 17));
		btnNewButton_3.setBounds(415, 438, 129, 48);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("Close");
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_1.setFont(new Font("Yu Gothic Medium", Font.BOLD, 17));
		btnNewButton_1_1.setBounds(671, 0, 93, 48);
		getContentPane().add(btnNewButton_1_1);

	}
	
	private boolean checkValidation() {
		if(txtaccid.getText().equals("")) {
			JOptionPane.showMessageDialog(getContentPane(), "Account Number cannot be blank");
			return false;
		}
		
		try {
			int accountID=Integer.valueOf(txtaccid.getText());
		}catch(Exception e) {
			JOptionPane.showMessageDialog(getContentPane(), "Account Number must be numeric");
			return false;
		}
		if(txtcusid.getText().equals("")) {
			JOptionPane.showMessageDialog(getContentPane(), "Customer ID cannot be blank");
			return false;
		}
		

		if(txtcusname.getText().equals("")) {
			JOptionPane.showMessageDialog(getContentPane(), "Customer Name cannot be blank");
			return false;
		}
		
		if(txtbal.getText().equals("")) {
			JOptionPane.showMessageDialog(getContentPane(), "Balance cannot be blank");
			return false;
		}
		
	
		return true;
	}

}
