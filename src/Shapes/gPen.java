package Shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class gPen extends gShape
{
	public Point points[] = new Point[1000];
	public int cPoints;
	
	
	public gPen(Color bordercolor, int width, int dashtype)
	{
		cPoints = 0;
		setBordercolor(bordercolor);
		setWidth(width);
		setDashtype(dashtype);
	}
	
	public void Draw(Graphics g)
	{
		g.setColor(Color.white);
		for (int i = 0; i < cPoints - 1; i++)
			g.drawLine(points[i].x, points[i].y, points[i + 1].x,
					points[i + 1].y);
		
	}
	
	
	public void setNextPoint(Point p)
	{
		points[cPoints++] = new Point(p);
	}
	
}
