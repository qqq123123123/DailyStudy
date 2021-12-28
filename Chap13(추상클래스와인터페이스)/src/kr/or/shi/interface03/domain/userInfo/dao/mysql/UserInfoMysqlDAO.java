package kr.or.shi.interface03.domain.userInfo.dao.mysql;

import kr.or.shi.interface03.domain.userInfo.UserInfo;
import kr.or.shi.interface03.domain.userInfo.dao.UserInfoDAO;

public class UserInfoMysqlDAO implements UserInfoDAO{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into MySQL DB userID = " + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into MySQL DB userID = " + userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete from MySQL DB userID = " + userInfo.getUserId());
	}

}
