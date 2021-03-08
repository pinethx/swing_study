package swing_study.component;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class JLableEx extends JFrame {

	private JPanel contentPane;
	private String path = System.getProperty("user.dir") + File.separator + "images" + File.separator;
	
	private JLabel lbl2;
	private JLabel lbl1;
	private JLabel lbl3;

	public JLableEx() {
		initialize();
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		lbl1 = new JLabel("love you");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl1, BorderLayout.NORTH);
		
		lbl2 = new JLabel("");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setIcon(new ImageIcon(path + "1.jpg"));
		contentPane.add(lbl2, BorderLayout.CENTER);
		
		lbl3 = new JLabel("Call");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setIcon(new ImageIcon(path + "2.jpg"));
		contentPane.add(lbl3, BorderLayout.SOUTH);
	}

}
