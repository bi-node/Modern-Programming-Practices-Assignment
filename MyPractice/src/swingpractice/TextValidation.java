package swingpractice;

import java.awt.EventQueue;

import javax.swing.*;

import java.awt.Font;
import javax.swing.JTextField;

public class TextValidation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextValidation frame = new TextValidation();
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
	public TextValidation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 596, 429);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Your Telephone");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 25, 157, 42);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(177, 33, 172, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(260, 156, 1, 2);
		panel.add(separator);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(36, 139, 101, 22);
		panel.add(menuBar);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(295, 121, 163, 19);
		panel.add(formattedTextField);
	}
}
