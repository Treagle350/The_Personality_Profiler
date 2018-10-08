package States;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class StateManager {
	
	private ArrayList<State> states;
	private int currentState;
	
	public static final int MENUSTATE = 0;
	public static final int QUIZSTATE = 1;
	public static final int THEORYSTATE = 2;
	public static final int PROFILESTATE = 3;
	public static final int ABOUTSTATE = 4;

	public StateManager() {
		states = new ArrayList<State>();
		
		currentState = MENUSTATE;
		states.add(new MenuState(this));
		states.add(new QuizState(this));
		states.add(new TheoryState(this));
		states.add(new ProfileState(this));
		states.add(new AboutState(this));
	}
	
	public void setState(int state) {
		currentState = state;
		states.get(currentState).init();
	}
	
	public void update() {
		states.get(currentState).update();
	}
	
	public void draw(Graphics2D g) {
		states.get(currentState).draw(g);
	}
	
	public void keyPressed(int k) {
		states.get(currentState).keyPressed(k);
	}
}
