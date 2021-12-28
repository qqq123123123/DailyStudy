package kr.or.shi.interface03.web.userinfo;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.*;

import kr.or.shi.interface03.domain.userInfo.UserInfo;
import kr.or.shi.interface03.domain.userInfo.dao.UserInfoDAO;
import kr.or.shi.interface03.domain.userInfo.dao.mysql.UserInfoMysqlDAO;
import kr.or.shi.interface03.domain.userInfo.dao.oracle.UserInfoOracleDAO;
import kr.or.shi.interface03.domain.userInfo.dao.mssql.*;


public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		FileInputStream fStream = new FileInputStream("db.properties");
		
		Properties properties = new Properties();
		properties.load(fStream);
		
		String dbType = properties.getProperty("DBTYPE");
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("sct");
		userInfo.setPassword("1216");
		userInfo.setUserName("Lee");
		
		UserInfoDAO userInfoDao = null;
		
		if(dbType.equals("MYSQL"))
		{
			userInfoDao = new UserInfoMysqlDAO();
		}
		else if(dbType.equals("Oracle"))
		{
			userInfoDao = new UserInfoOracleDAO();
		}
		else if(dbType.equals("MSSQL"))
		{
			userInfoDao = new UserInfoMssqlDAO();
		}

		else
		{
			System.out.println("db Error");
			return;
		}
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}

}
