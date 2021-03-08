package swing_study.component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class JRadioButtonEx extends JFrame {

	private JPanel contentPane;
	private String imgPath = System.getProperty("user.dir") + File.separator + "images" + File.separator;
	private ImageIcon[] icons = {
			new ImageIcon(imgPath + "apple.jpg"),
			new ImageIcon(imgPath + "pear.jpg"),
			new ImageIcon(imgPath + "cherry.jpg"),
	};
	
	public JRadioButtonEx() {
		initialize();
	}
	private void initialize() {
		setTitle("라디오 버튼 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 10, 0));
		
		JPanel pLeft = new JPanel();
		pLeft.setBorder(new TitledBorder(null, "Simple Radio Button", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pLeft);		
		pLeft.setLayout(new BorderLayout(0, 0));
		
		CustomRadioButton panel = new CustomRadioButton();
		pLeft.add(panel);
		
		JPanel pRight = new JPanel();
		pRight.setBorder(new TitledBorder(null, "Exercise Ex", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pRight);
		pRight.setLayout(new BorderLayout(0, 0));
		
		CustomRadioButton pTop = new CustomRadioButton();
		pRight.add(pTop, BorderLayout.NORTH);
		
		JPanel pBottom = new JPanel();
		pRight.add(pBottom, BorderLayout.CENTER);
	}

}
