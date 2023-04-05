package com.cricbox.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricbox.models.Team;

public interface TeamRepository extends JpaRepository<Team, String>{
	public List<Team> findByLeagueId(String leagueId);
}
