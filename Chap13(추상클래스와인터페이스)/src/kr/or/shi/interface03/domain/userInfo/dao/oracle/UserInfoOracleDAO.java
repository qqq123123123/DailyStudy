package kr.or.shi.interface03.domain.userInfo.dao.oracle;

import kr.or.shi.interface03.domain.userInfo.UserInfo;
import kr.or.shi.interface03.domain.userInfo.dao.UserInfoDAO;

public class UserInfoOracleDAO implements UserInfoDAO{

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into Oracle DB userID = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into Oracle DB userID = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete into Oracle DB userID = " + userInfo.getUserId());
    }
    
}
