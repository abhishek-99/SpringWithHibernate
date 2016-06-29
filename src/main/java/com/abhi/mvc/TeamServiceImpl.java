package com.abhi.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TeamServiceImpl implements TeamService{
@Autowired
private TeamDao teamdao;

public void addTeam(Team team) {
	// TODO Auto-generated method stub
	System.out.println("Teamdao");
	teamdao.addTeam(team);
	
}

public void updateTeam(Team team) {
	// TODO Auto-generated method stub
	teamdao.updateTeam(team);
	
}

public Team getTeam(int id) {
	// TODO Auto-generated method stub
	
	return teamdao.getTeam(id);
}

public void deleteTeam(int id) {
	// TODO Auto-generated method stub
	teamdao.deleteTeam(id);
}

public List getTeams() {
	// TODO Auto-generated method stub
	return teamdao.getTeams();
}

}
