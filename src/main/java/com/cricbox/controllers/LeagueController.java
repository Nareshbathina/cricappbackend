package com.cricbox.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricbox.models.League;
import com.cricbox.services.LeagueService;


@CrossOrigin("*")
@RestController
public class LeagueController {

	 @Autowired
	    private LeagueService service;
	     
	    @GetMapping("/leagues")
	    public List<League> list() {
	        return service.listAll();
	    }
	    
}
