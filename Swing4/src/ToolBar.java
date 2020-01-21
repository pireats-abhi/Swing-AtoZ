import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBar extends JPanel {
	private JButton helloBtn;
	private JButton goodByeBtn;

	public ToolBar() {
		helloBtn = new JButton("Hello");
		goodByeBtn = new JButton("Good Bye");

		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloBtn);
		add(goodByeBtn);
	}
}
