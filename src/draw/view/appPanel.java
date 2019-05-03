package draw.view;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import draw.controller.DrawController;

public class AppPanel extends JPanel
{
	private DrawController app;
	private SpringLayout panelLayout;
	
	private JButton redButton;
	private JButton orangeButton;
	private JButton yellowButton;
	private JButton greenButton;
	private JButton blueButton;
	private JButton violetButton;
	private JButton mysteryButton;
	
	private JPanel colorPanel;
	
	public AppPanel(DrawController app)
	{
		super();
		this.app = app;
		this.panelLayout = new SpringLayout();
		
		redButton = new JButton("Red");
		orangeButton = new JButton("Orange");
		yellowButton = new JButton("Yellow");
		greenButton = new JButton("Green");
		blueButton = new JButton("Blue");
		violetButton = new JButton("Violet");
		mysteryButton = new JButton("?");
		
		colorPanel = new JPanel(new GridLayout(0, 1));
		
		setupMenuPanels();
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupMenuPanels()
	{
		
	}
	
	private void setupScrollPane()
	{
		
	}
	
	private void setupPanel()
	{
		this.add(redButton);
		this.add(orangeButton);
		this.add(yellowButton);
		this.add(greenButton);
		this.add(blueButton);
		this.add(violetButton);
		this.add(mysteryButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		redButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				
			}
		});
		
		orangeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				
			}
		});
		
		yellowButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				
			}
		});
		
		greenButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				
			}
		});
		
		blueButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				
			}
		});
		
		violetButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				
			}
		});
		
		mysteryButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				
			}
		});
	}
}
