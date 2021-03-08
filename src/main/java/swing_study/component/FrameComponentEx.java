package swing_study.component;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class FrameComponentEx extends JFrame {

	private JPanel contentPane;
	private JButton btn2;
	private JButton btn3;
	private JButton btn1;

	public FrameComponentEx() {
		setTitle("공통속성");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn1 = createBtn1();
		contentPane.add(btn1);

		btn2 = new JButton("Disabled Button");
		btn2.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {

				if (btn1 != null) {
					contentPane.remove(btn1);
					btn1 = null;
					revalidate();
				} else {
					JButton btn = createBtn1();
					contentPane.add(btn1, 0);
					revalidate();
					
					if (btn1.isVisible()) {
						btn1.setVisible(false);
					} else {
						btn1.setVisible(true);
					}
				}
			}
		});
		btn2.setEnabled(false);
		contentPane.add(btn2);

		btn3 = new JButton("get(X), get(Y)");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn3 = (JButton) e.getSource();
				FrameComponentEx parent = (FrameComponentEx) btn3.getTopLevelAncestor();
				parent.setTitle(btn3.getX() + ", " + btn3.getY());

				if (btn2.isEnabled()) {
					btn2.setEnabled(false);
				} else {
					btn2.setEnabled(true);
				}
			}
		});
		contentPane.add(btn3);
	}

	private JButton createBtn1() {
		btn1 = new JButton("Magenta/Yellow Button");
		btn1.setBackground(Color.YELLOW);
		btn1.setForeground(Color.PINK);
		btn1.setFont(new Font("Arial", Font.BOLD, 20));
		contentPane.add(btn1);
		return btn1;
	}

}
