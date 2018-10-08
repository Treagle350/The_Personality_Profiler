package States;

import java.awt.Font;
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

public class ProfileState extends State {
	
	private Background bg;
	
	FontMetrics metrics;
	Personality profile;
	
	private BufferedImage left;
	private BufferedImage right;
	
	private Font font;
	
	int currentChoice;
	
	final int DIGESTABLE = 50;
	int size = 0;
	String newLine;

	public ProfileState(StateManager sm) {
		
		currentChoice = 0;
		newLine = "                                                   ";
		
		this.sm = sm;
		
		try {
			font = new Font("Arial", Font.PLAIN, 12);
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

	/*
	The textual information found in this section of the software, issued to represent the actual
	theory upon which the software was created, will henceforth be referenced as this work.
	
	This work is licensed under the Creative Commons Attribution-ShareAlike 4.0 International License. 
	To view a copy of this license, visit http://creativecommons.org/licenses/by-sa/4.0/.
	*/
	
	@Override
	public void draw(Graphics2D g) {
		bg.draw(g);
		String title1a = "Aggressive Centered INTP";
		String title1b = "Optimism Centered INTP";
		String title1c = "Love Centered INTP";
		String title1d = "Submission Centered INTP";
		String title1e = "Awe Centered INTP";
		String title1f = "Disapproval Centered INTP";
		String title1g = "Remorse Centered INTP";
		String title1h = "Contempt Centered INTP";
		
		String title2a = "Aggressive Centered INTJ";
		String title2b = "Optimism Centered INTJ";
		String title2c = "Love Centered INTJ";
		String title2d = "Submission Centered INTJ";
		String title2e = "Awe Centered INTJ";
		String title2f = "Disapproval Centered INTJ";
		String title2g = "Remorse Centered INTJ";
		String title2h = "Contempt Centered INTJ";
		
		String title3a = "Aggressive Centered ENTJ";
		String title3b = "Optimism Centered ENTJ";
		String title3c = "Love Centered ENTJ";
		String title3d = "Submission Centered ENTJ";
		String title3e = "Awe Centered ENTJ";
		String title3f = "Disapproval Centered ENTJ";
		String title3g = "Remorse Centered ENTJ";
		String title3h = "Contempt Centered ENTJ";
		
		String title4a = "Aggressive Centered ENTP";
		String title4b = "Optimism Centered ENTP";
		String title4c = "Love Centered ENTP";
		String title4d = "Submission Centered ENTP";
		String title4e = "Awe Centered ENTP";
		String title4f = "Disapproval Centered ENTP";
		String title4g = "Remorse Centered ENTP";
		String title4h = "Contempt Centered ENTP";
		
		String title5a = "Aggressive Centered ISTP";
		String title5b = "Optimism Centered ISTP";
		String title5c = "Love Centered ISTP";
		String title5d = "Submission Centered ISTP";
		String title5e = "Awe Centered ISTP";
		String title5f = "Disapproval Centered ISTP";
		String title5g = "Remorse Centered ISTP";
		String title5h = "Contempt Centered ISTP";
		
		String title6a = "Aggressive Centered ISTJ";
		String title6b = "Optimism Centered ISTJ";
		String title6c = "Love Centered ISTJ";
		String title6d = "Submission Centered ISTJ";
		String title6e = "Awe Centered ISTJ";
		String title6f = "Disapproval Centered ISTJ";
		String title6g = "Remorse Centered ISTJ";
		String title6h = "Contempt Centered ISTJ";
		
		String title7a = "Aggressive Centered ESTJ";
		String title7b = "Optimism Centered ESTJ";
		String title7c = "Love Centered ESTJ";
		String title7d = "Submission Centered ESTJ";
		String title7e = "Awe Centered ESTJ";
		String title7f = "Disapproval Centered ESTJ";
		String title7g = "Remorse Centered ESTJ";
		String title7h = "Contempt Centered ESTJ";
		
		String title8a = "Aggressive Centered ESTP";
		String title8b = "Optimism Centered ESTP";
		String title8c = "Love Centered ESTP";
		String title8d = "Submission Centered ESTP";
		String title8e = "Awe Centered ESTP";
		String title8f = "Disapproval Centered ESTP";
		String title8g = "Remorse Centered ESTP";
		String title8h = "Contempt Centered ESTP";
		
		String title9a = "Aggressive Centered ISFP";
		String title9b = "Optimism Centered ISFP";
		String title9c = "Love Centered ISFP";
		String title9d = "Submission Centered ISFP";
		String title9e = "Awe Centered ISFP";
		String title9f = "Disapproval Centered ISFP";
		String title9g = "Remorse Centered ISFP";
		String title9h = "Contempt Centered ISFP";
		
		String title10a = "Aggressive Centered ISFJ";
		String title10b = "Optimism Centered ISFJ";
		String title10c = "Love Centered ISFJ";
		String title10d = "Submission Centered ISFJ";
		String title10e = "Awe Centered ISFJ";
		String title10f = "Disapproval Centered ISFJ";
		String title10g = "Remorse Centered ISFJ";
		String title10h = "Contempt Centered ISFJ";
		
		String title11a = "Aggressive Centered ESFJ";
		String title11b = "Optimism Centered ESFJ";
		String title11c = "Love Centered ESFJ";
		String title11d = "Submission Centered ESFJ";
		String title11e = "Awe Centered ESFJ";
		String title11f = "Disapproval Centered ESFJ";
		String title11g = "Remorse Centered ESFJ";
		String title11h = "Contempt Centered ESFJ";
		
		String title12a = "Aggressive Centered ESFP";
		String title12b = "Optimism Centered ESFP";
		String title12c = "Love Centered ESFP";
		String title12d = "Submission Centered ESFP";
		String title12e = "Awe Centered ESFP";
		String title12f = "Disapproval Centered ESFP";
		String title12g = "Remorse Centered ESFP";
		String title12h = "Contempt Centered ESFP";
		
		String title13a = "Aggressive Centered INFP";
		String title13b = "Optimism Centered INFP";
		String title13c = "Love Centered INFP";
		String title13d = "Submission Centered INFP";
		String title13e = "Awe Centered INFP";
		String title13f = "Disapproval Centered INFP";
		String title13g = "Remorse Centered INFP";
		String title13h = "Contempt Centered INFP";
		
		String title14a = "Aggressive Centered INFJ";
		String title14b = "Optimism Centered INFJ";
		String title14c = "Love Centered INFJ";
		String title14d = "Submission Centered INFJ";
		String title14e = "Awe Centered INFJ";
		String title14f = "Disapproval Centered INFJ";
		String title14g = "Remorse Centered INFJ";
		String title14h = "Contempt Centered INFJ";
		
		String title15a = "Aggressive Centered ENFJ";
		String title15b = "Optimism Centered ENFJ";
		String title15c = "Love Centered ENFJ";
		String title15d = "Submission Centered ENFJ";
		String title15e = "Awe Centered ENFJ";
		String title15f = "Disapproval Centered ENFJ";
		String title15g = "Remorse Centered ENFJ";
		String title15h = "Contempt Centered ENFJ";
		
		String title16a = "Aggressive Centered ENFP";
		String title16b = "Optimism Centered ENFP";
		String title16c = "Love Centered ENFP";
		String title16d = "Submission Centered ENFP";
		String title16e = "Awe Centered ENFP";
		String title16f = "Disapproval Centered ENFP";
		String title16g = "Remorse Centered ENFP";
		String title16h = "Contempt Centered ENFP";
		
		Dialogue title = new Dialogue(DIGESTABLE, 30, 30, g, 12);
		title.dialogueMaker(title1a);
		title.dialogueMaker(title1b);
		title.dialogueMaker(title1c);
		title.dialogueMaker(title1d);
		title.dialogueMaker(title1e);
		title.dialogueMaker(title1f);
		title.dialogueMaker(title1g);
		title.dialogueMaker(title1h);
		
		title.dialogueMaker(title2a);
		title.dialogueMaker(title2b);
		title.dialogueMaker(title2c);
		title.dialogueMaker(title2d);
		title.dialogueMaker(title2e);
		title.dialogueMaker(title2f);
		title.dialogueMaker(title2g);
		title.dialogueMaker(title2h);
		
		title.dialogueMaker(title3a);
		title.dialogueMaker(title3b);
		title.dialogueMaker(title3c);
		title.dialogueMaker(title3d);
		title.dialogueMaker(title3e);
		title.dialogueMaker(title3f);
		title.dialogueMaker(title3g);
		title.dialogueMaker(title3h);
		
		title.dialogueMaker(title4a);
		title.dialogueMaker(title4b);
		title.dialogueMaker(title4c);
		title.dialogueMaker(title4d);
		title.dialogueMaker(title4e);
		title.dialogueMaker(title4f);
		title.dialogueMaker(title4g);
		title.dialogueMaker(title4h);
		
		title.dialogueMaker(title5a);
		title.dialogueMaker(title5b);
		title.dialogueMaker(title5c);
		title.dialogueMaker(title5d);
		title.dialogueMaker(title5e);
		title.dialogueMaker(title5f);
		title.dialogueMaker(title5g);
		title.dialogueMaker(title5h);
		
		title.dialogueMaker(title6a);
		title.dialogueMaker(title6b);
		title.dialogueMaker(title6c);
		title.dialogueMaker(title6d);
		title.dialogueMaker(title6e);
		title.dialogueMaker(title6f);
		title.dialogueMaker(title6g);
		title.dialogueMaker(title6h);
		
		title.dialogueMaker(title7a);
		title.dialogueMaker(title7b);
		title.dialogueMaker(title7c);
		title.dialogueMaker(title7d);
		title.dialogueMaker(title7e);
		title.dialogueMaker(title7f);
		title.dialogueMaker(title7g);
		title.dialogueMaker(title7h);
		
		title.dialogueMaker(title8a);
		title.dialogueMaker(title8b);
		title.dialogueMaker(title8c);
		title.dialogueMaker(title8d);
		title.dialogueMaker(title8e);
		title.dialogueMaker(title8f);
		title.dialogueMaker(title8g);
		title.dialogueMaker(title8h);
		
		title.dialogueMaker(title9a);
		title.dialogueMaker(title9b);
		title.dialogueMaker(title9c);
		title.dialogueMaker(title9d);
		title.dialogueMaker(title9e);
		title.dialogueMaker(title9f);
		title.dialogueMaker(title9g);
		title.dialogueMaker(title9h);
		
		title.dialogueMaker(title10a);
		title.dialogueMaker(title10b);
		title.dialogueMaker(title10c);
		title.dialogueMaker(title10d);
		title.dialogueMaker(title10e);
		title.dialogueMaker(title10f);
		title.dialogueMaker(title10g);
		title.dialogueMaker(title10h);

		title.dialogueMaker(title11a);
		title.dialogueMaker(title11b);
		title.dialogueMaker(title11c);
		title.dialogueMaker(title11d);
		title.dialogueMaker(title11e);
		title.dialogueMaker(title11f);
		title.dialogueMaker(title11g);
		title.dialogueMaker(title11h);
		
		title.dialogueMaker(title12a);
		title.dialogueMaker(title12b);
		title.dialogueMaker(title12c);
		title.dialogueMaker(title12d);
		title.dialogueMaker(title12e);
		title.dialogueMaker(title12f);
		title.dialogueMaker(title12g);
		title.dialogueMaker(title12h);
		
		title.dialogueMaker(title13a);
		title.dialogueMaker(title13b);
		title.dialogueMaker(title13c);
		title.dialogueMaker(title13d);
		title.dialogueMaker(title13e);
		title.dialogueMaker(title13f);
		title.dialogueMaker(title13g);
		title.dialogueMaker(title13h);
		
		title.dialogueMaker(title14a);
		title.dialogueMaker(title14b);
		title.dialogueMaker(title14c);
		title.dialogueMaker(title14d);
		title.dialogueMaker(title14e);
		title.dialogueMaker(title14f);
		title.dialogueMaker(title14g);
		title.dialogueMaker(title14h);
		
		title.dialogueMaker(title15a);
		title.dialogueMaker(title15b);
		title.dialogueMaker(title15c);
		title.dialogueMaker(title15d);
		title.dialogueMaker(title15e);
		title.dialogueMaker(title15f);
		title.dialogueMaker(title15g);
		title.dialogueMaker(title15h);
		
		title.dialogueMaker(title16a);
		title.dialogueMaker(title16b);
		title.dialogueMaker(title16c);
		title.dialogueMaker(title16d);
		title.dialogueMaker(title16e);
		title.dialogueMaker(title16f);
		title.dialogueMaker(title16g);
		title.dialogueMaker(title16h);
		
		title.stringPrinter(currentChoice);
		Dialogue page1 = new Dialogue(DIGESTABLE, 30, 50, g, 11);
		String string1 = ("Placeholder");
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		size = page1.dialogueMaker(string1);
		
		page1.stringPrinter(currentChoice);
		
		g.drawImage(left, (int)5, (int)200, null);
		metrics = g.getFontMetrics(font);
		g.drawString("" + (currentChoice + 1) + "/" + size, 160 - (metrics.stringWidth("" + (currentChoice + 1) + "/" + size)/2), 230);
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
