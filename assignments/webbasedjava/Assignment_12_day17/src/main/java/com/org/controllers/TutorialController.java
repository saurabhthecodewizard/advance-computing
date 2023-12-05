package com.org.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.org.daos.TopicSelection;
import com.org.entities.Topic;
import com.org.entities.Tutorial;
import com.org.services.TutorialServiceImpl;


@Controller
public class TutorialController {
	
	private TutorialServiceImpl tutorialServiceImpl;

	public TutorialController(TutorialServiceImpl tutorialServiceImpl) {
		super();
		this.tutorialServiceImpl = tutorialServiceImpl;
	}
	
	@RequestMapping("/topicsurl")
	public String topicsUrl(Model model) {
		
		List<Topic> topicList = tutorialServiceImpl.findAllTopics();
		model.addAttribute("topicList", topicList);
		int topicId = 0;
		if(!topicList.isEmpty())
			topicId = topicList.get(0).getId();
		TopicSelection topicSelect = new TopicSelection(topicId);
		model.addAttribute("command", topicSelect);
		
		return "topics";
	}
	
	@RequestMapping("/topictutorials")
	public String topicTutorials(@RequestParam("topic") int topicid, Model model) {
		
		List<Tutorial> tutorialList = tutorialServiceImpl.findTopicTutorials(topicid);
		
		model.addAttribute("tutorialList", tutorialList);
		
		return "topictutorials";
	}
	
	@RequestMapping("/details")
	public String details(@RequestParam("id") int tutoriaId, Model model) {
		
		Tutorial tutorial = tutorialServiceImpl.findTutorialById(tutoriaId);
		
		model.addAttribute("tutorial", tutorial);
		
		return "details";
	}
	
	@RequestMapping("/manage")
	public String tutorials(Model model) {
		
		List<Tutorial> tutorialList = tutorialServiceImpl.findAllTutorials();
		
		model.addAttribute("tutorialList", tutorialList);
		
		return "manage";
	}
	
	@GetMapping("/add")
	public String addFormat(Model model) {
		
		Tutorial tutorial = new Tutorial();
		
		model.addAttribute("tutorial", tutorial);
		
		List<Topic> topicList = tutorialServiceImpl.findAllTopics();
		
		model.addAttribute("topicList", topicList);
		
		int topicId = 0;
		if(!topicList.isEmpty())
			topicId = topicList.get(0).getId();
		TopicSelection topicSelect = new TopicSelection(topicId);
		model.addAttribute("command", topicSelect);
		
		return "add";
	}
	
	@PostMapping("/add")
	public String add(@RequestParam("topic") int topicId, Tutorial tutorial) {
		
		Topic topic = tutorialServiceImpl.findTopicById(topicId);
		
		tutorial.setTopic(topic);
		
		tutorialServiceImpl.save(tutorial);
		
		return "redirect:manage";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int tutorialId) {
		
		tutorialServiceImpl.deleteTutorial(tutorialId);
		
		return "redirect:manage";
	}
	
	@GetMapping("/update")
	public String updateFormat(@RequestParam("id") int tutorialId, Model model) {
		
		Tutorial tutorial = tutorialServiceImpl.findTutorialById(tutorialId);
		
		model.addAttribute("tutorial", tutorial);
		
		return "update";
	}
	
	@PostMapping("/update")
	public String update(Tutorial tutorial) {
		
		tutorialServiceImpl.save(tutorial);
		
		return "redirect:manage";
	}

}
