package com.cricbox.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cricbox.models.Match;
import com.cricbox.models.Player;
import com.cricbox.services.MatchService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;


@CrossOrigin("*")
@RestController
public class MatchController {

	 @Autowired
	    private MatchService service;
	   private Gson gson = new GsonBuilder().create();
	    @GetMapping("/getAllMatches")
	    public List<Match> getAllMatches() {
	        return service.getAllMatches();
	    }
	    @GetMapping("/getAllMatchesForLeague")
	    public List<Match> getAllMatchesForLeague(@RequestParam String leagueId) {
	        return service.getAllMatchesForLeague(leagueId);
	    }
	    @GetMapping("/getMatchDetails")
	    public Optional<Match> getMatchDetails(@RequestParam String matchId) {
	        return service.getMatcheById(matchId);
	    }
	    @PostMapping("/saveMatch")
	    public void saveMatch(@RequestBody Match match) {
	    	service.updateMatch(match);
	    }
	    @PostMapping("/saveMatchPoints")
	    public void saveMatchPoints(@RequestParam String playersJson, @RequestParam String matchId) {
	    	  List<Player> players = gson.fromJson(playersJson, new TypeToken<List<Player>>() {
	            }.getType());

	            service.updateMatchPoints(players, matchId);
	    }
}
