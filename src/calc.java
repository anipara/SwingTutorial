import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calc {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddition = new JButton("Addition");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(textField.getText());
				int n2 = Integer.parseInt(textField_1.getText());
				txtResult.setText(Integer.toString(n1+n2));
			}
		});
		btnAddition.setBounds(30, 104, 85, 21);
		frame.getContentPane().add(btnAddition);
		
		textField = new JTextField();
		textField.setBounds(20, 75, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(271, 75, 96, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("First Number");
		lblNewLabel.setBounds(20, 52, 85, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Second Number");
		lblNewLabel_1.setBounds(271, 52, 73, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Calculator");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(156, 10, 96, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnSubtraction = new JButton("Subtraction");
		btnSubtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(textField.getText());
				int n2 = Integer.parseInt(textField_1.getText());
				txtResult.setText(Integer.toString(n1-n2));
			}
		});
		btnSubtraction.setBounds(30, 155, 85, 21);
		frame.getContentPane().add(btnSubtraction);
		
		JButton btnMultiplication = new JButton("Multiplication");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(textField.getText());
				int n2 = Integer.parseInt(textField_1.getText());
				txtResult.setText(Integer.toString(n1*n2));
			}
		});
		btnMultiplication.setBounds(30, 197, 85, 21);
		frame.getContentPane().add(btnMultiplication);
		
		JButton btnDivision = new JButton("Division");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(textField.getText());
				int n2 = Integer.parseInt(textField_1.getText());
				txtResult.setText(Integer.toString(n1/n2));
			}
		});
		btnDivision.setBounds(30, 228, 85, 21);
		frame.getContentPane().add(btnDivision);
		
		txtResult = new JTextField();
		txtResult.setText("Result");
		txtResult.setBounds(253, 175, 96, 19);
		frame.getContentPane().add(txtResult);
		txtResult.setColumns(10);
	}

}
