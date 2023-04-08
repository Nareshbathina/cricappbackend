package com.cricbox.daos;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cricbox.models.Player;

public interface PlayerRepository extends JpaRepository<Player, String>{
	public List<Player> findByTeamId(String leagueId);
	 @Query(value = "SELECT p.*,pp.planetId FROM Player p left outer join planetpoints pp on p.SunSign = pp.SignId Where p.Id In (:playerIds)", nativeQuery = true)         
	 List<Player> findByPlayerIds(@Param("playerIds") String[] playerIds);  
	 
	 @Query(value = "SELECT p.*,pp.PlanetId, concat(pp.Aries,',',pp.Tarus,',',pp.Gemini,',',pp.Cancer,',',pp.Leo,',',pp.Virgo,',',pp.Libra,',',pp.Scorpio,',',pp.Sagittarius,',',pp.Capricon,',',pp.Aquarius,',',pp.Pisces)  as signPoints FROM player p left outer join planetpoints pp on p.SunSign = pp.SignId Where TeamId = :teamId", nativeQuery = true)         
	 List<Player> findByPlayersByTeamId(@Param("teamId") String teamId); 

}
