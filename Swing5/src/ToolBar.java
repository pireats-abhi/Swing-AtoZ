import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBar extends JPanel implements ActionListener {
	private JButton helloBtn;
	private JButton goodByeBtn;

	private TextPanel textPanel;

	public ToolBar() {
		helloBtn = new JButton("Hello");
		goodByeBtn = new JButton("Good Bye");

		helloBtn.addActionListener(this);
		goodByeBtn.addActionListener(this);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		add(helloBtn);
		add(goodByeBtn);
	}

	public void setTextPanel(TextPanel textPanel) {
		this.textPanel = textPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton)e.getSource();
		
		if (clicked == helloBtn) {
			textPanel.appendText("Hello\n");
		}
		else if (clicked == goodByeBtn) {
			textPanel.appendText("Good Bye\n");
		}
	}
}
