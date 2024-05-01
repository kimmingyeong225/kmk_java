package useful.ch06;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

/*
 * 키 이벤트 리스너 사용해보기
 */

public class MyKeyEvent extends JFrame implements KeyListener {

	private JTextArea textArea;
	

	public MyKeyEvent() {
		initData();
		setInitLayout();
		addEvenListener();

	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		textArea = new JTextArea();
	}

	private void setInitLayout() {
		setLayout(new BorderLayout());
		add(textArea);
		setVisible(true);
	}

	private void addEvenListener() {
		// 이벤트 리스너 등록하다
		textArea.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyCode : " + e.getKeyCode());

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("왼쪽");
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("오른쪽");
		} else if (e.getKeyCode() == KeyEvent.VK_UP){
			System.out.println("위");
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("아래");
		}

		// 왼쪽 - 37
		// 아래 - 40
		// 오른쪽 - 39
		// 위 - 38
	}

	// 문제 1
	// 제어문을 활용해서 방향키 위 아래 왼쪽 오른쪽이 눌렀다가 때면
	// 콘솔창에 한글로 위 아래 왼쪽 오른쪽 글자를 표기 하시오

}
