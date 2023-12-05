package com.sunbeam.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunbeam.pojos.User;
import com.sunbeam.utils.DbUtil;

public class RegistrationDaoImpl implements AutoCloseable {

	private Connection con;

	public RegistrationDaoImpl() throws Exception {
		con = DbUtil.getConnection();
	}
	
	@Override
	public void close() throws Exception {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
		}
	}
	
	public void addNewCustomer(User user) throws Exception
	{
		String sql = "INSERT INTO users VALUES(default,?,?,?,?,?,'customer')";
		//string, string, string, double, date, string
		try(PreparedStatement pst = con.prepareCall(sql))
		{
			pst.setString(1, user.getName());
			pst.setString(2, user.getEmail());
			pst.setString(3, user.getPassword());
			pst.setDouble(4, user.getRegAmount());
			pst.setDate(5, user.getRegDate());
			
			pst.executeUpdate();
		}
	}

}
