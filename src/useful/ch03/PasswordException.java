package useful.ch03;

/*
 * 사용자 정의 예외 클래스 생성
 */


public class PasswordException extends RuntimeException {
//기능의 확상 -> extends

	public PasswordException(String massage) {
		super(massage);
	
	}
	
	
	
	
}// end of class
