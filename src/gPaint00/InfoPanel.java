package gPaint00;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InfoPanel extends JPanel
{
	private JLabel infos[];
	
	public InfoPanel()
	{
		super();
		setOpaque(true);
		setBackground(Color.green);
		setPreferredSize(new Dimension(150, GMain.gHeight - 20));
		this.setLayout(new FlowLayout());
		
		
		infos = new JLabel[10];
		for (int i = 0; i < 10; i++)
		{
			infos[i] = new JLabel();
			infos[i].setFont(new Font("tahoma", 1, 12));
			infos[i].setPreferredSize(new Dimension(145, 30));
			infos[i].setOpaque(true);
			infos[i].setBackground(Color.red);
			this.add(infos[i]);
		}
	}
	
	
	public void setInfo(String s, int i)
	{
		infos[i].setText(s);
	}
	
	
}
