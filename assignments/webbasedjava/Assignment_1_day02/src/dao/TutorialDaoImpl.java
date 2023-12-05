package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojos.Tutorial;

import static utils.DBUtils.fetchConnection;

public class TutorialDaoImpl implements ITutorialDao 
{
	private Connection cn;
	private PreparedStatement pst1,pst2,pst3;
	
	public TutorialDaoImpl() throws SQLException, ClassNotFoundException {
		cn = fetchConnection();
		pst1 = cn.prepareStatement("select * from tutorials t1 "
				+ "inner join topics t2 on t1.topic_id=t2.id "
				+ "where t2.name=?"
				+ "order by t1.visits desc");
		pst2 = cn.prepareStatement("select * from tutorials where id=?");
		pst3 = cn.prepareStatement("insert into tutorials values(default,?,?,?,?,?,?)");
	}
	
	public void cleanUp() throws SQLException
	{
		if(cn!=null)
			cn.close();
		if(pst1!=null)
			pst1.close();
		if(pst2!=null)
			pst2.close();
		if(pst3!=null)
			pst3.close();
	}

	@Override
	public List<Tutorial> getTutorials(String topicName) throws SQLException {
		List<Tutorial> tutorials = new ArrayList<>();
		
		pst1.setString(1, topicName);
		
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

	@Override
	public String addTutorial(int i, Tutorial t) throws SQLException {
		
		pst3.setString(1, t.getName());
		pst3.setString(2, t.getAuthor());
		pst3.setDate(3, t.getPublishDate());
		pst3.setInt(4, t.getVisit());
		pst3.setInt(5, i);
		pst3.setString(6, t.getContents());
		
		int updateCount = pst3.executeUpdate();
		if(updateCount==1)
			return "Tutorial successfully added..";
		
		return "Tutorial adding failed !!!";
	}

}
