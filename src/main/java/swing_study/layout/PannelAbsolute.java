package swing_study.layout;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class PannelAbsolute extends JPanel {
	private JTextField textField;

	public PannelAbsolute() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(168, 119, 97, 23);
		add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(12, 269, 116, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(381, 10, 57, 15);
		add(lblNewLabel);

	}
}
