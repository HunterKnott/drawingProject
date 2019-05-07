package draw.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Hashtable;
import draw.controller.DrawController;

public class AppPanel extends JPanel
{
	private DrawController app;
	private ArtPanel canvas;
	private SpringLayout panelLayout;
	private JButton redButton;
	private JButton orangeButton;
	private JButton yellowButton;
	private JButton greenButton;
	private JButton blueButton;
	private JButton violetButton;
	private JButton blackButton;
	private JButton mysteryButton;
	
	private JButton clearButton;
	private JButton saveButton;
	private JButton loadButton;
	private JPanel colorPanel;
	private JPanel menuPanel;
	private JScrollPane canvasPane;
	private JSlider widthSlider;
	
	private final int MINIMUM_LINE = 1;
	private final int MAXIMUM_LINE = 25;
	
	public AppPanel(DrawController app)
	{
		super();
		this.app = app;
		this.canvas = new ArtPanel(app);
		canvasPane = new JScrollPane();
		//this.menuPanel = new JPanel(app);
		this.panelLayout = new SpringLayout();
		
		redButton = new JButton("Red");
		orangeButton = new JButton("Orange");
		yellowButton = new JButton("Yellow");
		greenButton = new JButton("Green");
		blueButton = new JButton("Blue");
		violetButton = new JButton("Violet");
		blackButton = new JButton("Black");
		mysteryButton = new JButton("?");
		
		clearButton = new JButton("Clear Panel");
		saveButton = new JButton("Save Panel");
		loadButton = new JButton("Load New Panel");
		widthSlider = new JSlider(MINIMUM_LINE, MAXIMUM_LINE);
		colorPanel = new JPanel(new GridLayout(0, 1));
		menuPanel = new JPanel(new GridLayout(0, 1));
		
		setupMenuPanels();
		setupSlider();
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupMenuPanels()
	{
		colorPanel.setPreferredSize(new Dimension(50, 700));
		menuPanel.setPreferredSize(new Dimension(50, 700));
		
		redButton.setForeground(Color.RED);
		blueButton.setForeground(Color.BLUE);
		yellowButton.setForeground(Color.YELLOW);
		greenButton.setForeground(Color.GREEN);
		orangeButton.setForeground(Color.ORANGE);
		violetButton.setForeground(new Color(75, 0, 130));
		blackButton.setForeground(Color.BLACK);
		mysteryButton.setForeground(Color.BLACK);
		
		colorPanel.add(redButton);
		colorPanel.add(blueButton);
		colorPanel.add(yellowButton);
		colorPanel.add(greenButton);
		colorPanel.add(orangeButton);
		colorPanel.add(violetButton);
		colorPanel.add(blackButton);
		colorPanel.add(mysteryButton);
		
		menuPanel.add(widthSlider);
		menuPanel.add(saveButton);
		menuPanel.add(loadButton);
		menuPanel.add(clearButton);
	}
	
	private void setupSlider()
	{
		Hashtable<Integer, JLabel> scaleLabels = new Hashtable<Integer, JLabel>();
		scaleLabels.put(MINIMUM_LINE, new JLabel("<HTML>Small<BR>Line</HTML>"));
		scaleLabels.put(MAXIMUM_LINE, new JLabel("<HTML>Large<BR>Line</HTML>"));
		widthSlider.setLabelTable(scaleLabels);
		widthSlider.setSnapToTicks(true);
		widthSlider.setMajorTickSpacing(5);
		widthSlider.setMinorTickSpacing(1);
		widthSlider.setPaintTicks(true);
		widthSlider.setPaintLabels(true);
		widthSlider.setValue((MAXIMUM_LINE + MINIMUM_LINE) / 2);
	}
	
	private void setupScrollPane()
	{
		canvasPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		canvasPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		canvasPane.setViewportView(canvas);
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
		panelLayout.putConstraint(SpringLayout.NORTH, colorPanel, 0, SpringLayout.NORTH, canvasPane);
		panelLayout.putConstraint(SpringLayout.SOUTH, colorPanel, 0, SpringLayout.SOUTH, canvasPane);
		panelLayout.putConstraint(SpringLayout.WEST, colorPanel, 50, SpringLayout.EAST, canvasPane);
		panelLayout.putConstraint(SpringLayout.EAST, colorPanel, 0, SpringLayout.WEST, menuPanel);
		
		panelLayout.putConstraint(SpringLayout.WEST, menuPanel, 200, SpringLayout.EAST, canvasPane);
		panelLayout.putConstraint(SpringLayout.SOUTH, menuPanel, 0, SpringLayout.SOUTH, canvasPane);
		panelLayout.putConstraint(SpringLayout.EAST, menuPanel, -50, SpringLayout.EAST, this);
		panelLayout.putConstraint(SpringLayout.NORTH, menuPanel, 0, SpringLayout.NORTH, canvasPane);
		
		panelLayout.putConstraint(SpringLayout.NORTH, canvasPane, 25, SpringLayout.NORTH, this);
		panelLayout.putConstraint(SpringLayout.WEST, canvasPane, 50, SpringLayout.WEST, this);
		panelLayout.putConstraint(SpringLayout.SOUTH, canvasPane, -50, SpringLayout.SOUTH, this);
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
