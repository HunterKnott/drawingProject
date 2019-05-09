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
	}
	
	public void resetPoint()
	{
		
	}
	
	public void clearImage()
	{
		
	}
	
	public void drawLine(int currentX, int currentY, int width)
	{
		
	}
}
