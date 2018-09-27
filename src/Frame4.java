import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Frame4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	public static int tot_2;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame4 frame = new Frame4();
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
	public Frame4() {
		setTitle("Actual Monthly Expenditure");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRent = new JLabel("Rent");
		lblRent.setForeground(Color.BLACK);
		lblRent.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRent.setBounds(10, 20, 172, 25);
		contentPane.add(lblRent);
		
		JLabel lblNewLabel = new JLabel("Phone");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 80, 172, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Electricity");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 140, 172, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cable");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 200, 172, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblMaintainance = new JLabel("Maintainance");
		lblMaintainance.setForeground(Color.BLACK);
		lblMaintainance.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMaintainance.setBounds(10, 260, 172, 25);
		contentPane.add(lblMaintainance);
		
		JLabel lblTransportation = new JLabel("Transportation");
		lblTransportation.setForeground(Color.BLACK);
		lblTransportation.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTransportation.setBounds(10, 320, 172, 25);
		contentPane.add(lblTransportation);
		
		JLabel lblGroceries = new JLabel("Groceries");
		lblGroceries.setForeground(Color.BLACK);
		lblGroceries.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGroceries.setBounds(490, 140, 172, 25);
		contentPane.add(lblGroceries);
		
		JLabel lblInsurance = new JLabel("Insurance");
		lblInsurance.setForeground(Color.BLACK);
		lblInsurance.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblInsurance.setBounds(490, 200, 172, 25);
		contentPane.add(lblInsurance);
		
		JLabel lblLoanemi = new JLabel("Loan/EMI");
		lblLoanemi.setForeground(Color.BLACK);
		lblLoanemi.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLoanemi.setBounds(490, 260, 172, 25);
		contentPane.add(lblLoanemi);
		
		JLabel lblEntertainment = new JLabel("Entertainment");
		lblEntertainment.setForeground(Color.BLACK);
		lblEntertainment.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEntertainment.setBounds(490, 20, 172, 25);
		contentPane.add(lblEntertainment);
		
		JLabel lblEducation = new JLabel("Education");
		lblEducation.setForeground(Color.BLACK);
		lblEducation.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEducation.setBounds(490, 80, 172, 25);
		contentPane.add(lblEducation);
		
		JLabel lblMiscellaneous = new JLabel("Miscellaneous");
		lblMiscellaneous.setForeground(Color.BLACK);
		lblMiscellaneous.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMiscellaneous.setBounds(490, 320, 172, 25);
		contentPane.add(lblMiscellaneous);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)){
					e.consume();
				}
			}
		});
		textField.setBounds(735, 80, 139, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)){
					e.consume();
				}
			}
		});
		textField_1.setBounds(253, 20, 139, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)){
					e.consume();
				}
			}
		});
		textField_2.setBounds(735, 20, 139, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)){
					e.consume();
				}
			}
		});
		textField_3.setBounds(253, 80, 139, 25);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)){
					e.consume();
				}
			}
		});
		textField_4.setBounds(253, 140, 139, 25);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)){
					e.consume();
				}
			}
		});
		textField_5.setBounds(735, 140, 139, 25);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)){
					e.consume();
				}
			}
		});
		textField_6.setBounds(253, 200, 139, 25);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)){
					e.consume();
				}
			}
		});
		textField_7.setBounds(735, 200, 139, 25);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)){
					e.consume();
				}
			}
		});
		textField_8.setBounds(253, 260, 139, 25);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)){
					e.consume();
				}
			}
		});
		textField_9.setBounds(735, 260, 139, 25);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)){
					e.consume();
				}
			}
		});
		textField_10.setBounds(253, 320, 139, 25);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)){
					e.consume();
				}
			}
		});
		textField_11.setBounds(735, 320, 139, 25);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				tot_2 = 0;
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReset.setIcon(new ImageIcon("C:\\Users\\DELL\\new_workspace\\HBMS\\pics\\reset.png"));
		btnReset.setBounds(250, 418, 400, 25);
		contentPane.add(btnReset);
		
		JButton btnAcceptValuesAnd = new JButton("Accept values and return to main page");
		btnAcceptValuesAnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField.getText();
				String text_1 = textField_1.getText();
				String text_2 = textField_2.getText();
				String text_3 = textField_3.getText();
				String text_4 = textField_4.getText();
				String text_5 = textField_5.getText();
				String text_6 = textField_6.getText();
				String text_7 = textField_7.getText();
				String text_8 = textField_8.getText();
				String text_9 = textField_9.getText();
				String text_10 = textField_10.getText();
				String text_11 = textField_11.getText();
				int num = Integer.parseInt(text);
				int num_1 = Integer.parseInt(text_1);
				int num_2 = Integer.parseInt(text_2);
				int num_3 = Integer.parseInt(text_3);
				int num_4 = Integer.parseInt(text_4);
				int num_5 = Integer.parseInt(text_5);
				int num_6 = Integer.parseInt(text_6);
				int num_7 = Integer.parseInt(text_7);
				int num_8 = Integer.parseInt(text_8);
				int num_9 = Integer.parseInt(text_9);
				int num_10 = Integer.parseInt(text_10);
				int num_11 = Integer.parseInt(text_11);
				tot_2 = num + num_1 + num_2 + num_3 + num_4 + num_5 + num_6 + num_7 + num_8 + num_9 + num_10 + num_11;
				dispose();
			}
		});
		btnAcceptValuesAnd.setIcon(new ImageIcon("C:\\Users\\DELL\\new_workspace\\HBMS\\pics\\right-arrow.png"));
		btnAcceptValuesAnd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAcceptValuesAnd.setBounds(250, 382, 400, 25);
		contentPane.add(btnAcceptValuesAnd);
		
		JLabel label = new JLabel("");
		label.setForeground(Color.BLACK);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setIcon(new ImageIcon("C:\\Users\\DELL\\new_workspace\\HBMS\\pics\\hbms4.jpg"));
		label.setBounds(0, 0, 884, 461);
		contentPane.add(label);
	}

}
