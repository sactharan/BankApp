package user;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class LoginMenuUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginMenuUI frame = new LoginMenuUI();
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
	public LoginMenuUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 575);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 235, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Login As a Manager");
		btnNewButton.setBackground(new Color(240, 248, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerLoginUI frame = new ManagerLoginUI();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(244, 126, 188, 48);
		contentPane.add(btnNewButton);
		
		JButton btnLoginAsA = new JButton("Login As a Cashier");
		btnLoginAsA.setBackground(new Color(211, 211, 211));
		btnLoginAsA.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLoginAsA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CashierLoginUI frame = new CashierLoginUI();
				frame.setVisible(true);
				dispose();
			}
		});
		btnLoginAsA.setBounds(244, 210, 188, 48);
		contentPane.add(btnLoginAsA);
		
		JLabel lblNewLabel = new JLabel("CityBank Management System");
		lblNewLabel.setForeground(new Color(106, 90, 205));
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 30));
		lblNewLabel.setBounds(113, 45, 448, 41);
		contentPane.add(lblNewLabel);
	}
}
