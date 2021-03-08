package swing_study.component;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class MyButton extends JButton {

	private String imgpath = System.getProperty("user.dir") + File.separator + "images" + File.separator;

	public MyButton () {
		setIcon(new ImageIcon(imgpath+"3.gif"));
		setRolloverIcon(new ImageIcon(imgpath+"5.gif"));
		setPressedIcon(new ImageIcon(imgpath+"4.gif"));
	}
}
