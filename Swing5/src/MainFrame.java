import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private TextPanel textPanel;
	private ToolBar toolBar;

	public MainFrame() {
		super("Hello World");
		setLayout(new BorderLayout());

		textPanel = new TextPanel();
		toolBar = new ToolBar();

		toolBar.setTextPanel(textPanel);

		add(toolBar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
