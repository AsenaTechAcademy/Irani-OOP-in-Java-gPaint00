package gPaint00;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class GMain extends JFrame
{
	public static final int gWidth = 800;
	public static final int gHeight = 500;
	
	private ToolBox tools;
	private InfoPanel info;
	private DrawPanel draw;
	
	public GMain()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, gWidth, gHeight);
		this.setTitle("gPaint00");
		this.setLayout(new FlowLayout());
		
		/////////////////////////// TOOLS
		info = new InfoPanel();
		draw = new DrawPanel(info);
		tools = new ToolBox(draw);
		
		
		this.add(tools);
		this.add(draw);
		this.add(info);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args)
	{
		new GMain();
	}// end of Main
}//end of class
