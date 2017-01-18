package project;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
//import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This is the beginning of a simple game. You should expand it into a dodgeball
 * game, where the user controls an object with the mouse or keyboard, and tries
 * to avoid the balls flying around the screen. If they get hit, it's game over.
 * If they survive for 20 seconds (or some other fixed time), they go on to the
 * next level. <br>
 * <br>
 * Should be run at around 500x300 pixels.<br>
 * <br>
 * @version Nov. 2015
 * 
 * @author Christina Kemp adapted from Sam Scott
 */
@SuppressWarnings("serial")
public class GamePanel extends JPanel implements Runnable, MouseListener, MouseMotionListener {


	int width = 1275;
	int height = 975;

	/**
	 * The number of balls on the screen.
	 */
	final int numBalls = 1000;
	/**
	 * The pause between repainting (should be set for about 30 frames per
	 * second).
	 */
	final int pauseDuration = 50;
	/**
	 * An array of balls.
	 */
	FlashingBall[] ball = new FlashingBall[numBalls];

	/** main program (entry point) */
	public static void main(String[] args) {

		// Set up main window (using Swing's Jframe)
		JFrame frame = new JFrame("Dodgeball");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 300));
		frame.setAutoRequestFocus(false);
		frame.setVisible(true);
		Container c = frame.getContentPane();
		c.add(new GamePanel());
		frame.pack();


	}

	public GamePanel(){
		// Start the ball bouncing (in its own thread)
		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(Color.black);

		for (int i = 0; i < numBalls; i++) {
			ball[i] = new FlashingBall(100, 100, 0, width, 0, height);
			ball[i].setXSpeed(2);
			ball[i].setYSpeed(2);
			ball[i].setColor(new Color((int) (Math.random() * 256), (int) (Math
					.random() * 256), (int) (Math.random() * 256)));
		}

		Thread gameThread = new Thread(this);
		gameThread.start();		
		addMouseMotionListener (this);
		addMouseListener(this);

	}

	/**
	 * Repaints the frame periodically.
	 */
	public void run() {
		while (true) {
			repaint();
			try {
				Thread.sleep(pauseDuration);
			} catch (InterruptedException e) {
			}
		}
	}

	/**
	 * Clears the screen and paints the balls.
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < numBalls; i++) {
			ball[i].draw(g);
			g.drawString("PLAY by cleaning Java! KILL ALL THE INSECTS AND STOP THEM. YOU HAVE TO KILL THEM BY THE HEART WHICH IS THE EXACT MIDDLE POINT OF THE BALL. YOUR SCORE IS:"+ counter, 100, 100);// kEEP TRACK OF SCORE
		}

	}
public boolean clicked= false;
	@Override
	public void mouseDragged(MouseEvent e) {
		for (int i = 0; i < numBalls; i++) {
			int x = (int) ball[i].getX();// make ball coordinates variables
			int y = (int) ball[i].getY();

			if (x==e.getX()&& y==e.getY()){// if the mouse clicked it 
				drag = true;
				if (drag){
					ball[i].setX(e.getX());// stops ball at its x coordinate
					ball[i].setY(e.getY());// stops ball at its y coordinate
					ball[i].setXSpeed(0);//stops ball movement
					ball[i].setYSpeed(0);//stops ball movement
					
					animateOneStep(clicked, FlashingBall.filledIn);
					counter++;// Adds point
				}	
			}
		}



	}

	private void animateOneStep(boolean clicked2, boolean filledIn) {
		if (clicked){
			filledIn = true;
		}
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * Main game is about to stop all the balls 
	 */
	public boolean drag = false; 
	public int counter = 0;
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
