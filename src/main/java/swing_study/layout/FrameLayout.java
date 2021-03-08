package swing_study.layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class FrameLayout extends JFrame {

	private JPanel contentPane;
	private LayoutGuBun gubun;
	
	public FrameLayout(LayoutGuBun gubun) {
		this.gubun = gubun;
		initialize();
	}
	public void initialize() {
		setTitle("레이아웃 종류");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel pSwitch = null;
		switch(gubun) {
		case FLOW:
			pSwitch = new PannelFlow();
			setTitle("Flow Layout");
			break;
		case BORDER:
			pSwitch = new PannelBorder();
			setTitle("Border Layout");
			break;
		case GRID:
			pSwitch = new PannelGrid();
			setTitle("Grid Layout");
			break;
		case ABSOLUTE:
			pSwitch = new PannelAbsolute();
			setTitle("Absolute Layout");
			break;
		}
		
		contentPane.add(pSwitch, BorderLayout.CENTER);
		
//		setVisible(true);
	}

}
