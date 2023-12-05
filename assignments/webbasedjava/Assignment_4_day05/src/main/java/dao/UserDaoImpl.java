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
	private PreparedStatement pst1;
	
	public UserDaoImpl() throws ClassNotFoundException, SQLException{
		cn = fetchConnection();
		pst1 = cn.prepareStatement("select * from users where email=? and password=?");
	}
	
	public void cleanUp() throws SQLException
	{
		if(pst1!=null)
			pst1.close();
	}

	@Override
	public User userLogin(String email, String password) throws SQLException {

		pst1.setString(1, email);
		pst1.setString(2, password);
		
		//id,name,email,password,registrationAmount,registrationDate,role
		try(ResultSet rst = pst1.executeQuery())
		{
			while(rst.next())
				return new User(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), 
						rst.getDouble(5), rst.getDate(6), rst.getString(7));
		}
		
		return null;
	}
}
