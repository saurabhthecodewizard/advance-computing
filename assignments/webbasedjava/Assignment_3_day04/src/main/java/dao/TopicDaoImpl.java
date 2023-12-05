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
	private PreparedStatement pst1;
	
	public TopicDaoImpl() throws SQLException, ClassNotFoundException
	{
		cn = fetchConnection();
		pst1 = cn.prepareStatement("select name from topics");
	}
	
	public void cleanUp() throws SQLException
	{
		if(pst1!=null)
			pst1.close();
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

}
