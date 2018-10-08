package States;

import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import Backgrounds.Background;
import Profile.Personality;
import Text.Dialogue;

/**
* @author Treagle350
**/

public class AboutState extends State {
	
	private Background bg;
	
	FontMetrics metrics;
	Personality profile;
	
	private BufferedImage left;
	private BufferedImage right;
	
	int currentChoice;
	
	final int DIGESTABLE = 50;
	int size = 0;
	String newLine;

	public AboutState(StateManager sm) {
		
		currentChoice = 0;
		newLine = "                                                   ";
		
		this.sm = sm;
		
		try {
			left  = ImageIO.read(getClass().getResourceAsStream("/Indicators/left.png"));
			right = ImageIO.read(getClass().getResourceAsStream("/Indicators/right.png"));
			bg = new Background(250, 250, 250);
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
		bg.draw(g);
		String title1 = "About the project";
		Dialogue title = new Dialogue(DIGESTABLE, 30, 30, g, 12);
		title.dialogueMaker(title1);
		title.stringPrinter(currentChoice);
		Dialogue page1 = new Dialogue(DIGESTABLE, 30, 50, g, 11);
		String string1 = ("Ok, I know what you're thinking. #ENTER What is this ? An offline personality test ? #ENTER How can this ever produce any accurate results ? #ENTER This is pure madness ! #ENTER"
				+ newLine + "But hold on just a sec.");
		size = page1.dialogueMaker(string1);
		page1.stringPrinter(currentChoice);
		
		g.drawImage(left, (int)5, (int)200, null);
		g.drawImage(right, (int)290, (int)200, null);
	}

	@Override
	public void keyPressed(int k) {
		if(k == KeyEvent.VK_LEFT) {
			currentChoice--;
			if(currentChoice == -1) {
				currentChoice = size - 1;
			}
		}
		if(k == KeyEvent.VK_RIGHT) {
			currentChoice++;
			if(currentChoice == size) {
				currentChoice = 0;
			}
		}
		if(k == KeyEvent.VK_BACK_SPACE) {
			sm.setState(StateManager.MENUSTATE);
		}
	}

}
