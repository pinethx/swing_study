package swing_study.component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swing_study.panel.Department;
import swing_study.panel.DeptPanel;
import javax.swing.border.TitledBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.ListSelectionModel;

@SuppressWarnings("serial")
public class JListEx3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnAdd;
	private DeptPanel pLeftCenter;
	private DefaultListModel<Department> model;
	private JList<Department> deptList;
	private JPanel pBtn;
	private JButton btnConfirm;
	private JButton btnEdit;
	private JButton btnDelete;

	public JListEx3() {
		initialize();

		model.addElement(new Department(1, "기획", 8));
		model.addElement(new Department(2, "영업", 18));
		model.addElement(new Department(3, "개발", 28));
	}

	private void initialize() {
		setTitle("JList Exercise");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel pLeft = new JPanel();
		pLeft.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.add(pLeft);
		pLeft.setLayout(new BorderLayout(0, 0));

		pLeftCenter = new DeptPanel();
		pLeft.add(pLeftCenter, BorderLayout.CENTER);

		JPanel pLeftSouth = new JPanel();
		pLeft.add(pLeftSouth, BorderLayout.SOUTH);

		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pLeftSouth.add(btnAdd);

		JPanel pRight = new JPanel();
		pRight.setBorder(
				new TitledBorder(null, "\uBD80\uC11C\uBAA9\uB85D", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pRight);

		deptList = new JList<>();
		deptList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		model = new DefaultListModel<Department>();
		pRight.setLayout(new BorderLayout(0, 0));
		deptList.setModel(model);
		pRight.add(deptList);

		pBtn = new JPanel();
		pRight.add(pBtn, BorderLayout.SOUTH);
		pBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(this);
		pBtn.add(btnConfirm);

		btnEdit = new JButton("수정");
		btnEdit.addActionListener(this);
		pBtn.add(btnEdit);

		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(this);
		pBtn.add(btnDelete);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnDelete) {
			actionPerformedBtnDelete(e);
		}
		if (e.getSource() == btnEdit) {
			actionPerformedBtnEdit(e);
		}
		if (e.getSource() == btnConfirm) {
			actionPerformedBtnConfirm(e);
		}
		if (e.getSource() == btnAdd) {
			if (btnAdd.getText().equals("추가")) {
				actionPerformedBtnAdd(e);
			} else {
				actionPerformedUpdate(e);
			}
		}
	}

	private void actionPerformedUpdate(ActionEvent e) {
		int idx = deptList.getSelectedIndex();
		Department dept = pLeftCenter.getDepartment();
		model.removeElementAt(idx);
		model.add(idx, dept);
		btnAdd.setText("추가");	
		pLeftCenter.clearTf();
	}

	protected void actionPerformedBtnAdd(ActionEvent e) {
		Department dept = pLeftCenter.getDepartment();
//		JOptionPane.showMessageDialog(null, pLeftCenter.getDepartment());

		pLeftCenter.clearTf();
		model.addElement(dept);
	}

	protected void actionPerformedBtnConfirm(ActionEvent e) {
		Department dept = deptList.getSelectedValue();
		String message = String.format("%d %s %d", dept.getDeptNo(), dept.getDeptName(), dept.getFloor());
		JOptionPane.showMessageDialog(null, message);
	}

	protected void actionPerformedBtnEdit(ActionEvent e) {
		Department dept = deptList.getSelectedValue();
		pLeftCenter.setDepartment(dept);
		btnAdd.setText("수정");
	}

	protected void actionPerformedBtnDelete(ActionEvent e) {
		int idx = deptList.getSelectedIndex();
		model.removeElementAt(idx);
	}
}
