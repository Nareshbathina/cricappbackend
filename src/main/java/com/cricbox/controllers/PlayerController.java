package com.cricbox.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cricbox.models.Player;
import com.cricbox.services.PlayerService;


@CrossOrigin("*")
@RestController
public class PlayerController {

	 @Autowired
	    private PlayerService service;
	     
	    @GetMapping("/getAllPlayersByTeamId")
	    public List<Player> getAllPlayersByTeamId(@RequestParam String teamId) {
	        return service.getAllPlayersByTeamId(teamId);
	    }
	    
}
