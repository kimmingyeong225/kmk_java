package useful.ex;

public class UserInfoOracleDaoImpl implements IUserInfoDao {

	@Override
	public void insertserInfo(UserInfo info) {
		System.out.println("오라클 DB 에 유저 생성");
	}

	@Override
	public void updateUserInfo(UserInfo info) {
		System.out.println("오라클 DB 에 유저 정보 수정");
	}

	@Override
	public void deleteUserInfo(int id) {
		System.out.println("오라클 DB 에 유저 정보 삭제");
	}

	@Override
	public void selectUserInfo() {
		System.out.println("오라클 DB 에 유저 정보 전체 조회");
		
		
	}



		
		
	}


