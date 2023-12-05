package com.org.daos;

public class TopicSelection {
	private int topic;

	@Override
	public String toString() {
		return "TopicSelection [topic=" + topic + "]";
	}

	public int getTopic() {
		return topic;
	}

	public void setTopic(int topic) {
		this.topic = topic;
	}

	public TopicSelection(int topic) {
		super();
		this.topic = topic;
	}

	public TopicSelection() {
		super();
	}

}
