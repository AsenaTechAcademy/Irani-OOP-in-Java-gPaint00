package Shapes;

import java.awt.Color;
import java.awt.Graphics;

public class gRectShape extends g2Shape
{
	private Boolean isFilled;
	private Color backcolor;
	
	public void Draw(Graphics g)
	{
		
	}
	
	
	
	public Boolean getIsFilled()
	{
		return isFilled;
	}
	
	public void setIsFilled(Boolean isFilled)
	{
		this.isFilled = isFilled;
	}
	
	public Color getBackcolor()
	{
		return backcolor;
	}
	
	public void setBackcolor(Color backcolor)
	{
		this.backcolor = backcolor;
	}
	
	
	
}
