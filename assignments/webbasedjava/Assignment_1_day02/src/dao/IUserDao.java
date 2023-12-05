package dao;

import java.sql.SQLException;
import java.util.List;

import pojos.User;

public interface IUserDao 
{
	User userLogin(String email, String password) throws SQLException;
	
	String changePassword(String email, String password, String newPassword) throws SQLException;
}
