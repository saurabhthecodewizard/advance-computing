package pojos;

import java.sql.Date;

public class Tutorial 
{
	private int id;
	private String name;
	private String author;
	private Date publishDate;
	private int visit;
	private int topicId;
	private String contents;
	public Tutorial(int id, String name, String author, Date publishDate, int visit, int topicId, String contents) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publishDate = publishDate;
		this.visit = visit;
		this.topicId = topicId;
		this.contents = contents;
	}
	
	public Tutorial(String name, String author, Date publishDate, int visit, String contents)
	{
		this.name = name;
		this.author = author;
		this.publishDate = publishDate;
		this.visit = visit;
		this.contents = contents;
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
	public int getVisit() {
		return visit;
	}
	public void setVisit(int visit) {
		this.visit = visit;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents=contents;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", name=" + name + ", author=" + author + ", publishDate=" + publishDate
				+ ", visit=" + visit + ", topicId=" + topicId + ", contents=" + contents + "]";
	}
	
	
	
}
