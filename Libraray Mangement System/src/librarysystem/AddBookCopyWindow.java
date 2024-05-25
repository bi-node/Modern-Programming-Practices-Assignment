package librarysystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.*;
import business.*;

public class AddBookCopyWindow extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// public static final AddBookWindow INSTANCE = new AddBookWindow();

	JTextField txtIsbn, txtTitle, txtNoOfCopies;
	JButton btnCheckIsbn, btnAddBookCopy, btnBack;
	Book book;
	HashMap<String, Book> bookMap;
	AdminDashboardWindow dashboard;
	ControllerInterface ci = new SystemController();

	public AddBookCopyWindow(AdminDashboardWindow dashboard) {
		// TODO Auto-generated constructor stub
		this.dashboard = dashboard;
		bookMap = ci.getAllBooks();
		setBounds(0, 0, 600, 600);
		setTitle("Make copies of Book");
		setLayout(null);
		setVisible(true);
		Util.centerFrameOnDesktop(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Two panels
		JPanel p1 = new JPanel();
		p1.setBounds(0, 0, 600, 600);
		p1.setLayout(null);
		add(p1);

		// labeling
		JLabel lblIsbn = new JLabel("Enter the ISBN Number");
		lblIsbn.setBounds(40, 40, 180, 20);
		p1.add(lblIsbn);

		JLabel lblTitle = new JLabel("Book Title");
		lblTitle.setBounds(40, 80, 100, 20);
		p1.add(lblTitle);

		JLabel lblNoOfCopies = new JLabel("Enter the no. of copies");
		lblNoOfCopies.setBounds(40, 120, 200, 20);
		p1.add(lblNoOfCopies);

		// left side text field
		txtIsbn = new JTextField();
		txtIsbn.setBounds(200, 40, 100, 25);
		txtIsbn.setText("12-3456789");
		txtIsbn.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		p1.add(txtIsbn);

		// check ISBN button
		btnCheckIsbn = new JButton("Check");
		btnCheckIsbn.setBounds(340, 40, 100, 25);
		Util.newbuttonStyle(btnCheckIsbn);
		p1.add(btnCheckIsbn);
		btnCheckIsbn.addActionListener(this);

		txtTitle = new JTextField();
		txtTitle.setBounds(200, 80, 350, 25);
		txtTitle.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		// txtTitle.setText("Java21");
		p1.add(txtTitle);

		txtNoOfCopies = new JTextField();
		txtNoOfCopies.setBounds(200, 120, 350, 25);
		txtNoOfCopies.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		txtNoOfCopies.setText("3");
		p1.add(txtNoOfCopies);

		// button add copy and back;
		btnAddBookCopy = new JButton("Add Copy(ies)");
		btnAddBookCopy.setBounds(400, 180, 130, 30);
		Util.newbuttonStyle(btnAddBookCopy);
		p1.add(btnAddBookCopy);
		btnAddBookCopy.addActionListener(this);

		btnBack = new JButton("Back");
		btnBack.setBounds(100, 180, 100, 30);
		Util.newbuttonStyle(btnBack);
		p1.add(btnBack);
		btnBack.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String isbn = txtIsbn.getText();
		String no = txtNoOfCopies.getText();
		int noOfCopies = Integer.parseInt(no);

		if (ae.getSource() == btnCheckIsbn) {
			// Check ISBN logic
			if (isbn.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please enter ISBN No.");
				return;
			}

			if (bookMap.containsKey(isbn)) {
				JOptionPane.showMessageDialog(null, "Book present in the System. Add no of copies below");
				book = bookMap.get(isbn);
				txtTitle.setText(book.getTitle());
			} else {
				JOptionPane.showMessageDialog(null,
						"Book is not present in the System. Please go back and add new book");
			}
		}
		if (ae.getSource() == btnBack) {
			dashboard.setVisible(true);
			dispose();
		}

		if (ae.getSource() == btnAddBookCopy) {
			// Initialize book if it's null
			if (book == null) {
				if (isbn.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please check ISBN before adding copies.");
					return;
				}
				if (bookMap.containsKey(isbn)) {
					book = bookMap.get(isbn);
				} else {
					JOptionPane.showMessageDialog(null,
							"Book is not present in the System. Please go back and add new book");
					return;
				}
			}

			// Add copies logic
			for (int i = 0; i < noOfCopies; i++) {
				book.addCopy();
			}

			ci.updateBook(book);
			// Notify the user about the successful addition of copies
			JOptionPane.showMessageDialog(null, "Copies added successfully.");
		}
	}
}
