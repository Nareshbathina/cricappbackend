package com.cricbox.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricbox.models.League;

public interface LeagueRepository extends JpaRepository<League, String>{
}
