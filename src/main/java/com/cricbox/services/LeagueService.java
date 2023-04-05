package com.cricbox.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricbox.daos.LeagueRepository;
import com.cricbox.models.League;


@Service
@jakarta.transaction.Transactional
public class LeagueService {
	 @Autowired
	   private LeagueRepository repo;
	    
	   public List<League> listAll() {
	       return repo.findAll();
	   }
	   public void save(League station) {
	       repo.save(station);
	   }
	    
	   public League get(String id) {
	       return repo.findById(id).get();
	   }
	    
	   public void delete(String id) {
	       repo.deleteById(id);
	   }
	
}
