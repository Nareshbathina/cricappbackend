package com.cricbox.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricbox.daos.PlayerRepository;
import com.cricbox.models.Player;

@Service
@jakarta.transaction.Transactional
public class PlayerService {
	 @Autowired
	   private PlayerRepository repo;
	 
	 
	 public List<Player> getAllPlayersByTeamId(String teamId) {
	        return this.repo.findByPlayersByTeamId(teamId);
	    }
	   
	    public List<Player> getPlayerByPlayerIds(String[] playerIds) {
	        return this.repo.findByPlayerIds(playerIds);
	    }
}
