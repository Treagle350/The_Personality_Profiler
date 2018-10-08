package Backgrounds;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Animations implements ActionListener {
	
	Timer timer;
	Graphics2D g;
	boolean toggle;
	Color c1;
	Color c2;
	
	public Animations(Graphics2D g) {
		this.g = g;
		timer = new Timer(100, this);
		timer.start();
		toggle = true;
		
		c1 = new Color(200,200,200);
		c2 = new Color(0,0,0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		blinkOption(0,0,10,10);
	}
	
	private void blinkOption(int x1, int y1, int x2, int y2) {
		if(toggle) {
			g.setColor(c1);
		}else {
			g.setColor(c2);
		}
		g.fillRect(x1, y1, x2, y2);
		toggle =! toggle;
	}
}
