package swing_study.component;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class JCheckboxX extends JFrame implements ItemListener {

	private JPanel contentPane;
	private int sum;
	private String resStr = "현재 0원입니다.";
	private JLabel lblTitle;
	private JLabel lblRes;
	private JCheckBox chckbxApple;
	private JCheckBox chckbxPear;
	private JCheckBox chckbxCherry;

	public JCheckboxX() {
		initialize();
		chckbxCherry.setSelected(true);
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblTitle = new JLabel("사과 100원, 배 500원, 체리 2000원");
		contentPane.add(lblTitle, BorderLayout.NORTH);
		
		lblRes = new JLabel("없음");
		contentPane.add(lblRes, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		chckbxApple = new JCheckBox("사과");
		chckbxApple.addItemListener(this);
		panel.add(chckbxApple);
		
		chckbxPear = new JCheckBox("배");
		chckbxPear.addItemListener(this);
		panel.add(chckbxPear);
		
		chckbxCherry = new JCheckBox("체리");
		chckbxCherry.addItemListener(this);
		panel.add(chckbxCherry);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == chckbxCherry) {
			itemStateChangedChckbxCherry(e);
		}
		if (e.getSource() == chckbxPear) {
			itemStateChangedChckbxPear(e);
		}
		if (e.getSource() == chckbxApple) {
			itemStateChangedChckbxApple(e);
		}
		
		resStr = String.format("현재 %d원입니다.", sum);
		lblRes.setText(resStr);
	}
	protected void itemStateChangedChckbxApple(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += 100;
		} else {
			sum -= 100;
		}
	}
	protected void itemStateChangedChckbxPear(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += 500;
		} else {
			sum -= 500;
		}
	}
	protected void itemStateChangedChckbxCherry(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += 2000;
		} else {
			sum -= 2000;
		}
	}
}
