package swing_study.component;

import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class CustomRadioButton extends JPanel {

	private final ButtonGroup buttonGroup = new ButtonGroup();
	private ArrayList<JRadioButton> rdbtns;
	private JRadioButton rdbtnApple;
	private JRadioButton rdbtnPear;
	private JRadioButton rdbtnCherry;

	public CustomRadioButton() {
		rdbtns = new ArrayList<JRadioButton>();
		initialize();
		rdbtns.add(rdbtnApple);
		rdbtns.add(rdbtnPear);
		rdbtns.add(rdbtnCherry);
	}

	private void initialize() {
		rdbtnApple = new JRadioButton("사과");
		buttonGroup .add(rdbtnApple);
		add(rdbtnApple);

		rdbtnPear = new JRadioButton("배");
		buttonGroup.add(rdbtnPear);
		add(rdbtnPear);

		rdbtnCherry = new JRadioButton("체리");
		buttonGroup.add(rdbtnCherry);
		add(rdbtnCherry);
	}

	public JRadioButton getRdbtnApple() {
		return rdbtnApple;
	}

	public JRadioButton getRdbtnPear() {
		return rdbtnPear;
	}

	public JRadioButton getRdbtnCherry() {
		return rdbtnCherry;
	}
}
