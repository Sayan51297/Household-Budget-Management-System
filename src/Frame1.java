import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 {

	private JFrame frmWelcome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frmWelcome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWelcome = new JFrame();
		frmWelcome.setTitle("Welcome");
		frmWelcome.setBounds(100, 100, 900, 500);
		frmWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcome.getContentPane().setLayout(null);
		
		JLabel lblHouseholdBudgetManagement = new JLabel("HOUSEHOLD BUDGET MANAGEMENT SYSTEM");
		lblHouseholdBudgetManagement.setForeground(Color.BLACK);
		lblHouseholdBudgetManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblHouseholdBudgetManagement.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblHouseholdBudgetManagement.setBounds(10, 190, 797, 43);
		frmWelcome.getContentPane().add(lblHouseholdBudgetManagement);
		
		JButton btnClickHereTo = new JButton("Click here to continue...");
		btnClickHereTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmWelcome.dispose();
				Frame2 obj = new Frame2();
				obj.main();
			}
		});
		btnClickHereTo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClickHereTo.setIcon(new ImageIcon("C:\\Users\\DELL\\new_workspace\\HBMS\\pics\\right-arrow.png"));
		btnClickHereTo.setBounds(615, 374, 259, 31);
		frmWelcome.getContentPane().add(btnClickHereTo);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setIcon(new ImageIcon("C:\\Users\\DELL\\new_workspace\\HBMS\\pics\\hbms4.jpg"));
		label.setBounds(0, 0, 884, 461);
		frmWelcome.getContentPane().add(label);
	}
}
