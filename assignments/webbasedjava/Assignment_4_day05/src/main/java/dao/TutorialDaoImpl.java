package dao;

import static utils.DBUtils.fetchConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojos.Tutorial;

public class TutorialDaoImpl implements ITutorialDao {
	
	private Connection cn;
	private PreparedStatement pst1,pst2;
	
	public TutorialDaoImpl() throws SQLException, ClassNotFoundException {
		cn = fetchConnection();
		pst1 = cn.prepareStatement("select * from tutorials where topic_id=? order by visits desc");
		pst2 = cn.prepareStatement("select * from tutorials where id=?");
	}
	
	public void cleanUp() throws SQLException
	{
		if(pst1!=null)
			pst1.close();
		if(pst2!=null)
			pst2.close();
	}

	@Override
	public List<Tutorial> getTutorials(int topicId) throws SQLException {
		List<Tutorial> tutorials = new ArrayList<>();
		
		pst1.setInt(1, topicId);
		
		//int id, String name, String author, Date publishDate, int visit, int topicId
		try(ResultSet rst = pst1.executeQuery())
		{
			while(rst.next())
				tutorials.add(new Tutorial(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getDate(4), rst.getInt(5), rst.getInt(6), rst.getString(7)));
		}
		
		return tutorials;
	}

	@Override
	public Tutorial getSpecificTutorial(int id) throws SQLException {
		Tutorial t = null;
		
		pst2.setInt(1, id);
		
		//int id, String name, String author, Date publishDate, int visit, int topicId
		try(ResultSet rst = pst2.executeQuery())
		{
			while(rst.next())
				t = new Tutorial(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getDate(4), rst.getInt(5), rst.getInt(6), rst.getString(7));
		}
		
		return t;
	}

}
