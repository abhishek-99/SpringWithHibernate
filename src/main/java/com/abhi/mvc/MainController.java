package com.abhi.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
@Autowired 
private TeamService teamservice;
@RequestMapping(value= "/team/add")
public ModelAndView addTeam()
{
	ModelAndView modelandview=new ModelAndView("add-team-form");
	modelandview.addObject("team",new Team());
	return modelandview;
}
@RequestMapping("/team/add/process")

	public ModelAndView addingTeam(@ModelAttribute("team") Team team)
	{
	
		System.out.println("team add process");	
		ModelAndView modelandview= new ModelAndView("home");
		System.out.println(teamservice);
		teamservice.addTeam(team);
		String message="Team was successfully added";
		modelandview.addObject("message",message);
		return modelandview;
	}
	@RequestMapping(value="/team/list")
	public ModelAndView listofteams()
	{
		ModelAndView modelandview= new ModelAndView("list-of-teams");
		List teams = teamservice.getTeams();
		modelandview.addObject("teams",teams);
		return modelandview;
		
	}
@RequestMapping(value="/team/edit/{id}",method=RequestMethod.GET)
public ModelAndView editTeampage(@PathVariable Integer id)
{
	ModelAndView modelandview = new ModelAndView("edit-team-form");
	Team team= teamservice.getTeam(id);
	modelandview.addObject("team", team);
	return modelandview;
}
@RequestMapping(value="/team/edit/{id}",method=RequestMethod.POST)
public ModelAndView updateTeam(@ModelAttribute Team team,@PathVariable Integer id )
{
	ModelAndView modelandview=new ModelAndView("home");
	teamservice.updateTeam(team);
	String message="Team was successfully updated";
	return modelandview.addObject("message", message);
}
@RequestMapping(value ="/team/delete/{id}",method=RequestMethod.GET)
public ModelAndView deleteTeam(@PathVariable Integer id)
{
	ModelAndView modelandview = new ModelAndView("home");
	teamservice.deleteTeam(id);
	String message="Team was sucessfully deleted";
	return modelandview.addObject("message",message);
}

}
