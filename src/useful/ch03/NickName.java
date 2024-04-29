package useful.ch03;

public class NickName {
	
	private String nick;
	
	//getter
	public String getNick(){
		return nick;
	}
	//setter
	public void setNick(String nick){
		if(nick == null) {
			throw new NickNameException("닉네임은 null 값일 수 없습니다");
		}
		if(nick.length() < 3 ) {
			//throw new NickNameException("닉네임을 3글자 이상 입력해주세요");
			System.out.println("닉네임을 3글자 이상 입력해주세요");
		}
		if (nick.matches("[ㄱ-ㅎa-z0-9]+")) {
			//throw new NickNameException("특수문자는 사용 불가능합니다");
			System.out.println("특수문자는 사용 불가능합니다");
		
		}
		this.nick = nick;
	}

}// end of class
