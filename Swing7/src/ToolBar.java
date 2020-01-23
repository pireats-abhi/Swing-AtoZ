import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBar extends JPanel implements ActionListener {
	private JButton helloBtn;
	private JButton goodByeBtn;

	private StringListener textListener;

	public ToolBar() {
		setBorder(BorderFactory.createEtchedBorder());
		
		helloBtn = new JButton("Hello");
		goodByeBtn = new JButton("Good Bye");

		helloBtn.addActionListener(this);
		goodByeBtn.addActionListener(this);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		add(helloBtn);
		add(goodByeBtn);
	}

	public void setStringListener(StringListener listener) {
		this.textListener = listener;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton)e.getSource();
		
		if (clicked == helloBtn) {
			if(textListener != null) {
				textListener.textEmitted("Hello\n");
			}
		}
		else if (clicked == goodByeBtn) {
			if(textListener != null) {
				textListener.textEmitted("Good Bye\n");
			}
		}
	}
}
