package draw.view;

import javax.swing.*;
import draw.controller.DrawController;

public class AppPanel extends JPanel
{
	private DrawController app;
	
	public AppPanel(DrawController app)
	{
		super();
		this.app = app;
	}
}
