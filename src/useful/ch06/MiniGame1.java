package useful.ch06;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MiniGame1 extends JFrame {

	private	 JLabel Jplayer;
	private int JplayerX = 100;
	private int JplayerY = 100;
	private final int MOVDE_DISTANCE = 50;
	private final int FRAME_WIDTH = 500;
	private final int FRAME_HEIGHT = 500;
	private final String PLAYER_NAME = " 야스오";
	private final int PLAYER_WIDTH = 100;
	private final int PLAYER_HEIGHT = 100;
	
	
	
	
	

	public MiniGame1() {
		initData();
		setInitLayout();
		addEventLlistener();

	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Jplayer = new JLabel(PLAYER_NAME);
		Jplayer.setSize(PLAYER_WIDTH, PLAYER_HEIGHT);
	}

	private void setInitLayout() {
		// 좌표 기반으로 배치관리자 변경
		setLayout(null);
		add(Jplayer);
		setVisible(true);
		Jplayer.setLocation(JplayerX, JplayerY);
	}

	private void addEventLlistener() {

		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				
				
					if(e.getKeyCode() == KeyEvent.VK_UP) {
						JplayerY -= MOVDE_DISTANCE;
					} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
						JplayerX -= MOVDE_DISTANCE;
					} else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
						JplayerX += MOVDE_DISTANCE;
					} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
						JplayerY += MOVDE_DISTANCE;
					}
					
					Jplayer.setLocation(JplayerX, JplayerY);

			}
		});

	}

	public static void main(String[] args) {
		new MiniGame1();
	}//end of main

}// end of class
