package fi.projekti.LinkList.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.projekti.LinkList.domain.LinksRepository;

@Controller
public class LinkListController {
	// Autowired for getting the LinksRepository class in to the context
	@Autowired
	private LinksRepository repository;
	
	//Here we set the main page where we can see all the links, the thymeleaf templatepage can be found in the usual resources file
	@RequestMapping(value="/links")
	public String links(Model model) {
		model.addAttribute("theLinks", repository.findAll());
		return "links";
	}
	
	

}
