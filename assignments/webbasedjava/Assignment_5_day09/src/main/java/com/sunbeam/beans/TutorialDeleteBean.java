package com.sunbeam.beans;

import com.sunbeam.daos.TutorialDaoImpl;

public class TutorialDeleteBean {
	private int tut_id;
	
	public int getTut_id() {
		return tut_id;
	}
	
	public void setTut_id(int tut_id) {
		this.tut_id = tut_id;
	}

	public void deleteTutorial() {
		try(TutorialDaoImpl dao = new TutorialDaoImpl())
		{
			dao.deleteTutorial(this.tut_id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
