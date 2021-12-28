package kr.or.shi.interface03.domain.userInfo.dao;

import kr.or.shi.interface03.domain.userInfo.UserInfo;

public interface UserInfoDAO {
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
	
}
