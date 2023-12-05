package com.org.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.org.daos.TopicDao;
import com.org.daos.TutorialDao;
import com.org.entities.Topic;
import com.org.entities.Tutorial;

@Service
@Transactional
public class TutorialServiceImpl {
	
	@Autowired
	private TopicDao topicDao;
	@Autowired
	private TutorialDao tutorialDao;
	
	public List<Topic> findAllTopics() {
		return topicDao.findAll();
	}
	
	public List<Tutorial> findAllTutorials() {
		return tutorialDao.findAll();
	}
	
	public List<Tutorial> findTopicTutorials(int topicId) {
		return tutorialDao.findByTopicId(topicId);
	}
	
	public Tutorial findTutorialById(int tutorialId) {
		Optional<Tutorial> tutorial = tutorialDao.findById(tutorialId);
		
		return tutorial.orElse(null);
	}
	
	public Topic findTopicById(int topicId) {
		Optional<Topic> topic = topicDao.findById(topicId);
		
		return topic.orElse(null);
	}
	
	public void incrementTutorialVisitCount(int tutorialId) {
		
	}
	
	public void save(Tutorial tutorial) {
		tutorialDao.save(tutorial);
	}
	
	public void deleteTutorial(int tutorialId) {
		tutorialDao.deleteById(tutorialId);
	}

}
