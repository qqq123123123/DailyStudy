package kr.or.shi.interface03.domain.userInfo.dao.mssql;

import kr.or.shi.interface03.domain.userInfo.UserInfo;
import kr.or.shi.interface03.domain.userInfo.dao.UserInfoDAO;

public class UserInfoMssqlDAO implements UserInfoDAO{

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MSSQL DB userID = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into MSSQL DB userID = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from MSSQL DB userID = " + userInfo.getUserId());
    }
    
}
