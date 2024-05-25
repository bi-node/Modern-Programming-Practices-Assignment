
package librarysystem;

import java.awt.*;
import javax.swing.*;
import business.ControllerInterface;
import business.SystemController;
import dataaccess.User;
import java.awt.event.*;
import java.util.Map;

public class LoginWindow extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JButton btnLoginButton;
	JTextField txtUsername;
	JTextField passwordField;
	ControllerInterface ci = new SystemController();

	LoginWindow() {

		setBounds(0, 0, 600, 400);
		setTitle("Log in");
		setLayout(null);
		setVisible(true);
		setBackground(Color.gray);
		Util.centerFrameOnDesktop(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Two panels
		JPanel p1 = new JPanel();
		p1.setBounds(0, 0, 300, 400);
		p1.setLayout(null);
		add(p1);
		
		JPanel p2=new JPanel();
		p2.setBounds(300,0,300,400);
		p2.setLayout(null);
		add(p2);
		
		// Load the image
		ImageIcon originalIcon = new ImageIcon("src/resources/login.jpg");
		Image originalImage = originalIcon.getImage();
		Image resizedImage = originalImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon resizedIcon = new ImageIcon(resizedImage);
		JLabel imageLabel = new JLabel(resizedIcon);
		p2.setLayout(new BorderLayout());
		p2.add(imageLabel, BorderLayout.CENTER);


		// username
		JLabel lblusername = new JLabel("Username");
		lblusername.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
		lblusername.setBounds(40, 20, 100, 25);
		p1.add(lblusername);
		txtUsername = new JTextField();
		txtUsername.setBounds(40, 60, 250, 30);
		txtUsername.setText("103");
		txtUsername.setBorder(BorderFactory.createEmptyBorder());
		p1.add(txtUsername);

		// password

		JLabel lblpassword = new JLabel("Password");
		lblpassword.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
		lblpassword.setBounds(40, 110, 100, 25);
		passwordField = new JPasswordField(20);
		passwordField.setBounds(40, 150, 250, 30);
		passwordField.setText("111");
		passwordField.setBorder(BorderFactory.createEmptyBorder());
		p1.add(passwordField);
		p1.add(lblpassword);

		// Buttons
		// 1. signin
		btnLoginButton = new JButton("Log in");
		btnLoginButton.setBounds(60, 200, 130, 30);
		btnLoginButton.setBackground(new Color(0, 184, 230));
		btnLoginButton.setForeground(Color.white);
		btnLoginButton.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
		btnLoginButton.setBorder(BorderFactory.createEmptyBorder());
		btnLoginButton.addActionListener(evt -> {
			String username = txtUsername.getText().trim();
			String password = passwordField.getText();
			User user;
			Map<String, User> userMap = ci.getAllUsers();
			if (username.isEmpty() || password.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Please enter both username and password.");
				return;
			}
				 user = userMap.get(username);
			if (user == null) {
				JOptionPane.showMessageDialog(null, "Username not found");
				return;
			}
			// Perform null check before accessing user's password
			boolean passwordMatch = password.equals(user.getPassword());
			if (!passwordMatch) {
				JOptionPane.showMessageDialog(null, "Incorrect password");
			} else {
				String role=user.getAuthorization().toString();
				setVisible(false);
				revalidate();
				removeAll();
				JOptionPane.showMessageDialog(null, "Welcome");
				new AdminDashboardWindow(role);
			}

		});
		p1.add(btnLoginButton);
		setVisible(true);

	}

	/*
	 * @Override public void actionPerformed(ActionEvent ae) { new
	 * AdminDashboardWindow("BOTH"); String username = txtUsername.getText().trim();
	 * String password = passwordField.getText(); Map<String, User> userMap =
	 * ci.getAllUsers();
	 * 
	 * if (ae.getSource() == btnLoginButton) {
	 * 
	 * 
	 * 
	 * 
	 * } }/ }
	 */

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new LoginWindow();

			}
		});

	}// end of main

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
