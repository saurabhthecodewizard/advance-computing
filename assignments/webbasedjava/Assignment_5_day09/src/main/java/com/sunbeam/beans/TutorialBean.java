package com.sunbeam.beans;

import java.util.ArrayList;
import java.util.List;

import com.sunbeam.daos.TutorialDaoImpl;
import com.sunbeam.pojos.Tutorial;

public class TutorialBean {
	private List<Tutorial> tutorialList;
	
	public TutorialBean()
	{
		tutorialList = new ArrayList<>();
	}

	public List<Tutorial> getTutorialList() {
		return tutorialList;
	}

	public void setTutorialList(List<Tutorial> tutorialList) {
		this.tutorialList = tutorialList;
	}
	
	public void fetchTutorialList() {
		try(TutorialDaoImpl td = new TutorialDaoImpl())
		{
			this.tutorialList = td.getTutorials();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
