package swing_study.component;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class JListEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private String imgPath = System.getProperty("user.dir") + File.separator + "images" + File.separator;
	private ImageIcon[] icons = {
			new ImageIcon(imgPath + "home.png"),
			new ImageIcon(imgPath + "search.png"),
			new ImageIcon(imgPath + "wifi.png"),
			new ImageIcon(imgPath + "key.png")};
	private String[] fruits = new String[] {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	private JButton btnX;
	private JList<String> strList;

	public JListEx() {
		initialize();
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 10, 0));
		
		strList = new JList<>();
		strList.setListData(fruits);
		contentPane.add(strList);
		
		JList <ImageIcon> list = new JList<>();
		list.setListData(icons);
		contentPane.add(list);
		
		JPanel pBtn = new JPanel();
		contentPane.add(pBtn);
		
		btnX = new JButton("확인");
		btnX.addActionListener(this);
		pBtn.add(btnX);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnX) {
			actionPerformedBtnX(e);
		}
	}
	protected void actionPerformedBtnX(ActionEvent e) {
		int idx = strList.getSelectedIndex();
		String selStr = strList.getSelectedValue();
		List <String> selectedList = strList.getSelectedValuesList();
		
		String msg = String.format("index : %d%n selectedValue %s%n selectedList %s", idx, selStr, selectedList);
		JOptionPane.showMessageDialog(null, msg);
	}
}
