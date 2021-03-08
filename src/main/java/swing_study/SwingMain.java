package swing_study;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import swing_study.component.CheckboxCostom;
import swing_study.component.FrameComponentEx;
import swing_study.component.Fruit;
import swing_study.component.JButtonEx;
import swing_study.component.JCheckboxX;
import swing_study.component.JComboBoxEx1;
import swing_study.component.JComboBoxEx2;
import swing_study.component.JComboBoxEx3;
import swing_study.component.JLableEx;
import swing_study.component.JListEx;
import swing_study.component.JListEx2;
import swing_study.component.JListEx3;
import swing_study.component.JRadioButtonEx;
import swing_study.component.JSliderEx;
import swing_study.component.JSpinnerEx;
import swing_study.component.JTabbedPaneEx;
import swing_study.component.JTextFieldArialEx;
import swing_study.frame.ContentPaneEx;
import swing_study.frame.JPanelEx;
import swing_study.layout.FrameLayout;
import swing_study.layout.LayoutGuBun;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

@SuppressWarnings({ "serial", "unused" })
public class SwingMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn01;
	private JButton btn02;
	private JPanel pLayout;
	private JButton btnFlowLayout;
	private JButton btnBorderLayout;
	private JButton btnGridLayout;
	private JButton btnAbsoluteLayout;
	private JButton btn03;
	private JPanel panel;
	private JButton btn4;
	private JButton btn5;
	private JPanel panel_1;
	private JButton btn6;
	private JButton btn7;
	private JPanel panelText;
	private JButton btn8;
	private JPanel panelList;
	private JButton btn10;
	private JButton btn9;
	private JButton btn11;
	private JPanel panel_2;
	private JButton btn12;
	private JButton btn14;
	private JButton btn13;
	private JPanel pSliderSpinner;
	private JPanel pSlider;
	private JPanel pSpinner;
	private JButton btn15;
	private JButton btn16;
	private JPanel panel_3;
	private JButton btn17;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingMain frame = new SwingMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SwingMain() {
		initialize();
	}

	private void initialize() {
		setTitle("스윙 스터티");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(10, 10, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 5, 10, 10));// 행, 열, 수평갭, 수직갭

		btn01 = new JButton("Jframe 예");
		btn01.addActionListener(this); // actionperformed를 JFrame에서 해결하도록 작성
		contentPane.add(btn01);

		btn02 = new JButton("Jpanel 예");
		btn02.addActionListener(this);
		contentPane.add(btn02);

		pLayout = new JPanel();
		pLayout.setToolTipText("Layout");
		contentPane.add(pLayout);
		pLayout.setLayout(new GridLayout(0, 1, 0, 10));

		btnFlowLayout = new JButton("Flow");
		btnFlowLayout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameLayout frame = new FrameLayout(LayoutGuBun.FLOW);
				frame.setVisible(true);
			}
		});
