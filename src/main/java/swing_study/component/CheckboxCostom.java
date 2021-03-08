package swing_study.component;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class CheckboxCostom extends JFrame {

	private JPanel contentPane;
	private ArrayList<Fruit> list;

	public CheckboxCostom(ArrayList<Fruit> list) {
		this.list = list;
		initialize();
		list.forEach(s -> System.out.println(s));
	}

	private void initialize() {
		setTitle("실전 checkbox");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
}
