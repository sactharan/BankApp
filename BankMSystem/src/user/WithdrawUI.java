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

public class WithdrawUI extends JInternalFrame {
	private JTextField txtaccid;
	private JTextField txtcusid;
	private JTextField txtcusname;
	private JTextField txtacctype;
	private JTextField txtbal;
	private JTextField txtwithamt;
	private AccountDB acDB;
	private JTextField txtcusaddress;
	private JTextField txtcusphone;
	private JTextField txtbranch;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WithdrawUI frame = new WithdrawUI();
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
		txtwithamt.setText("");
		txtbal.setText("");
		txtacctype.setText("");
	}

	/**
	 * Create the frame.
	 */
	public WithdrawUI() {
		getContentPane().setBackground(new Color(224, 255, 255));
		
		acDB=new AccountDB();
		
		setBounds(100, 100, 780, 729);
		getContentPane().setLayout(null);
		
		JLabel lblManageDeposits = new JLabel("Manage Withdraw");
		lblManageDeposits.setFont(new Font("Verdana", Font.BOLD, 30));
		lblManageDeposits.setBounds(196, 0, 367, 48);
		getContentPane().add(lblManageDeposits);
		
		JButton btnFindAccountNumber = new JButton("Find Account Number");
		btnFindAccountNumber.setBackground(new Color(255, 228, 181));
		btnFindAccountNumber.addActionListener(new ActionListener() {
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
					txtacctype.setText(String.valueOf(a.getAccountType()));
					txtbal.setText(String.valueOf(a.getBalance()));
				}else {
					JOptionPane.showMessageDialog(getContentPane(), "The Account number is not available");
				}
			}
		});
		btnFindAccountNumber.setVerticalAlignment(SwingConstants.BOTTOM);
		btnFindAccountNumber.setFont(new Font("Yu Gothic Medium", Font.BOLD, 17));
		btnFindAccountNumber.setBounds(37, 111, 286, 59);
		getContentPane().add(btnFindAccountNumber);
		
		JLabel lblAccountNumber = new JLabel("Account Number");
		lblAccountNumber.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblAccountNumber.setBounds(37, 202, 126, 31);
		getContentPane().add(lblAccountNumber);
		
		txtaccid = new JTextField();
		txtaccid.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtaccid.setColumns(10);
		txtaccid.setBounds(256, 202, 171, 31);
		getContentPane().add(txtaccid);
		
		JLabel lblCustomerId = new JLabel("Customer ID");
		lblCustomerId.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCustomerId.setBounds(37, 254, 126, 31);
		getContentPane().add(lblCustomerId);
		
		txtcusid = new JTextField();
		txtcusid.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtcusid.setColumns(10);
		txtcusid.setBounds(256, 254, 171, 31);
		getContentPane().add(txtcusid);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCustomerName.setBounds(37, 308, 126, 31);
		getContentPane().add(lblCustomerName);
		
		txtcusname = new JTextField();
		txtcusname.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtcusname.setColumns(10);
		txtcusname.setBounds(256, 308, 171, 31);
		getContentPane().add(txtcusname);
		
		JLabel lblCashierName_1_1_1_1_2 = new JLabel("Account Type");
		lblCashierName_1_1_1_1_2.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCashierName_1_1_1_1_2.setBounds(37, 487, 126, 31);
		getContentPane().add(lblCashierName_1_1_1_1_2);
		
		txtacctype = new JTextField();
		txtacctype.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtacctype.setColumns(10);
		txtacctype.setBounds(256, 487, 171, 31);
		getContentPane().add(txtacctype);
		
		JLabel lblCashierName_1_1_1_1 = new JLabel("Balance");
		lblCashierName_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCashierName_1_1_1_1.setBounds(37, 540, 126, 31);
		getContentPane().add(lblCashierName_1_1_1_1);
		
		txtbal = new JTextField();
		txtbal.setBackground(new Color(64, 224, 208));
		txtbal.setFont(new Font("Verdana", Font.BOLD, 17));
		txtbal.setColumns(10);
		txtbal.setBounds(256, 540, 171, 31);
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
		btnNewButton_3.setBounds(274, 614, 129, 48);
		getContentPane().add(btnNewButton_3);
		
		JLabel lblCashierName_1_1_1_1_1_1 = new JLabel("Withdraw Amount");
		lblCashierName_1_1_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCashierName_1_1_1_1_1_1.setBounds(560, 139, 154, 31);
		getContentPane().add(lblCashierName_1_1_1_1_1_1);
		
		txtwithamt = new JTextField();
		txtwithamt.setBackground(new Color(255, 160, 122));
		txtwithamt.setFont(new Font("Verdana", Font.BOLD, 17));
		txtwithamt.setColumns(10);
		txtwithamt.setBounds(543, 202, 171, 31);
		getContentPane().add(txtwithamt);
		
		JButton btnNewButton = new JButton("Withdraw");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    if(checkValidation()) {
					
					Double withdraw= Double.valueOf(txtwithamt.getText());
					Double balance= Double.valueOf(txtbal.getText());
					
					Double Withdraw=balance-withdraw;
					
					int accountID=Integer.valueOf(txtaccid.getText());	
					String customerID=txtcusid.getText();
				    String customerName=txtcusname.getText();
					String customerAddress=txtcusaddress.getText();
					String customerPhone=txtcusphone.getText();
					String branch=txtbranch.getText();
					String accountType=txtacctype.getText();
					

					Account a=new Account(accountID, customerID, customerName,customerAddress,customerPhone,branch, accountType,Withdraw);
					boolean updated=acDB.update(a);
					if(updated) {					
						JOptionPane.showMessageDialog(getContentPane(), "Withdraw is created");
					}else {
						JOptionPane.showMessageDialog(getContentPane(), "Withdraw is not created");
					}
				}
			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setFont(new Font("Yu Gothic Medium", Font.BOLD, 16));
		btnNewButton.setBounds(575, 283, 129, 42);
		getContentPane().add(btnNewButton);
		
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
		
		JLabel lblCustomerAddress = new JLabel("Customer Address");
		lblCustomerAddress.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCustomerAddress.setBounds(37, 356, 171, 31);
		getContentPane().add(lblCustomerAddress);
		
		txtcusaddress = new JTextField();
		txtcusaddress.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtcusaddress.setColumns(10);
		txtcusaddress.setBounds(256, 356, 171, 31);
		getContentPane().add(txtcusaddress);
		
		JLabel lblCustomerName_1_1 = new JLabel("Customer Phone");
		lblCustomerName_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCustomerName_1_1.setBounds(37, 408, 126, 31);
		getContentPane().add(lblCustomerName_1_1);
		
		txtcusphone = new JTextField();
		txtcusphone.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtcusphone.setColumns(10);
		txtcusphone.setBounds(256, 408, 171, 31);
		getContentPane().add(txtcusphone);
		
		JLabel lblCustomerName_1_1_1 = new JLabel("Branch");
		lblCustomerName_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCustomerName_1_1_1.setBounds(37, 450, 126, 31);
		getContentPane().add(lblCustomerName_1_1_1);
		
		txtbranch = new JTextField();
		txtbranch.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtbranch.setColumns(10);
		txtbranch.setBounds(256, 450, 171, 31);
		getContentPane().add(txtbranch);

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
		
		if(txtbranch.getText().equals("")) {
			JOptionPane.showMessageDialog(getContentPane(), "Branch name cannot be blank");
			return false;
		}
		
		if(txtbal.getText().equals("")) {
			JOptionPane.showMessageDialog(getContentPane(), "Balance cannot be blank");
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

		if(txtwithamt.getText().equals("")) {
			JOptionPane.showMessageDialog(getContentPane(), "Deposit Amount cannot be blank");
			return false;
		}
		return true;
	}

}
