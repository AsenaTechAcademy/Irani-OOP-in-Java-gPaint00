package gPaint00;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;

import Shapes.gLine;
import Shapes.gOval;
import Shapes.gPen;
import Shapes.gRect;
import Shapes.gShape;

public class DrawPanel extends JComponent implements MouseMotionListener,
		MouseListener
{
	
	gShape x = null;
	
	private InfoPanel info;
	private int ShapeType = ShapeTools.Line;
	
	
	private gShape shapes[] = new gShape[1000];
	private int cShapesALL = 0;
	private int cShapes = 0;
	
	
	
	private int x1, y1;
	
	public DrawPanel(InfoPanel info)
	{
		super();
		setPreferredSize(new Dimension(GMain.gWidth - 270, GMain.gHeight - 20));
		this.info = info;
		this.addMouseMotionListener(this);
		this.addMouseListener(this);
	}
	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);//vital
		
		Graphics2D g2 = (Graphics2D) g;
		
		gInitialize(g);
		
		
		for (int i = 0; i < cShapes; i++)
		{
			shapes[i].Draw(g);
		}
		
	}
	
	public void SetShapeTools(int tNO)
	{
		this.ShapeType = tNO;
	}
	
	
	public void Clear()
	{
		cShapes = 0;
		repaint();
	}
	
	public void UndoClear()
	{
		cShapes = cShapesALL;
		repaint();
	}
	
	public void ClearLast()
	{
		if (cShapes > 0)
			cShapes--;
		repaint();
	}
	
	public void UndoLast()
	{
		if (cShapes < cShapesALL)
			cShapes++;
		repaint();
	}
	
	
	private void gInitialize(Graphics g)
	{
		g.setColor(new Color(0, 0, 0));
		g.fillRect(1, 1, getWidth() - 2, getHeight() - 2);
		
		g.setColor(Color.red);
		g.drawRect(1, 1, getWidth() - 2, getHeight() - 2);
	}
	
	
	@Override
	public void mouseDragged(MouseEvent e)
	{
		info.setInfo("(x,y): (" + e.getX() + "," + e.getY() + ")", 0);
		
		if (ShapeType == ShapeTools.Pencil)
		{
			((gPen) shapes[cShapes - 1]).setNextPoint(new Point(e.getX(), e
					.getY()));
			repaint();
		}
	}
	
	
	@Override
	public void mouseMoved(MouseEvent e)
	{
		info.setInfo("(x,y): (" + e.getX() + "," + e.getY() + ")", 0);
		
		
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		info.setInfo("(x1,y1): (" + e.getX() + "," + e.getY() + ")", 1);
		x1 = e.getX();
		y1 = e.getY();
		
		if (ShapeType == ShapeTools.Pencil)
		{
			if (ShapeType == ShapeTools.Pencil)
				x = new gPen(Color.white, 1, 1);
			
			
			((gPen) x).setNextPoint(new Point(e.getX(), e.getY()));
			shapes[cShapes++] = x;
			cShapesALL++;
			//cPPP++;
		}
	}
	
	@Override
	public void mouseReleased(MouseEvent e)
	{
		info.setInfo("(x2,y2): (" + e.getX() + "," + e.getY() + ")", 2);
		
		
		
		if (ShapeType == ShapeTools.Line)
			x = new gLine(x1, y1, e.getX(), e.getY(), 1, Color.blue, 1);
		
		if (ShapeType == ShapeTools.Rect)
			x = new gRect(x1, y1, e.getX(), e.getY(), 1, Color.blue, 1, true,
					Color.red);
		
		if (ShapeType == ShapeTools.Oval)
			x = new gOval(x1, y1, e.getX(), e.getY(), 1, Color.blue, 1, true,
					Color.red);
		
		if (ShapeType != ShapeTools.Pencil)
		{
			shapes[cShapes++] = x;
			cShapesALL++;
		}
		
		this.repaint();
	}
	
	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	
}
