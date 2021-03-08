package swing_study.component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class JListEx2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tFValue;
	private JList<String> namelist1;
	private ArrayList<String> stdList = new ArrayList<>();
	private JList namelist2;

	public JListEx2() {
		stdList.add("김인환");
		stdList.add("이태훈");
		stdList.add("김상건");
		stdList.add("전수린");
		initialize();
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel pNorth = new JPanel();
		contentPane.add(pNorth, BorderLayout.NORTH);

		JLabel lblTitle = new JLabel("입력 후 엔터");
		pNorth.add(lblTitle);

		tFValue = new JTextField();
		tFValue.addActionListener(this);
		pNorth.add(tFValue);
		tFValue.setColumns(10);

		JPanel pList = new JPanel();
		pList.setBorder(new EmptyBorder(0, 100, 0, 100));
		contentPane.add(pList, BorderLayout.CENTER);
		pList.setLayout(new GridLayout(0, 2, 0, 0));

		JScrollPane scrollPane = new JScrollPane();
		pList.add(scrollPane);

		namelist1 = new JList();

		namelist1.setListData(new Vector<String>(stdList));
		namelist1.setVisibleRowCount(5);
		scrollPane.setViewportView(namelist1);

		JScrollPane scrollPane_1 = new JScrollPane();
		pList.add(scrollPane_1);

		namelist2 = new JList();
		namelist2.setModel(getModel(stdList));
		scrollPane_1.setViewportView(namelist2);
	}

	private ListModel<String> getModel(List<String> stdList) {
		DefaultListModel<String> model = new DefaultListModel<>();
		for (String e : stdList) {
			model.addElement(e);
		}
		return model;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tFValue) {
			actionPerformedTFValue(e);
		}
	}

	protected void actionPerformedTFValue(ActionEvent e) {
		String value = tFValue.getText().trim();

		stdList.add(value);
		namelist1.setListData(new Vector<String>(stdList));
		tFValue.setText("");
		tFValue.requestFocus();
		
		DefaultListModel<String> model = (DefaultListModel<String>) namelist2.getModel();
		model.addElement(value);
	}
}
