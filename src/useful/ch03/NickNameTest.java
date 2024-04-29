package useful.ch03;

public class NickNameTest {

	public static void main(String[] args) {

		NickName nickName = new NickName();
		
		
		String inputNickName = null;
		inputNickName = "";
		
		
		try {
			nickName.setNick(inputNickName);
		} catch (NickNameException e) {
			System.out.println("다시 확인하고 입력해주세요" );
		}catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
		

	}

}
