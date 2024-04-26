package useful;

import java.lang.*; //lang* 모든 녀석들을 가지고 온다.
/*
 * Object 클래스는 모든 클래스의 최상ㅇ위 클래스이다.
 * import java.lang.*; 모든 프로그래밍시 import 하지 않아도 자동으로 가지고 온다.
 * 자바는 단일 상속만 지원합니다. 단 Object 클래스를 제외 하고!!
 */

// final 변수 앞에 상수 //클래스 앞에 상속 불가
public class Book extends Object {

	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;

	}

	//Object ->toString();
	@Override
	public String toString() {

		return"[" + title + " ," + author+ "]";
	}
	
	// 테스트 코드
	public static void main(String[] args) {
		Book book = new Book("데미안", "헤르만 헤세");
		System.out.println(book);
		System.out.println("------------------");
		
		String str1 = new String("안녕");
		System.out.println(str1);
	}

}// end of class
