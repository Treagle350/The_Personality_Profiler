package Main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

import States.StateManager;

import java.awt.event.*;

@SuppressWarnings("serial")
public class ApplicationPanel extends JPanel implements KeyListener, Runnable {
	
	public static final int WIDTH = 320;
	public static final int HEIGHT = 240;
	int SCALE = 1;
	
	private Thread thread;
	private boolean running;
	private int FPS = 60;
	private long targetTime = 1000/FPS;
	
	private BufferedImage image;
	private Graphics2D g;
	
	private StateManager sm;
	
	public ApplicationPanel(int scale) {
		super();
		this.SCALE = scale;
		setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		setFocusable(true);
		requestFocus();
	}
	
	public void addNotify() {
		super.addNotify();
		if(thread == null) {
			thread = new Thread(this);
			addKeyListener(this);
			thread.start();
		}
	}
	
	private void init() {
			
		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		g = (Graphics2D) image.getGraphics();
		running = true;
			
		sm = new StateManager();
	}
		
	public void run() {
		init();
			
		long start;
		long elapsed;
		long wait;
			
		while(running) {
			start = System.nanoTime();
				
			update();
			draw();
			drawToScreen();
			
			elapsed = System.nanoTime() - start;
				
			wait = targetTime - elapsed / 1000000;
				
			if (wait < 0) {
				wait = 5;
			}
				
			try {
				Thread.sleep(wait);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
		
	private void update() {
		sm.update();
	}
	private void draw() {
		sm.draw(g);
	}
	private void drawToScreen() {
		Graphics g2 = getGraphics();
		g2.drawImage(image, 0, 0, WIDTH*SCALE, HEIGHT*SCALE, null);
		g2.dispose();
	}

	@Override
	public void keyPressed(KeyEvent key) {
		// TODO Auto-generated method stub
		sm.keyPressed(key.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}