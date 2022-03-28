package user;

import java.awt.BorderLayout;




import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.Color;

public class ManagerLoginUI extends JFrame {

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
					ManagerLoginUI frame = new ManagerLoginUI();
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
	public ManagerLoginUI() {
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 464);
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User ID");
		lblNewLabel.setFont(new Font("Graphos", Font.BOLD, 16));
		lblNewLabel.setBounds(84, 125, 121, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Graphos", Font.BOLD, 16));
		lblPassword.setBounds(84, 204, 121, 23);
		contentPane.add(lblPassword);
		
		txtUserID = new JTextField();
		txtUserID.setFont(new Font("Graphos", Font.BOLD, 16));
		txtUserID.setBounds(237, 128, 154, 32);
		contentPane.add(txtUserID);
		txtUserID.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Graphos", Font.BOLD, 16));
		txtPassword.setBounds(237, 195, 154, 32);
		contentPane.add(txtPassword);
		
		JButton btnOK = new JButton("OK");
		btnOK.setBackground(new Color(255, 250, 240));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userID=txtUserID.getText();
				String password=txtPassword.getText();
				
					
			   if(userID.equals("admin") && password.equals("admin123")) {
				   MainMenuUI mUI=new MainMenuUI();
				   mUI.setVisible(true);
				   setVisible(false);
			   }else {
				   JOptionPane.showMessageDialog(contentPane, "Incorrect Admin UserID or Password");
			   }
				
			}
		});
		btnOK.setBounds(203, 297, 85, 38);
		contentPane.add(btnOK);
		
		JButton btnCancel = new JButton("CLEAR");
		btnCancel.setBackground(new Color(255, 250, 240));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUserID.setText("");
				txtPassword.setText("");
			}
		});
		btnCancel.setBounds(306, 297, 85, 38);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel_1 = new JLabel("Manager Login");
		lblNewLabel_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(130, 33, 215, 33);
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
