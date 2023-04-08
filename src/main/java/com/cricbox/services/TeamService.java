package com.cricbox.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricbox.daos.TeamRepository;
import com.cricbox.models.Team;

@Service
@jakarta.transaction.Transactional
public class TeamService {
	 @Autowired
	   private TeamRepository repo;
	 
	 
	    public List<Team> getAllTeamForLeague(String leagueId) {
	        return this.repo.findByLeagueId(leagueId);
	    }
	
}
