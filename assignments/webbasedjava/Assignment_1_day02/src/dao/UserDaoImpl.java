package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static utils.DBUtils.fetchConnection;

import pojos.User;

public class UserDaoImpl implements IUserDao 
{
	private Connection cn;
	private PreparedStatement pst1,pst2;
	
	public UserDaoImpl() throws ClassNotFoundException, SQLException{
		cn = fetchConnection();
		pst1 = cn.prepareStatement("select * from users where email=? and password=?");
		pst2 = cn.prepareStatement("update users set password=? where email=? and password=?");
	}
	
	public void cleanUp() throws SQLException
	{
		if(cn!=null)
			cn.close();
		if(pst1!=null)
			pst1.close();
		if(pst2!=null)
			pst2.close();
	}

	@Override
	public User userLogin(String email, String password) throws SQLException {
		
		User u = null;
		pst1.setString(1, email);
		pst1.setString(2, password);
		
		//id,name,email,password,registrationAmount,registrationDate,role
		try(ResultSet rst = pst1.executeQuery())
		{
			while(rst.next())
			u = new User(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), 
						rst.getDouble(5), rst.getDate(6), rst.getString(7));
		}
		
		return u;
	}

	@Override
	public String changePassword(String email, String password, String newPassword) throws SQLException {
		
		pst2.setString(1, newPassword);
		pst2.setString(2, email);
		pst2.setString(3, password);
		
		int updateCount = pst2.executeUpdate();
		if(updateCount == 1)
			return "Password changed successfully...";
		
		return "Cannot change password !!!";
	}

}
