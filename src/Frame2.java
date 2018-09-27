import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.lang.Override;

public class Frame2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static int tot_1;
	public static int tot_2;
	public static int income;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 frame = new Frame2();
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
	public Frame2() {
		Frame3 obj1 = new Frame3();
		Frame4 obj2 = new Frame4();
				
		setTitle("Household Budget Management System");
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				int x = JOptionPane.showConfirmDialog(null, "Do you really want to exit ?", "Confirm Exit", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if(x == JOptionPane.YES_OPTION){
					e.getWindow().dispose();
				}
			}
		});
				
		JLabel lblNewLabel = new JLabel("Monthly family income");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 51, 333, 25);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(353, 51, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEstimatedMonthlyExpenditure = new JLabel("Estimated monthly expenditure");
		lblEstimatedMonthlyExpenditure.setForeground(Color.BLACK);
		lblEstimatedMonthlyExpenditure.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEstimatedMonthlyExpenditure.setBounds(10, 127, 333, 25);
		contentPane.add(lblEstimatedMonthlyExpenditure);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(353, 128, 130, 23);
		
		contentPane.add(lblNewLabel_1);
		
		JLabel lblActualMonthlyExpenditure = new JLabel("Actual monthly expenditure");
		lblActualMonthlyExpenditure.setForeground(Color.BLACK);
		lblActualMonthlyExpenditure.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblActualMonthlyExpenditure.setBounds(10, 201, 333, 25);
		contentPane.add(lblActualMonthlyExpenditure);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(353, 202, 130, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblDifference = new JLabel("Difference");
		lblDifference.setForeground(Color.BLACK);
		lblDifference.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDifference.setBounds(10, 276, 333, 25);
		contentPane.add(lblDifference);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(353, 277, 130, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setForeground(Color.BLACK);
		lblBalance.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBalance.setBounds(10, 350, 333, 25);
		contentPane.add(lblBalance);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(353, 351, 130, 23);
		contentPane.add(lblNewLabel_4);
		
		JButton btnCalculateEstimatedMonthly = new JButton("Calculate estimated monthly expenditure");
		btnCalculateEstimatedMonthly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				obj1.main();
			}
		});
		btnCalculateEstimatedMonthly.setIcon(new ImageIcon("C:\\Users\\DELL\\new_workspace\\HBMS\\pics\\right-arrow.png"));
		btnCalculateEstimatedMonthly.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCalculateEstimatedMonthly.setBounds(509, 51, 365, 28);
		contentPane.add(btnCalculateEstimatedMonthly);
		
		JButton btnNewButton = new JButton("Calculate actual monthly expenditure");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj2.main();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\DELL\\new_workspace\\HBMS\\pics\\right-arrow.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(509, 127, 365, 28);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Calculate difference and balance");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tot_1 > tot_2)
					lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\DELL\\new_workspace\\HBMS\\pics\\arrow-up-on-a-black-circle-background.png"));
				else if(tot_2 > tot_1)
					lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\DELL\\new_workspace\\HBMS\\pics\\arrow-down-on-a-black-circular-background.png"));
				else
					lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\DELL\\new_workspace\\HBMS\\pics\\arrow-pointing-right-in-a-circle.png"));
				lblNewLabel_3.setText(String.valueOf(Math.abs(tot_1 - tot_2)));
				lblNewLabel_4.setText(String.valueOf(income - tot_2));
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\DELL\\new_workspace\\HBMS\\pics\\calculator.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(509, 276, 365, 28);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText("");
				lblNewLabel_2.setText("");
				lblNewLabel_3.setText("");
				lblNewLabel_4.setText("");
				textField.setText("");
				income = tot_1 = tot_2 = 0;
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\DELL\\new_workspace\\HBMS\\pics\\reset.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(509, 350, 365, 28);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Accept all values");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tot_1 = obj1.tot_1;
				lblNewLabel_1.setText(String.valueOf(tot_1));
				tot_2 = obj2.tot_2;
				lblNewLabel_2.setText(String.valueOf(tot_2));
				income = Integer.parseInt(textField.getText());
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\DELL\\new_workspace\\HBMS\\pics\\right-arrow.png"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_3.setBounds(509, 201, 365, 28);
		contentPane.add(btnNewButton_3);
		
		JLabel label = new JLabel("");
		label.setForeground(Color.BLACK);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setIcon(new ImageIcon("C:\\Users\\DELL\\new_workspace\\HBMS\\pics\\hbms4.jpg"));
		label.setBounds(0, 0, 884, 461);
		contentPane.add(label);
	}
}
