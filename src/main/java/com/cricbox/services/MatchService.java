package com.cricbox.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricbox.daos.MatchRepository;
import com.cricbox.models.Match;
import com.cricbox.models.Player;

@Service
@jakarta.transaction.Transactional
public class MatchService {
	 @Autowired
	   private MatchRepository repo;
	 
	 
	 public List<Match> getAllMatches() {
	        return this.repo.findAll();
	    }
	     public List<Match> getAllMatchesForLeague(String id) {
	        return this.repo.findByLeagueId(id);
	    }

	    public Optional<Match> getMatcheById(String id) {
	        return this.repo.findById(id);
	    }

	    public Match updateMatch(Match game) {
	        return this.repo.save(game);
	    }

	    public void updateMatchPoints(List<Player> players, String matchId) {

	        Optional<Match> matches = this.getMatcheById(matchId);
	        Match match = matches.get();
	        String players1Info = match.getTeam1PlayersInfo();
	        List<String> player1InfoList = Arrays.asList(players1Info.split(",", -1));
	        String players2Info = match.getTeam2PlayersInfo();
	        List<String> player2InfoList = Arrays.asList(players2Info.split(",", -1));
	        Map<String, Player> playerData = new HashMap();
	        for (Player p : players) {
	            playerData.put(p.getId(), p);
	        }

	        List<String> b1points = new ArrayList();
	        List<String> b2points = new ArrayList();
	        List<String> b3points = new ArrayList();
	        List<String> b4points = new ArrayList();
	        for (String pId : player1InfoList) {
	            Player p = playerData.get(pId);
	            b1points.add(p.getB1());
	            b2points.add(p.getB2());
	            b3points.add(p.getB3());
	            b4points.add(p.getB4());
	        }
	        b1points.add("-");
	        b2points.add("-");
	        b3points.add("-");
	        b4points.add("-");

	        for (String pId : player2InfoList) {
	            Player p = playerData.get(pId);
	            b1points.add(p.getB1());
	            b2points.add(p.getB2());
	            b3points.add(p.getB3());
	            b4points.add(p.getB4());
	        }

	        String b1 = String.join(",", b1points);
	        String b2 = String.join(",", b2points);
	        String b3 = String.join(",", b3points);
	        String b4 = String.join(",", b4points);
	        match.setB1(b1);
	        match.setB2(b2);
	        match.setB3(b3);
	        match.setB4(b4);
	        
	        //this.repo.updateMatchPoints(matchId,b1,b2,b3,b4);
	    }
}
