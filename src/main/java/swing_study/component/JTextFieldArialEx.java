package swing_study.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class JTextFieldArialEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfName;
	private JPasswordField pwfPw1;
	private JPasswordField pwfPw2;
	private JTextArea ta;
	private JLabel lblName;
	private JLabel lblPw1;
	private JLabel lblPw2;
	private JLabel lblConfirm;
	private JLabel lblBirth;
	private JDateChooser dateChooser;
	private JButton btnAdd;
	private JButton btnCancel;

	public JTextFieldArialEx() {
		initialize();
	}

	private void initialize() {
		setTitle("텍스트 필드");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel pCenter = new JPanel();
		contentPane.add(pCenter, BorderLayout.CENTER);
		pCenter.setLayout(new BorderLayout(0, 0));

		ta = new JTextArea();
		pCenter.add(ta, BorderLayout.CENTER);

		JPanel pNorth = new JPanel();
		pNorth.setPreferredSize(new Dimension(450, 170));
		pNorth.setBorder(new EmptyBorder(10, 20, 10, 20));
		contentPane.add(pNorth, BorderLayout.NORTH);
		pNorth.setLayout(new GridLayout(0, 2, 10, 5));

		lblName = new JLabel("성명");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblName);

		tfName = new JTextField();
		tfName.addActionListener(this);
		pNorth.add(tfName);
		tfName.setColumns(10);

		lblPw1 = new JLabel("비밀번호");
		lblPw1.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblPw1);

		pwfPw1 = new JPasswordField();
		pwfPw1.getDocument().addDocumentListener(listener);
		pNorth.add(pwfPw1);

		lblPw2 = new JLabel("비밀번호 확인");
		lblPw2.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblPw2);

		pwfPw2 = new JPasswordField();
		pwfPw2.getDocument().addDocumentListener(listener);
		pNorth.add(pwfPw2);

		JPanel panel = new JPanel();
		pNorth.add(panel);

		lblConfirm = new JLabel("");
		lblConfirm.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirm.setForeground(Color.RED);
		lblConfirm.setFont(new Font("굴림", Font.BOLD, 12));
		pNorth.add(lblConfirm);

		lblBirth = new JLabel("생년월일");
		lblBirth.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblBirth);

		dateChooser = new JDateChooser(new Date());
		pNorth.add(dateChooser);

		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pNorth.add(btnAdd);

		btnCancel = new JButton("취소");
		btnCancel.addActionListener(this);
		pNorth.add(btnCancel);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancel) {
			actionPerformedBtnCancel(e);
		}
		if (e.getSource() == btnAdd) {
			actionPerformedBtnAdd(e);
		}
	}

	protected void actionPerformedBtnAdd(ActionEvent e) {
		String pw1 = new String(pwfPw1.getPassword());
		String pw2 = String.valueOf(pwfPw2.getPassword());
		if (lblConfirm.getText().equals("일치")) {
			Date d = dateChooser.getDate();
			String msg = String.format("%s - %tF%n", tfName.getText(), d);
			ta.append(msg);
			clearTF();
		} else {
			pwfPw1.requestFocus();
			pwfPw2.setText("");
			pwfPw1.selectAll();
			ta.append(String.format("비밀번호를 확인하세요."));
			
		}
	}

	protected void actionPerformedBtnCancel(ActionEvent e) {
		clearTF();
	}
	
	DocumentListener listener = new DocumentListener() {
		
		@Override
		public void removeUpdate(DocumentEvent e) {
			getMessage();
		}
		
		@Override
		public void insertUpdate(DocumentEvent e) {
			getMessage();
		}
		
		@Override
		public void changedUpdate(DocumentEvent e) {
			getMessage();
		}

		private void getMessage() {
			
				String pw1 = new String(pwfPw1.getPassword());
				String pw2 = String.valueOf(pwfPw2.getPassword());
				if (pw1.equals(pw2)) {
					lblConfirm.setText("일치");
				} else {
					lblConfirm.setText("불일치");
				}
		}
	};

	private void clearTF() {
		tfName.setText("");
		pwfPw1.setText("");
		pwfPw2.setText("");
		dateChooser.setDate(new Date());
		tfName.requestFocus();
	}
}
