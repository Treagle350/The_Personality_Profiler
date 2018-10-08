package Backgrounds;

import java.awt.Color;
import java.awt.Graphics2D;

public class Background {
	
	int x, y;
	
	Color back;
	
	Animations animation;
	
	public Background(int R, int G, int B) {
		this.x = 0;
		this.y = 0;
		
		back = new Color(R, G, B);
	}
	
	public void draw(Graphics2D g) {
		g.setColor(back);
		g.fillRect(0, 0, 320, 240);
		//animation = new Animations(g);
	}

}
