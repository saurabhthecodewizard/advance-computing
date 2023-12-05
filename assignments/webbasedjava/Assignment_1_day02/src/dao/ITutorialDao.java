package dao;

import java.sql.SQLException;
import java.util.List;

import pojos.Tutorial;

public interface ITutorialDao {
	
	List<Tutorial> getTutorials(String topicName) throws SQLException;
	
	Tutorial getSpecificTutorial(int id) throws SQLException;
	
	String addTutorial(int i, Tutorial t) throws SQLException;

}
