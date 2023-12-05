package com.org.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entities.Topic;

public interface TopicDao extends JpaRepository<Topic, Integer>{

}
