package user;

import java.awt.BorderLayout;





import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

import data.CashierLoginDB;

import business.CashierLogin;

import javax.swing.UIManager;
import java.awt.Color;

public class CashierLoginUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserID;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashierLoginUI frame = new CashierLoginUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CashierLoginUI() {
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 464);
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ToolTip.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User ID");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 16));
		lblNewLabel.setBounds(61, 129, 121, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("Georgia", Font.BOLD, 16));
		lblPassword.setBounds(61, 196, 121, 23);
		contentPane.add(lblPassword);
		
		txtUserID = new JTextField();
		txtUserID.setFont(new Font("Georgia", Font.BOLD, 16));
		txtUserID.setBounds(214, 132, 154, 33);
		contentPane.add(txtUserID);
		txtUserID.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Georgia", Font.BOLD, 16));
		txtPassword.setBounds(214, 199, 154, 33);
		contentPane.add(txtPassword);
		
		JButton btnOK = new JButton("OK");
		btnOK.setForeground(new Color(0, 0, 128));
		btnOK.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnOK.setBackground(new Color(255, 255, 255));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userID=txtUserID.getText();
				String password=txtPassword.getText();
				
				CashierLoginDB logDB=new CashierLoginDB();
				CashierLogin log=logDB.get(userID);			
				
			   if(userID.equals(log.getUserID()) && password.equals(log.getPassword())) {
				   LoginInfo.userID=userID;
				   CashierMenuUI mUI=new CashierMenuUI();
				   mUI.setVisible(true);
				   setVisible(false);
			   }else {
				   JOptionPane.showMessageDialog(contentPane, "Incorrect Cashier UserID or Password");
			   }
				
			}
		});
		btnOK.setBounds(177, 301, 96, 38);
		contentPane.add(btnOK);
		
		JButton btnCancel = new JButton("CLEAR");
		btnCancel.setForeground(new Color(0, 0, 128));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCancel.setBackground(new Color(255, 255, 255));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUserID.setText("");
				txtPassword.setText("");
			}
		});
		btnCancel.setBounds(307, 301, 121, 38);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel_1 = new JLabel("Cashier Login");
		lblNewLabel_1.setForeground(new Color(220, 20, 60));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(140, 34, 215, 33);
		contentPane.add(lblNewLabel_1);
		
		JButton btnOK_1 = new JButton("BACK");
		btnOK_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginMenuUI frame = new LoginMenuUI();
				frame.setVisible(true);
				dispose();
			}
		});
		btnOK_1.setBackground(new Color(255, 250, 240));
		btnOK_1.setBounds(413, 0, 85, 38);
		contentPane.add(btnOK_1);
	}
}
