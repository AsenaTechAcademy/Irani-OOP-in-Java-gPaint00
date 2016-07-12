package gPaint00;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBox extends JPanel
{
	JButton btns[] = new JButton[100];
	private DrawPanel draw;
	
	public ToolBox(DrawPanel draw)
	{
		super();
		
		this.draw = draw;
		
		setOpaque(true);
		setBackground(Color.yellow);
		setPreferredSize(new Dimension(100, GMain.gHeight - 20));
		this.setLayout(new FlowLayout());
		
		for (int i = 0; i < 10; i++)
		{
			btns[i] = new JButton();
			btns[i].setFont(new Font("tahoma", 1, 9));
			btns[i].setPreferredSize(new Dimension(95, 30));
			btns[i].setOpaque(true);
			btns[i].setBackground(Color.red);
		}
		
		btns[0].setText("Clear");
		btns[0].addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				draw.Clear();
			}
		});
		this.add(btns[0]);
		
		btns[1].setText("UndoClear");
		btns[1].addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				draw.UndoClear();
			}
		});
		this.add(btns[1]);
		
		
		btns[2].setText("ClearLast");
		btns[2].addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				draw.ClearLast();
			}
		});
		this.add(btns[2]);
		
		btns[3].setText("UndoLast");
		btns[3].addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				draw.UndoLast();
			}
		});
		this.add(btns[3]);
		
		
		btns[4].setText("Line");
		btns[4].addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				draw.SetShapeTools(ShapeTools.Line);
			}
		});
		this.add(btns[4]);
		
		
		btns[5].setText("Rect");
		btns[5].addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				draw.SetShapeTools(ShapeTools.Rect);
			}
		});
		this.add(btns[5]);
		
		
		
		btns[6].setText("Oval");
		btns[6].addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				draw.SetShapeTools(ShapeTools.Oval);
			}
		});
		this.add(btns[6]);
		
		
		
		btns[7].setText("Pencil");
		btns[7].addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				draw.SetShapeTools(ShapeTools.Pencil);
			}
		});
		this.add(btns[7]);
		
	}
}
