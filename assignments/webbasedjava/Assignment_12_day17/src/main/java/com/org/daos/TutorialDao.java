package com.org.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entities.Tutorial;

public interface TutorialDao extends JpaRepository<Tutorial, Integer>{
	
	List<Tutorial> findByTopicId(int id); // FROM Tutorial t WHERE t.topic.id = ?

}
