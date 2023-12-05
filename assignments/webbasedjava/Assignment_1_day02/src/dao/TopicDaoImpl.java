package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojos.Topic;

import static utils.DBUtils.fetchConnection;

public class TopicDaoImpl implements ITopicDao 
{
	private Connection cn;
	private PreparedStatement pst1,pst2;
	
	public TopicDaoImpl() throws SQLException, ClassNotFoundException
	{
		cn = fetchConnection();
		pst1 = cn.prepareStatement("select name from topics");
		pst2 = cn.prepareStatement("select id from topics where name=?");
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
	public List<Topic> getTopics() throws SQLException 
	{
		List<Topic> topics = new ArrayList<>();
		
		try(ResultSet rst = pst1.executeQuery())
		{
			while(rst.next())
				topics.add(new Topic(rst.getString(1)));
		}
		
		return topics;
	}

	@Override
	public int getid(String name) throws SQLException {
		int i = 0;
		pst2.setString(1, name);
		
		try(ResultSet rst = pst2.executeQuery())
		{
			while(rst.next())
				i = rst.getInt(1);
		}
		
		return i;
	}

}
