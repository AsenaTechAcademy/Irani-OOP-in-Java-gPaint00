package Shapes;

import java.awt.Color;
import java.awt.Graphics;

public class gLine extends g2Shape
{
	public gLine(int x1, int y1, int x2, int y2, int width, Color bordercolor,
			int dashtype)
	{
		this.setX1(x1);
		this.setY1(y1);
		this.setX2(x2);
		this.setY2(y2);
		this.setWidth(width);
		this.setDashtype(dashtype);
		this.setBordercolor(bordercolor);
		
	}
	
	
	public void Draw(Graphics g)
	{
		g.setColor(this.getBordercolor());
		g.drawLine(getX1(), getY1(), getX2(), getY2());
	}
}
