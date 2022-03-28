package user;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import business.Cashier;
import data.CashierDB;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CashierUI extends JInternalFrame {
	private JTextField txtcashid;
	private JTextField txtcashiername;
	private JTextField txtcbranch;
	private JTextField txtregdate;
	private JTextField txtcashierun;
	private JTextField txtcashierpw;
	private JTable tblCashier;
	 private CashierDB caDB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashierUI frame = new CashierUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void clearFields() {
		txtcashid.setText("");	
		txtcashiername.setText("");
		txtcashierun.setText("");
		txtcashierpw.setText("");
		txtcbranch.setText("");
		txtregdate.setText("");

	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public CashierUI() {
		getContentPane().setBackground(new Color(255, 255, 224));
		caDB=new CashierDB();
		
		setBounds(100, 100, 916, 721);
		getContentPane().setLayout(null);
		
		JLabel lblManageCashiers = new JLabel("Manage Cashiers");
		lblManageCashiers.setFont(new Font("Verdana", Font.BOLD, 30));
		lblManageCashiers.setBounds(325, 11, 298, 48);
		getContentPane().add(lblManageCashiers);
		
		JLabel lblCashierId = new JLabel("Cashier ID");
		lblCashierId.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCashierId.setBounds(10, 100, 126, 31);
		getContentPane().add(lblCashierId);
		
		txtcashid = new JTextField();
		txtcashid.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtcashid.setColumns(10);
		txtcashid.setBounds(188, 100, 171, 31);
		getContentPane().add(txtcashid);
		
		JLabel lblCashierName = new JLabel("Cashier Name");
		lblCashierName.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCashierName.setBounds(10, 154, 126, 31);
		getContentPane().add(lblCashierName);
		
		txtcashiername = new JTextField();
		txtcashiername.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtcashiername.setColumns(10);
		txtcashiername.setBounds(188, 154, 171, 31);
		getContentPane().add(txtcashiername);
		
		JLabel lblCashierName_1_1_1 = new JLabel("Cashier Branch");
		lblCashierName_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCashierName_1_1_1.setBounds(10, 209, 126, 31);
		getContentPane().add(lblCashierName_1_1_1);
		
		txtcbranch = new JTextField();
		txtcbranch.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtcbranch.setColumns(10);
		txtcbranch.setBounds(188, 209, 171, 31);
		getContentPane().add(txtcbranch);
		
		JLabel lblCashierName_1_1_1_1 = new JLabel("Cashier Reg Date");
		lblCashierName_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCashierName_1_1_1_1.setBounds(391, 100, 126, 31);
		getContentPane().add(lblCashierName_1_1_1_1);
		
		txtregdate = new JTextField();
		txtregdate.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtregdate.setColumns(10);
		txtregdate.setBounds(568, 100, 171, 31);
		getContentPane().add(txtregdate);
		
		JLabel lblCashierUserName = new JLabel("Cashier User Name");
		lblCashierUserName.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCashierUserName.setBounds(391, 209, 151, 31);
		getContentPane().add(lblCashierUserName);
		
		txtcashierun = new JTextField();
		txtcashierun.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtcashierun.setColumns(10);
		txtcashierun.setBounds(568, 209, 171, 31);
		getContentPane().add(txtcashierun);
		
		JLabel lblCashierName_1_1 = new JLabel("Cashier Password");
		lblCashierName_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCashierName_1_1.setBounds(391, 154, 126, 31);
		getContentPane().add(lblCashierName_1_1);
		
		txtcashierpw = new JTextField();
		txtcashierpw.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtcashierpw.setColumns(10);
		txtcashierpw.setBounds(568, 154, 171, 31);
		getContentPane().add(txtcashierpw);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBackground(new Color(255, 140, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkValidation()) {
					int cashierID=Integer.valueOf(txtcashid.getText());
					String cashierName=txtcashiername.getText();
					String cashierPw=txtcashierpw.getText();
					String cashierUname=txtcashierun.getText();;
					Date cashierRegdate=Date.valueOf(txtregdate.getText());
					String cashierBranch=txtcbranch.getText();
					;
					
					Cashier c=new Cashier(cashierID, cashierName, cashierPw,cashierUname,cashierRegdate,cashierBranch);
					boolean added=caDB.add(c);
					if(added) {					
						JOptionPane.showMessageDialog(getContentPane(), "Cashier is added");
					}else {
						JOptionPane.showMessageDialog(getContentPane(), "Cashier is not added");
					}
				}			
				
			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setFont(new Font("Yu Gothic Medium", Font.BOLD, 17));
		btnNewButton.setBounds(749, 109, 129, 49);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Clear");
		btnNewButton_3.setBackground(new Color(255, 140, 0));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearFields();
			}
		});
		btnNewButton_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_3.setFont(new Font("Yu Gothic Medium", Font.BOLD, 17));
		btnNewButton_3.setBounds(749, 174, 129, 48);
		getContentPane().add(btnNewButton_3);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBackground(new Color(255, 140, 0));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cashierID=Integer.valueOf(JOptionPane.showInputDialog(getContentPane(), "Enter the Cashier ID"));
				Cashier c=caDB.get(cashierID);
				if(c!=null) {
					txtcashid.setText(String.valueOf(c.getCashierID()));
					txtcashiername.setText(c.getCashierName());
					txtcashierpw.setText(c.getCashierPassword());
					txtcashierun.setText(c.getCashierUname());
					txtregdate.setText(String.valueOf(c.getCashierRegdate()));
					txtcbranch.setText(c.getCashierBranch());
				}else {
					JOptionPane.showMessageDialog(getContentPane(), "The Cashier is not available");
				}
			}
		});
		btnSearch.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSearch.setFont(new Font("Yu Gothic Medium", Font.BOLD, 17));
		btnSearch.setBounds(10, 302, 129, 49);
		getContentPane().add(btnSearch);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setBackground(new Color(255, 140, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(checkValidation()) {
					int cashierID=Integer.valueOf(txtcashid.getText());
					String cashierName=txtcashiername.getText();
					String cashierPw=txtcashierpw.getText();
					String cashierUname=txtcashierun.getText();
					Date cashierRegdate=Date.valueOf(txtregdate.getText());
					String cashierBranch=txtcbranch.getText();
					;
					
					Cashier c=new Cashier(cashierID, cashierName, cashierPw,cashierUname,cashierRegdate,cashierBranch);
					boolean updated=caDB.update(c);
					if(updated) {					
						JOptionPane.showMessageDialog(getContentPane(), "Cashier is updated");
					}else {
						JOptionPane.showMessageDialog(getContentPane(), "Cashier is not updated");
					}
				}	
			}
		});
		btnNewButton_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1.setFont(new Font("Yu Gothic Medium", Font.BOLD, 17));
		btnNewButton_1.setBounds(494, 302, 129, 49);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setBackground(new Color(255, 140, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cashierID=Integer.valueOf(JOptionPane.showInputDialog(getContentPane(), "Enter the Cashier ID"));
				boolean deleted=caDB.delete(cashierID);
				if(deleted) {
					JOptionPane.showMessageDialog(getContentPane(), "The Cashier is deleted");
				}else {
					JOptionPane.showMessageDialog(getContentPane(), "The Cashier is not deleted");
				}
			}
		});
		btnNewButton_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_2.setFont(new Font("Yu Gothic Medium", Font.BOLD, 17));
		btnNewButton_2.setBounds(325, 302, 129, 49);
		getContentPane().add(btnNewButton_2);
		
		JTable tblCashier = new JTable();
		tblCashier.setBounds(80, 530, 453, 159);
		tblCashier.setEnabled(true);
		DefaultTableModel tblModel=new DefaultTableModel();
		tblCashier.setModel(tblModel);
		
		tblModel.addColumn("Cashier ID");
		tblModel.addColumn("Cashier Name");
		tblModel.addColumn("Cashier Password");
		tblModel.addColumn("Cashier UserName");
		tblModel.addColumn("Cashier RegDate");
		tblModel.addColumn("Cashier Branch");

		JScrollPane scrollPane = new JScrollPane();		
		scrollPane.setBounds(20, 384, 790, 254);
		scrollPane.setViewportView(tblCashier);
		getContentPane().add(scrollPane);
		
		JButton btnGetall = new JButton("GetAll");
		btnGetall.setBackground(new Color(255, 140, 0));
		btnGetall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Cashier> cList=caDB.getAll();
				tblModel.setRowCount(0);
				for(Cashier c:cList) {
					int cashierID=c.getCashierID();
					String cashierName=c.getCashierName();
					String cashierPw=c.getCashierPassword();
					String cashierUname=c.getCashierUname();
					Date cashierRegdate=c.getCashierRegdate();
					String cashierBranch=c.getCashierBranch();
					tblModel.addRow(new Object[] {cashierID,cashierName,cashierPw,cashierUname,cashierRegdate,cashierBranch});
				}
			}
		});
		btnGetall.setVerticalAlignment(SwingConstants.BOTTOM);
		btnGetall.setFont(new Font("Yu Gothic Medium", Font.BOLD, 17));
		btnGetall.setBounds(159, 302, 129, 49);
		getContentPane().add(btnGetall);
		
		
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
		btnNewButton_1_1.setBounds(813, 0, 87, 48);
		getContentPane().add(btnNewButton_1_1);

	}
	private boolean checkValidation() {
		if(txtcashid.getText().equals("")) {
			JOptionPane.showMessageDialog(getContentPane(), "Cashier ID cannot be blank");
			return false;
		}
		
		try {
			int cashierID=Integer.valueOf(txtcashid.getText());
		}catch(Exception e) {
			JOptionPane.showMessageDialog(getContentPane(), "Cashier ID must be numeric");
			return false;
		}
		
		if(txtcashiername.getText().equals("")) {
			JOptionPane.showMessageDialog(getContentPane(), "Name cannot be blank");
			return false;
		}
		
		if(txtcashierun.getText().equals("")) {
			JOptionPane.showMessageDialog(getContentPane(), "Username cannot be blank");
			return false;
		}
		
		if(txtcashierpw.getText().equals("")) {
			JOptionPane.showMessageDialog(getContentPane(), "Password cannot be blank");
			return false;
		}
		
		if(txtregdate.getText().equals("")) {
			JOptionPane.showMessageDialog(getContentPane(), "Date  cannot be blank");
			return false;
		}
		
		try {
			Date cashierRegdate=Date.valueOf(txtregdate.getText());
		}catch(Exception e) {
			JOptionPane.showMessageDialog(getContentPane(), "THe  date must be in YYYY-MM-DD format");
			return false;
		}
		if(txtcbranch.getText().equals("")) {
			JOptionPane.showMessageDialog(getContentPane(), "Branch cannot be blank");
			return false;
		}
		return true;
	}
}