//		btnFlowLayout.addActionListener(e -> new FrameLayout(LayoutGuBun.FLOW));

		pLayout.add(btnFlowLayout);

		btnBorderLayout = new JButton("Border");
		btnBorderLayout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameLayout frame = new FrameLayout(LayoutGuBun.BORDER);
				frame.setVisible(true);
			}
		});
		pLayout.add(btnBorderLayout);

		btnGridLayout = new JButton("Grid");
		btnGridLayout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameLayout frame = new FrameLayout(LayoutGuBun.GRID);
				frame.setVisible(true);
			}
		});
		pLayout.add(btnGridLayout);

		btnAbsoluteLayout = new JButton("Absolute");
		btnAbsoluteLayout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameLayout frame = new FrameLayout(LayoutGuBun.ABSOLUTE);
				frame.setVisible(true);
			}
		});
		pLayout.add(btnAbsoluteLayout);

		btn03 = new JButton("New button");
		btn03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameComponentEx frame = new FrameComponentEx();
				frame.setVisible(true);
			}
		});
		contentPane.add(btn03);

		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Jlable", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 10));

		btn4 = new JButton("Jlable");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLableEx frame = new JLableEx();
				frame.setVisible(true);
			}
		});
		panel.add(btn4);

		btn5 = new JButton("JButton");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButtonEx frame = new JButtonEx();
				frame.setVisible(true);
			}
		});
		panel.add(btn5);

		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "CheckBox", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setToolTipText("");
		contentPane.add(panel_1);

		btn6 = new JButton("check");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckboxX frame = new JCheckboxX();
				frame.setVisible(true);

			}
		});
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		panel_1.add(btn6);
		
		btn7 = new JButton("radio button");
		btn7.addActionListener(this);
		panel_1.add(btn7);
		
		panelText = new JPanel();
		panelText.setBorder(new TitledBorder(null, "TextField", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panelText);
		panelText.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btn8 = new JButton("textfield");
		btn8.addActionListener(this);
		panelText.add(btn8);
		
		panelList = new JPanel();
		panelList.setBorder(new TitledBorder(null, "JList", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panelList);
		panelList.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn9 = new JButton("JList1");
		btn9.addActionListener(this);
		panelList.add(btn9);
		
		btn10 = new JButton("JList2");
		btn10.addActionListener(this);
		panelList.add(btn10);
		
		btn11 = new JButton("JList3");
		btn11.addActionListener(this);
		panelList.add(btn11);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Combo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 5));
		
		btn12 = new JButton("JCombo Ex1");
		btn12.addActionListener(this);
		panel_2.add(btn12);
		
		btn13 = new JButton("JCombo Ex2");
		btn13.addActionListener(this);
		panel_2.add(btn13);
		
		btn14 = new JButton("JCombo Ex3");
		btn14.addActionListener(this);
		panel_2.add(btn14);
		
		pSliderSpinner = new JPanel();
		contentPane.add(pSliderSpinner);
		pSliderSpinner.setLayout(new GridLayout(0, 1, 0, 0));
		
		pSlider = new JPanel();
		pSlider.setBorder(new TitledBorder(null, "Slider", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pSliderSpinner.add(pSlider);
		pSlider.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn15 = new JButton("JSlider Ex");
		btn15.addActionListener(this);
		pSlider.add(btn15);
		
		pSpinner = new JPanel();
		pSpinner.setBorder(new TitledBorder(null, "Spinner", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pSliderSpinner.add(pSpinner);
		pSpinner.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn16 = new JButton("JSpinner Ex");
		btn16.addActionListener(this);
		pSpinner.add(btn16);
		
		panel_3 = new JPanel();
		contentPane.add(panel_3);
		
		btn17 = new JButton("TabbedPane");
		btn17.addActionListener(this);
		panel_3.add(btn17);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn17) {
			actionPerformedBtn17(e);
		}
		if (e.getSource() == btn16) {
			actionPerformedBtn16(e);
		}
		if (e.getSource() == btn15) {
			actionPerformedBtn15(e);
		}
		if (e.getSource() == btn14) {
			actionPerformedBtn14(e);
		}
		if (e.getSource() == btn13) {
			actionPerformedBtn13(e);
		}
		if (e.getSource() == btn12) {
			actionPerformedBtn12(e);
		}
		if (e.getSource() == btn11) {
			actionPerformedBtn11(e);
		}
		if (e.getSource() == btn10) {
			actionPerformedBtn10(e);
		}
		if (e.getSource() == btn9) {
			actionPerformedBtn9(e);
		}
		if (e.getSource() == btn8) {
			actionPerformedBtn8(e);
		}
		if (e.getSource() == btn7) {
			actionPerformedBtn7(e);
		}
		if (e.getSource() == btn02) {
			actionPerformedBtn02(e);
		}
		if (e.getSource() == btn01) {
			actionPerformedBtn01(e);
		}
	}

	protected void actionPerformedBtn01(ActionEvent e) {
		ContentPaneEx frame = new ContentPaneEx();
		frame.setVisible(true);
	}

	protected void actionPerformedBtn02(ActionEvent e) {
		JPanelEx frame = new JPanelEx();
		frame.setVisible(true);
	}
	
	protected void actionPerformedBtn7(ActionEvent e) {
		JRadioButtonEx frame = new JRadioButtonEx();
		frame.setVisible(true);
	}
	
	protected void actionPerformedBtn8(ActionEvent e) {
		JTextFieldArialEx frame = new JTextFieldArialEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn9(ActionEvent e) {
		JListEx frame = new JListEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn10(ActionEvent e) {
		JListEx2 frame = new JListEx2();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn11(ActionEvent e) {
		JListEx3 frame = new JListEx3();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn12(ActionEvent e) {
		JComboBoxEx1 frame = new JComboBoxEx1();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn13(ActionEvent e) {
		JComboBoxEx2 frame = new JComboBoxEx2();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn14(ActionEvent e) {
		JComboBoxEx3 frame = new JComboBoxEx3();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn15(ActionEvent e) {
		JSliderEx frame = new JSliderEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn16(ActionEvent e) {
		JSpinnerEx frame = new JSpinnerEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn17(ActionEvent e) {
		JTabbedPaneEx frame = new JTabbedPaneEx();
		frame.setVisible(true);
	}
}
