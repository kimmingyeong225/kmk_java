package useful.ch05;

/*
 * 쓰레드를 만드는 두 번째 방법 Runnable  인터페이스를
 * 활용하는 방법
 */

public class MyThread2  implements Runnable{

	// Thread 클래스에서 start 메서드가 호출 되면
	// 동장하는 부분이라고 약속 되어 있다.
	@Override
	public void run() {
		int i = 0;
		while(i < 10) {
			System.out.println("i : " + i);
			i++;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}
