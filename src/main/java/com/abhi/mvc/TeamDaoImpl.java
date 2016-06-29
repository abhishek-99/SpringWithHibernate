package com.abhi.mvc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeamDaoImpl implements TeamDao{

	@Autowired
	private SessionFactory sessionfactroy;
	
	private Session getCurrentSession()
	{
		return sessionfactroy.getCurrentSession();
	}

	public void addTeam(Team team) {
		// TODO Auto-generated method stub
		getCurrentSession().save(team);
		
	}

	public void updateTeam(Team team) {
		// TODO Auto-generated method stub
		Team teamtoupdate= getTeam(team.getId());
		teamtoupdate.setName(team.getName());
		teamtoupdate.setRating(team.getRating());
		getCurrentSession().update(teamtoupdate);
		
	}

	public Team getTeam(int id) {
		// TODO Auto-generated method stub
		Team team=(Team) getCurrentSession().get(Team.class,id);
		return team;
	}

	public void deleteTeam(int id) {
		// TODO Auto-generated method stub
		Team team= getTeam(id);
		if(team!=null)
			getCurrentSession().delete(team);
	}

	public List getTeams() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("From Team").list();
		
	}
	
	

}
