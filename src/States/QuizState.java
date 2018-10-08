package States;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import Backgrounds.Background;
import Profile.Personality;

/**
* @author Treagle350
**/

public class QuizState extends State {
	int count;
	
	private Background bg;
	
	private int operator = 5;
	
	private String question;
	
	/*
	private String[] EIquestions = {
			"I don't like silences !",
			"I need to talk to others"
	};
	private String[] SNquestions = {
			"I look at the here and now !",
			"I don't like dreams and fantasies"
	};
	private String[] FTquestions = {
			"Do you consider someone's feelings in situations ?",
			"Do you avoid conflict even if it ends up hirting you ?"
	};
	private String[] JPquestions = {
			"Are you often late ?",
			"Do you hate structure ?"
	};
	*/
	
	private String[] EIquestions = {
			"Questions 1",
			"Question 2"
	};
	private String[] SNquestions = {
			"I get easily lost in thoughts",
			"I'm considered more creative than pragmatic"
	};
	private String[] FTquestions = {
			"Questions c",
			"Question d"
	};
	private String[] JPquestions = {
			"Are you often late ?",
			"Question f"
};
	
	private String[][] quizArray = {
			EIquestions,
			SNquestions,
			FTquestions,
			JPquestions
	};
	
	int index1,index2;
	
	private int currentChoice;
	private String[] options = {
			"Strongly Disagree",
			"Disagree",
			"Neutral",
			"Agree",
			"Strongly Agree"
	};
	
	private Color titleColor;
	private Font titleFont;
	private Font font;
	
	int score;
	boolean end;
	
	FontMetrics metrics;
	Personality profile;

	public QuizState(StateManager sm) {
		
		end = false;
		
		index1 = 0;
		index2 = 0;
		
		count = 0;
		
		question = quizArray[0][0];
		
		this.sm = sm;
		
		try {
			bg = new Background(250, 250, 250);
			
			titleColor = new Color(128, 0, 0);
			titleFont = new Font("Century Gothic", Font.PLAIN, 28);//Center title + textParser
		
			font = new Font("Arial", Font.PLAIN, 12);
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
		
		g.setColor(titleColor);
		g.setFont(titleFont);
		
		if(!end) {
			g.drawString(question, 40, 70);
			
			g.setFont(font);
			
			for(int i = 0; i < options.length; i++) {
				if(i == currentChoice) {
					g.setColor(Color.BLACK);
				}
				else {
					g.setColor(Color.RED);
				}
				metrics = g.getFontMetrics(font);
				g.drawString(options[i], 160 - (metrics.stringWidth(options[i])/2), 140 + i * 15);
			}
		}else {
			g.setColor(Color.BLACK);
			metrics = g.getFontMetrics(font);
			String string = "Your profile is :";
			g.drawString(string, 90 - (metrics.stringWidth(string)/2), 100);
			
		}
	}
	
	private void select() {
		switch(currentChoice) {
			case 0:
				score = score - (2*operator);
				break;
			case 1:
				score = score - (operator);
				break;
			case 2:
				score = score + 0;
				break;
			case 3:
				score = score + (operator);
				break;
			case 4:
				score = score + (2*operator);
				break;
		}
		nextQuestion();
	}

	private void nextQuestion() {
		// TODO Auto-generated method stub
		index1 = index1 + 1;
		if(index1 == EIquestions.length) {
			index1 = 0;
			index2 = index2 + 1;
		}
		if(index2 == quizArray.length) {
			end = true;
		}
		question = quizArray[index2][index1];
	}

	@Override
	public void keyPressed(int k) {
		if(k == KeyEvent.VK_ENTER) {
			select();
			count = count + 1;
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
