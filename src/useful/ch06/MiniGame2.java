package useful.ch06;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiniGame2 extends JFrame{
	// 배경 넣고
	// 텍스트 대신 이미지 넣기
	private	 JLabel Jplayer;
	private JLabel backgroundMap;
	
	private int JplayerX = 100;
	private int JplayerY = 100;
	private final int MOVDE_DISTANCE = 50;
	private final int FRAME_WIDTH = 500;
	private final int FRAME_HEIGHT = 500;
	private final int PLAYER_WIDTH = 100;
	private final int PLAYER_HEIGHT = 100;
	
	public MiniGame2() {
		initData();
		setInitLayout();
		addEventLlistener();
	}
	
	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		Jplayer = new JLabel();
		Jplayer.setSize(PLAYER_WIDTH, PLAYER_HEIGHT);
		Icon icon = new ImageIcon("backgroundMap.png");
		backgroundMap = new JLabel(icon);
		
		backgroundMap.setSize(500, 500);
		backgroundMap.setLocation(0, 0);
		
		Jplayer = new JLabel(new ImageIcon("playerR.png"));
		Jplayer.setSize(200,200);
		Jplayer.setLocation(300, 100);
		
	}
	private void setInitLayout() {
		setLayout(null);
		add(Jplayer);
		add(backgroundMap);
	
		setVisible(true);
		Jplayer.setLocation(JplayerX, JplayerY);
		
	}
	private void addEventLlistener() {
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_UP) {
					JplayerX -= MOVDE_DISTANCE;
					
				}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					JplayerY -= MOVDE_DISTANCE;
					
				}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					JplayerY -= MOVDE_DISTANCE;
					
				}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					JplayerX -= MOVDE_DISTANCE;
					
				}
			
				Jplayer.setLocation(JplayerX,JplayerY);
				
				
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		new MiniGame2();
	}//end of main
	
	
}
