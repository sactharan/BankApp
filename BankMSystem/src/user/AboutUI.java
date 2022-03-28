package user;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AboutUI extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUI frame = new AboutUI();
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
	public AboutUI() {
		getContentPane().setBackground(new Color(173, 216, 230));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Software Version:");
		lblNewLabel.setFont(new Font("Tekton Pro Cond", Font.BOLD, 26));
		lblNewLabel.setBounds(34, 194, 228, 39);
		getContentPane().add(lblNewLabel);
		
		JLabel lblAboutCityBank = new JLabel("About City Bank App");
		lblAboutCityBank.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblAboutCityBank.setBounds(266, 29, 395, 56);
		getContentPane().add(lblAboutCityBank);
		
		JLabel lblDesignedBy = new JLabel("Designed By:");
		lblDesignedBy.setFont(new Font("Tekton Pro Cond", Font.BOLD, 26));
		lblDesignedBy.setBounds(34, 376, 228, 39);
		getContentPane().add(lblDesignedBy);
		
		JLabel lblNewLabel_2_1 = new JLabel("Software Name:");
		lblNewLabel_2_1.setFont(new Font("Tekton Pro Cond", Font.BOLD, 26));
		lblNewLabel_2_1.setBounds(34, 340, 228, 39);
		getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Purpose:");
		lblNewLabel_2_1_1.setFont(new Font("Tekton Pro Cond", Font.BOLD, 26));
		lblNewLabel_2_1_1.setBounds(34, 419, 228, 39);
		getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("1.0");
		lblNewLabel_2.setFont(new Font("Tekton Pro Cond", Font.BOLD, 26));
		lblNewLabel_2.setBounds(290, 194, 228, 39);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Sasitharan KDHDCSE 51/23(ICBT KANDY CAMPUS)");
		lblNewLabel_2_2.setFont(new Font("Tekton Pro Cond", Font.BOLD, 26));
		lblNewLabel_2_2.setBounds(290, 376, 506, 39);
		getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("City Bank ");
		lblNewLabel_2_2_1.setFont(new Font("Tekton Pro Cond", Font.BOLD, 26));
		lblNewLabel_2_2_1.setBounds(290, 340, 506, 39);
		getContentPane().add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("OOP Project Assignment");
		lblNewLabel_2_2_1_1.setFont(new Font("Tekton Pro Cond", Font.BOLD, 26));
		lblNewLabel_2_2_1_1.setBounds(290, 419, 506, 39);
		getContentPane().add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Java Version");
		lblNewLabel_2_1_1_1.setFont(new Font("Tekton Pro Cond", Font.BOLD, 26));
		lblNewLabel_2_1_1_1.setBounds(34, 234, 228, 39);
		getContentPane().add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("15");
		lblNewLabel_2_2_1_1_1.setFont(new Font("Tekton Pro Cond", Font.BOLD, 26));
		lblNewLabel_2_2_1_1_1.setBounds(290, 234, 506, 39);
		getContentPane().add(lblNewLabel_2_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Designing Tools");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tekton Pro Cond", Font.BOLD, 26));
		lblNewLabel_2_1_1_1_1.setBounds(34, 274, 228, 39);
		getContentPane().add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1 = new JLabel("Eclipse 2021");
		lblNewLabel_2_2_1_1_1_1.setFont(new Font("Tekton Pro Cond", Font.BOLD, 26));
		lblNewLabel_2_2_1_1_1_1.setBounds(290, 274, 506, 39);
		getContentPane().add(lblNewLabel_2_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Designed Date:");
		lblNewLabel_2_1_1_2.setFont(new Font("Tekton Pro Cond", Font.BOLD, 26));
		lblNewLabel_2_1_1_2.setBounds(34, 479, 228, 39);
		getContentPane().add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_2_1_1_2 = new JLabel("2022-03-24");
		lblNewLabel_2_2_1_1_2.setFont(new Font("Tekton Pro Cond", Font.BOLD, 26));
		lblNewLabel_2_2_1_1_2.setBounds(290, 479, 506, 39);
		getContentPane().add(lblNewLabel_2_2_1_1_2);
		
		JButton btnNewButton_1_1 = new JButton("Close");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Yu Gothic Medium", Font.BOLD, 17));
		btnNewButton_1_1.setBackground(Color.RED);
		btnNewButton_1_1.setBounds(807, 0, 93, 48);
		getContentPane().add(btnNewButton_1_1);
		setTitle("CityBank");
		setBounds(100, 100, 916, 721);

	}
}
