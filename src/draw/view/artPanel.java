package draw.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import draw.controller.DrawController;

public class ArtPanel extends JPanel
{
	private DrawController app;
	private Color currentColor;
	private BufferedImage currentCanvas;
	private int previousX;
	private int previousY;
	
	public ArtPanel(DrawController app)
	{
		super();
		this.app = app;
		this.currentCanvas = new BufferedImage(700, 700, BufferedImage.TYPE_INT_ARGB);
		setupPanel();
		resetPoint();
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(currentCanvas, 0, 0, null);
	}
	
	public void resetPoint()
	{
		previousX = Integer.MIN_VALUE;
		previousY = Integer.MIN_VALUE;
	}
	
	public void clearImage()
	{
		
	}
	
	public void drawLine(int currentX, int currentY, int width)
	{
		
	}
}
