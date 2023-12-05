package com.org.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "topics")
public class Topic {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@OneToMany(mappedBy = "topic", fetch = FetchType.LAZY)
	List<Tutorial> tutorialList;
	public Topic() {
		super();
	}
	public Topic(int id, String name, List<Tutorial> tutorialList) {
		super();
		this.id = id;
		this.name = name;
		this.tutorialList = tutorialList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Tutorial> getTutorialList() {
		return tutorialList;
	}
	public void setTutorialList(List<Tutorial> tutorialList) {
		this.tutorialList = tutorialList;
	}
	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + "]";
	}
	
	

}
