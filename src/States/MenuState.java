package States;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import Backgrounds.Background;

/**
* @author Treagle350
**/

public class MenuState extends State{
	
private Background bg;
	
	private int currentChoice;
	private String[] options = {
			"Test",
			"Theory",
			"Profiles",
			"About",
			"Quit"
	};
	
	private Color titleColor;
	private Font titleFont;
	private Font font;
	private Font subFont;
	
	FontMetrics metrics;
	FontMetrics submetrics;
	FontMetrics metricsTitle;
	
	public MenuState(StateManager sm) {
		this.sm = sm;
		
		try {
			bg = new Background(250, 250, 250);
			
			titleColor = new Color(228, 0, 0);
			titleFont = new Font("Century Gothic", Font.PLAIN, 28);
		
			font = new Font("Arial", Font.PLAIN, 12);
			subFont = new Font("Arial", Font.PLAIN, 9);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		bg.draw(g);
		
		g.setColor(titleColor);
		g.setFont(titleFont);
		metricsTitle = g.getFontMetrics(titleFont);
		String string = "The Personality Profiler";
		g.drawString(string, 160 - (metricsTitle.stringWidth(string)/2), 70);
		
		g.setFont(font);
		for(int i = 0; i < options.length; i++) {
			if(i == currentChoice) {
				g.setColor(Color.BLACK);
			}
			else {
				g.setColor(Color.RED);
			}
			metrics = g.getFontMetrics(font);
			g.drawString(options[i], 160 - (metrics.stringWidth(options[i])/2), 120 + i * 15);
		}
		submetrics = g.getFontMetrics(subFont);
		g.setFont(subFont);
		g.setColor(Color.RED);
		String author = "Created by Treagle350";
		g.drawString(author, 160 - (submetrics.stringWidth(author)/2), 210);
		g.drawString("Disclaimer : All information provided by this program is licensed under", 10, 220);
		g.drawString("the Creative Commons Attribution-ShareAlike 4.0 International License.", 10, 230);
	}
	
	private void select() {
		if(currentChoice == 0) {
			sm.setState(StateManager.QUIZSTATE);
		}
		if(currentChoice == 1) {
			sm.setState(StateManager.THEORYSTATE);
		}
		if(currentChoice == 2) {
			sm.setState(StateManager.PROFILESTATE);
		}
		if(currentChoice == 4) {
			sm.setState(StateManager.ABOUTSTATE);
		}
		if(currentChoice == 5) {
			System.exit(0);
		}
	}
	
	public void keyPressed(int k) {
		if(k == KeyEvent.VK_ENTER) {
			select();
		}
		if(k == KeyEvent.VK_UP) {
			currentChoice--;
			if(currentChoice == -1) {
				currentChoice = options.length - 1;
			}
		}
		if(k == KeyEvent.VK_DOWN) {
			currentChoice++;
			if(currentChoice == options.length) {
				currentChoice = 0;
			}
		}
	}
}
