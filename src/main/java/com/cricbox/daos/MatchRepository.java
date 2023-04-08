package com.cricbox.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cricbox.models.Match;

public interface MatchRepository extends JpaRepository<Match, String>{
	public List<Match> findByLeagueId(String leagueId);
	@Query(value = "update matches m SET m.Team1PlayersInfo = :team1PlayersInfo , m.Team2PlayersInfo = :team2PlayersInfo  where m.matches.id = :id", nativeQuery = true)
	void updateMatch(@Param(value = "id") String id, @Param(value = "team1PlayersInfo") String team1PlayersInfo,@Param(value = "team2PlayersInfo") String team2PlayersInfo);
	@Query(value = "update matches SET b1 = :b1 , b2 = :b2, b3 = :b3, b4 = :b4  where id = :id", nativeQuery = true)
	void updateMatchPoints(@Param(value = "id") String id, @Param(value = "b1") String b1,@Param(value = "b2") String b2,  @Param(value = "b3") String b3,@Param(value = "b4") String b4);

}
