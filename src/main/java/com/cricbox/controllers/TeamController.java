package com.cricbox.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cricbox.models.Team;
import com.cricbox.services.TeamService;


@CrossOrigin("*")
@RestController
public class TeamController {

	 @Autowired
	    private TeamService service;
	     
	    @GetMapping("/getAllTeamsForLeague")
	    public List<Team> getAllTeamsForLeague(@RequestParam String leagueId) {
	        return service.getAllTeamForLeague(leagueId);
	    }
	    
}
