package com.sunbeam.beans;

import com.sunbeam.daos.TutorialDaoImpl;
import com.sunbeam.pojos.Tutorial;

public class DetailsBean {
	private int tutorialId;
	private Tutorial tut;
	public int getTutorialId() {
		return tutorialId;
	}
	public void setTutorialId(int tutorialId) {
		this.tutorialId = tutorialId;
	}
	public Tutorial getTut() {
		return tut;
	}
	public void setTut(Tutorial tut) {
		this.tut = tut;
	}
	
	public void fetchTutorialDetails()
	{
		try(TutorialDaoImpl dao = new TutorialDaoImpl()) {
			this.tut = dao.getTutorial(this.tutorialId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
