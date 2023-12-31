package com.sunbeam.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunbeam.pojos.Topic;
import com.sunbeam.pojos.TopicSelection;
import com.sunbeam.pojos.Tutorial;
import com.sunbeam.services.TutorialServiceImpl;

@Controller
public class TutorialControllerImpl {
	@Autowired
	private TutorialServiceImpl tutorialService;
	
	@RequestMapping("/topicsurl")
	public String topics(Model model) {
		List<Topic> topicList = tutorialService.findAllTopics();
		model.addAttribute("topicList", topicList);
		int topicId = 0;
		if(!topicList.isEmpty())
			topicId = topicList.get(0).getId();
		TopicSelection topicSelect = new TopicSelection(topicId);
		model.addAttribute("command", topicSelect);
		return "topics"; // --> topics.jsp
	}


	@RequestMapping("/topictutorials")
	public String topicTutorials(@RequestParam("topic") int topicId, Model model) {
		List<Tutorial> tutorialList = tutorialService.findTopicTutorials(topicId);
		model.addAttribute("tutorialList", tutorialList);
		return "topictutorials"; // --> topictutorials.jsp
	}
	
	@RequestMapping("/details")
	public String details(@RequestParam("id") int tutorialId, Model model) {
		Tutorial tutorial = tutorialService.findTutorialById(tutorialId);
		model.addAttribute("tutorial", tutorial);
		return "details"; // --> details.jsp
	}
	
	@RequestMapping("/manage")
	public String manage(Model model) {
		List<Tutorial> tutorialList = tutorialService.findAllTutorials();
		model.addAttribute("tutorialList", tutorialList);
		
		return "manage";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int tutorialId, Model model) {
		tutorialService.deleteById(tutorialId);
		
		return "redirect:manage";
		
	}
	
	@GetMapping("/edit")
	public String edit(@RequestParam("id") int tutorialId, Model model) {
		Tutorial tutorial = tutorialService.findTutorialById(tutorialId);
		model.addAttribute("tutorial", tutorial);
		return "edit"; // --> edit.jsp
	}
	
	@PostMapping("/edit")
	public String update(Tutorial tutorial) {
		int count = tutorialService.save(tutorial);
		return "forward:manage";
	}
	
	@GetMapping("/add")
	public String addFormat(Model model) {
		Tutorial tutorial = new Tutorial();
		List<Topic> topicList = tutorialService.findAllTopics();
		model.addAttribute("topicList", topicList);
		model.addAttribute("tutorial", tutorial);
		return "add";
	}
	
	@PostMapping("/add")
	public String add(Tutorial tutorial) {
		int count = tutorialService.add(tutorial);
		return "forward:manage";
	}

}






