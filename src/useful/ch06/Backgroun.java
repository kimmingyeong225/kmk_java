package useful.ch06;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Backgroun extends JFrame {

	private Backgroun backgroun;
	
	public Backgroun() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		backgroun = new Backgroun();
	}
	private void setInitLayout() {
		add(backgroun);
		setVisible(true);
	}
	
	static class BackgrounImage extends MiniGame2{
		private Image image;
	
		public BackgrounImage() {
			image = new ImageIcon("backgroundMap.png").getImage();
		}
		
		public void maint(Graphics g) {
			super.paint(g);
			g.drawImage(image, 100, 100, 100, 100, null);
		}
		
		}
		
	}
	
	

