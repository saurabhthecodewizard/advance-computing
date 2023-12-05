package dao;

import java.sql.SQLException;
import java.util.List;

import pojos.Tutorial;

public interface ITutorialDao {
	
List<Tutorial> getTutorials(int topicId) throws SQLException;
	
	Tutorial getSpecificTutorial(int id) throws SQLException;

}
