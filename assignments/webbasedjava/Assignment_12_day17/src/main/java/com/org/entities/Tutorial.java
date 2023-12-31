package com.org.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tutorials")
public class Tutorial {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String author;
	@Column(name = "publish_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date publishDate;
	@Column
	private int visits;
	@Column
	private String contents;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "topic_id")
	private Topic topic;
	public Tutorial() {
		super();
	}
	public Tutorial(int id, String name, String author, Date publishDate, int visits, String contents, Topic topic) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publishDate = publishDate;
		this.visits = visits;
		this.contents = contents;
		this.topic = topic;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public int getVisits() {
		return visits;
	}
	public void setVisits(int visits) {
		this.visits = visits;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", name=" + name + ", author=" + author + ", publishDate=" + publishDate
				+ ", visits=" + visits + ", contents=" + contents + "]";
	}
	
	

}
