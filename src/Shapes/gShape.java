package Shapes;

import java.awt.Color;
import java.awt.Graphics;

public abstract class gShape
{
	private Color bordercolor;
	private int width;
	private int dashtype;
	
	public void Draw(Graphics g)
	{
		
	}
	
	
	
	public Color getBordercolor()
	{
		return bordercolor;
	}
	
	public void setBordercolor(Color bordercolor)
	{
		this.bordercolor = bordercolor;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public int getDashtype()
	{
		return dashtype;
	}
	
	public void setDashtype(int dashtype)
	{
		this.dashtype = dashtype;
	}
	
}
