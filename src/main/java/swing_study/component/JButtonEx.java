package swing_study.component;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class JButtonEx extends JFrame {

	private JPanel contentPane;
	private String imgpath = System.getProperty("user.dir") + File.separator + "images" + File.separator;

	public JButtonEx() {
		setTitle("JButton");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btn01 = new JButton("call");
		btn01.setIcon(new ImageIcon(imgpath+"3.gif"));
		btn01.setRolloverIcon(new ImageIcon(imgpath+"5.gif"));
		btn01.setPressedIcon(new ImageIcon(imgpath+"4.gif"));
		pLeft.add(btn01);
		
		JToggleButton tglbtn = new JToggleButton("Toggle Button");
		tglbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtn.isSelected()) {
					tglbtn.setText("Push");
				} else {
					tglbtn.setText("Push me!");
				}
			}
		});
		pLeft.add(tglbtn);
		
		JPanel pRight = new JPanel();
		contentPane.add(pRight);
		pRight.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pTop = new JPanel();
		pRight.add(pTop);
		pTop.setLayout(new GridLayout(0, 1, 0, 0));
		
		MyButton btn2 = new MyButton();
		btn2.setHorizontalAlignment(SwingConstants.LEFT);
		btn2.setText("Left");
		pTop.add(btn2);
		
		MyButton btn3 = new MyButton();
		btn3.setText("Center");
		btn3.setToolTipText("");
		pTop.add(btn3);
		
		MyButton btn4 = new MyButton();
		btn4.setHorizontalAlignment(SwingConstants.RIGHT);
		btn4.setText("Right");
		pTop.add(btn4);
		
		JPanel pBottom = new JPanel();
		pRight.add(pBottom);
		pBottom.setLayout(new GridLayout(1, 0, 0, 0));
		
		MyButton btn5 = new MyButton();
		btn5.setVerticalAlignment(SwingConstants.TOP);
		btn5.setText("Top");
		pBottom.add(btn5);
		
		MyButton btn6 = new MyButton();
		btn6.setText("Center");
		btn6.setToolTipText("");
		pBottom.add(btn6);
		
		MyButton btn7 = new MyButton();
		btn7.setVerticalAlignment(SwingConstants.BOTTOM);
		btn7.setText("Bottom");
		pBottom.add(btn7);
	}

}
