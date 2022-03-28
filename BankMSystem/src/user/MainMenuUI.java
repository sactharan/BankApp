package user;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class MainMenuUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuUI frame = new MainMenuUI();
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
	public MainMenuUI() {
		setSize(new Dimension(1280, 1024));
		setTitle("CityBank");
		setEnabled(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(173, 216, 230));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Manage Cashiers");
		mnNewMenu.setBackground(new Color(255, 250, 205));
		mnNewMenu.setForeground(new Color(0, 0, 0));
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CashierUI cui = new CashierUI();
				contentPane.add(cui);
				cui.setVisible(true);
			}
		});
		mnNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			}
		});
		
		JMenu mnNewMenu_5 = new JMenu("File");
		mnNewMenu_5.setForeground(new Color(0, 0, 0));
		mnNewMenu_5.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("About");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutUI cui = new AboutUI();
				contentPane.add(cui);
				cui.setVisible(true);
			}
		});
		mntmNewMenuItem_4.setBackground(new Color(218, 165, 32));
		mntmNewMenuItem_4.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_5.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Exit");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmNewMenuItem_5.setBackground(new Color(218, 165, 32));
		mntmNewMenuItem_5.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_5.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_5.add(mntmNewMenuItem_5);
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Manage Accounts");
		mnNewMenu_1.setBackground(new Color(255, 250, 205));
		mnNewMenu_1.setForeground(new Color(0, 0, 0));
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AccountUI cui =new AccountUI();
				contentPane.add(cui);
				cui.setVisible(true);
			}
		});
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Manage Transaction");
		mnNewMenu_2.setBackground(new Color(255, 250, 205));
		mnNewMenu_2.setForeground(new Color(0, 0, 0));
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Withdraw");
		mntmNewMenuItem.setBackground(new Color(255, 250, 205));
		mntmNewMenuItem.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WithdrawUI cui =new WithdrawUI();
				contentPane.add(cui);
				cui.setVisible(true);
			}
		});
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Deposit");
		mntmNewMenuItem_1.setBackground(new Color(255, 250, 205));
		mntmNewMenuItem_1.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DepositUI cui =new DepositUI();
				contentPane.add(cui);
				cui.setVisible(true);
			}
		});
		mntmNewMenuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DepositUI cui =new DepositUI();
				contentPane.add(cui);
				cui.setVisible(true);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Check Balance");
		mntmNewMenuItem_2.setBackground(new Color(255, 250, 205));
		mntmNewMenuItem_2.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckBalUI cui =new CheckBalUI();
				contentPane.add(cui);
				cui.setVisible(true);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_4 = new JMenu("LogOut");
		mnNewMenu_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManagerLoginUI cui =new ManagerLoginUI();
				cui.setVisible(true);
				dispose();
			}
		});
		mnNewMenu_4.setForeground(new Color(0, 0, 0));
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(mnNewMenu_4);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setMaximumSize(new Dimension(1280, 1024));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To CityBank");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblNewLabel.setBounds(395, 42, 395, 56);
		contentPane.add(lblNewLabel);
	}
}
