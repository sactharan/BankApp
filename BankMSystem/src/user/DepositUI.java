package user;

import java.awt.EventQueue;


import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import business.Account;
import data.AccountDB;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DepositUI extends JInternalFrame {
	private JTextField txtaccid;
	private JTextField txtcusid;
	private JTextField txtcusname;
	private JTextField txtacctype;
	private JTextField txtbal;
	private JTextField txtdepamt;
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
					DepositUI frame = new DepositUI();
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
		txtdepamt.setText("");
		txtbal.setText("");
		txtacctype.setText("");
	}

	/**
	 * Create the frame.
	 */
	public DepositUI() {
		getContentPane().setBackground(new Color(173, 216, 230));
		
		acDB=new AccountDB();
		
		setBounds(100, 100, 780, 719);
		getContentPane().setLayout(null);
		
		JLabel lblManageDeposits = new JLabel("Manage Deposits");
		lblManageDeposits.setFont(new Font("Verdana", Font.BOLD, 30));
		lblManageDeposits.setBounds(281, 0, 367, 48);
		getContentPane().add(lblManageDeposits);
		
		JLabel lblAccountNumber = new JLabel("Account Number");
		lblAccountNumber.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblAccountNumber.setBounds(10, 171, 126, 31);
		getContentPane().add(lblAccountNumber);
		
		txtaccid = new JTextField();
		txtaccid.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtaccid.setColumns(10);
		txtaccid.setBounds(229, 171, 171, 31);
		getContentPane().add(txtaccid);
		
		JLabel lblCustomerId = new JLabel("Customer ID");
		lblCustomerId.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCustomerId.setBounds(10, 223, 126, 31);
		getContentPane().add(lblCustomerId);
		
		txtcusid = new JTextField();
		txtcusid.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtcusid.setColumns(10);
		txtcusid.setBounds(229, 223, 171, 31);
		getContentPane().add(txtcusid);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCustomerName.setBounds(10, 277, 126, 31);
		getContentPane().add(lblCustomerName);
		
		txtcusname = new JTextField();
		txtcusname.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtcusname.setColumns(10);
		txtcusname.setBounds(229, 277, 171, 31);
		getContentPane().add(txtcusname);
		
		JLabel lblCashierName_1_1_1_1_2 = new JLabel("Account Type");
		lblCashierName_1_1_1_1_2.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCashierName_1_1_1_1_2.setBounds(10, 507, 126, 31);
		getContentPane().add(lblCashierName_1_1_1_1_2);
		
		txtacctype = new JTextField();
		txtacctype.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtacctype.setColumns(10);
		txtacctype.setBounds(229, 507, 171, 31);
		getContentPane().add(txtacctype);
		
		JLabel lblCashierName_1_1_1_1 = new JLabel("Balance");
		lblCashierName_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCashierName_1_1_1_1.setBounds(10, 560, 126, 31);
		getContentPane().add(lblCashierName_1_1_1_1);
		
		txtbal = new JTextField();
		txtbal.setBackground(new Color(255, 165, 0));
		txtbal.setFont(new Font("Verdana", Font.BOLD, 17));
		txtbal.setColumns(10);
		txtbal.setBounds(229, 560, 171, 31);
		getContentPane().add(txtbal);
		
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
		btnFindAccountNumber.setBounds(45, 69, 237, 48);
		getContentPane().add(btnFindAccountNumber);
		
		JButton btnNewButton_3 = new JButton("Clear");
		btnNewButton_3.setBackground(new Color(255, 248, 220));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearFields();
			}
		});
		btnNewButton_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_3.setFont(new Font("Yu Gothic Medium", Font.BOLD, 17));
		btnNewButton_3.setBounds(583, 460, 129, 48);
		getContentPane().add(btnNewButton_3);
		
		JLabel lblCashierName_1_1_1_1_1_1 = new JLabel("Deposit Amount");
		lblCashierName_1_1_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCashierName_1_1_1_1_1_1.setBounds(532, 150, 154, 31);
		getContentPane().add(lblCashierName_1_1_1_1_1_1);
		
		txtdepamt = new JTextField();
		txtdepamt.setBackground(new Color(255, 255, 0));
		txtdepamt.setFont(new Font("Verdana", Font.BOLD, 17));
		txtdepamt.setColumns(10);
		txtdepamt.setBounds(504, 202, 171, 31);
		getContentPane().add(txtdepamt);
		
		JButton btnNewButton = new JButton("Deposit");
		btnNewButton.setForeground(new Color(147, 112, 219));
		btnNewButton.setBackground(new Color(255, 250, 250));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                   if(checkValidation()) {
					
					Double deposit= Double.valueOf(txtdepamt.getText());
					Double balance= Double.valueOf(txtbal.getText());
					
					Double Deposit=deposit+balance;
					
					int accountID=Integer.valueOf(txtaccid.getText());	
					String customerID=txtcusid.getText();
				    String customerName=txtcusname.getText();
					String customerAddress=txtcusaddress.getText();
					String customerPhone=txtcusphone.getText();
					String branch=txtbranch.getText();
					String accountType=txtacctype.getText();
					

					Account a=new Account(accountID, customerID, customerName,customerAddress,customerPhone,branch, accountType,Deposit);
					boolean updated=acDB.update(a);
					if(updated) {					
						JOptionPane.showMessageDialog(getContentPane(), "Deposit is added");
					}else {
						JOptionPane.showMessageDialog(getContentPane(), "Deposit is not added");
					}
				}
			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setFont(new Font("Yu Gothic Medium", Font.BOLD, 16));
		btnNewButton.setBounds(532, 283, 129, 40);
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
		lblCustomerAddress.setBounds(10, 333, 171, 31);
		getContentPane().add(lblCustomerAddress);
		
		txtcusaddress = new JTextField();
		txtcusaddress.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtcusaddress.setColumns(10);
		txtcusaddress.setBounds(229, 333, 171, 31);
		getContentPane().add(txtcusaddress);
		
		JLabel lblCustomerName_1_1 = new JLabel("Customer Phone");
		lblCustomerName_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCustomerName_1_1.setBounds(10, 385, 126, 31);
		getContentPane().add(lblCustomerName_1_1);
		
		txtcusphone = new JTextField();
		txtcusphone.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtcusphone.setColumns(10);
		txtcusphone.setBounds(229, 385, 171, 31);
		getContentPane().add(txtcusphone);
		
		JLabel lblCustomerName_1_1_1 = new JLabel("Branch");
		lblCustomerName_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCustomerName_1_1_1.setBounds(10, 444, 126, 31);
		getContentPane().add(lblCustomerName_1_1_1);
		
		txtbranch = new JTextField();
		txtbranch.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtbranch.setColumns(10);
		txtbranch.setBounds(229, 444, 171, 31);
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

		if(txtdepamt.getText().equals("")) {
			JOptionPane.showMessageDialog(getContentPane(), "Deposit Amount cannot be blank");
			return false;
		}
		return true;
	}
}
