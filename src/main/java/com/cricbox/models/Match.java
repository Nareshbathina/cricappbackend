/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cricbox.models;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "matches")
public class Match {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
    String id;
	@Column(name = "leagueid")
    String leagueId;
	@Column(name = "team1id")
    String team1Id;
	@Column(name = "team2id")
    String team2Id;
	@Column(name = "team1playersinfo")
    String team1PlayersInfo;
	@Column(name = "team2playersinfo")
    String team2PlayersInfo;
	@Column(name = "date")
	String date;
	@Column(name = "venu")
    String venu;
	@Column(name = "moonplace")
    String moonPlace;
	@Column(name = "description")
    String description;
	@Column(name = "result")
    String result;
	@Column(name = "b1")
    String b1;
	@Column(name = "b2")
    String b2;
	@Column(name = "b3")
    String b3;
	@Column(name = "b4")
    String b4;
	
	@Transient
    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public String getTeam1Id() {
        return team1Id;
    }

    public void setTeam1Id(String team1Id) {
        this.team1Id = team1Id;
    }

    public String getTeam2Id() {
        return team2Id;
    }

    public void setTeam2Id(String team2Id) {
        this.team2Id = team2Id;
    }

    public String getTeam1PlayersInfo() {
        return team1PlayersInfo;
    }

    public void setTeam1PlayersInfo(String team1PlayersInfo) {
        this.team1PlayersInfo = team1PlayersInfo;
    }

    public String getTeam2PlayersInfo() {
        return team2PlayersInfo;
    }

    public void setTeam2PlayersInfo(String team2PlayersInfo) {
        this.team2PlayersInfo = team2PlayersInfo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVenu() {
        return venu;
    }

    public void setVenu(String venu) {
        this.venu = venu;
    }

    public String getMoonPlace() {
        return moonPlace;
    }

    public void setMoonPlace(String moonPlace) {
        this.moonPlace = moonPlace;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getB1() {
        return b1;
    }

    public void setB1(String b1) {
        this.b1 = b1;
    }

    public String getB2() {
        return b2;
    }

    public void setB2(String b2) {
        this.b2 = b2;
    }

    public String getB3() {
        return b3;
    }

    public void setB3(String b3) {
        this.b3 = b3;
    }

    public String getB4() {
        return b4;
    }

    public void setB4(String b4) {
        this.b4 = b4;
    }

    public String getStartDate() throws ParseException {
        //2020-01-14 20:00:00.0

        DateFormat outFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS'Z'");
        Date date1 = (Date) new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse(this.getDate());
        return outFormat.format(date1);
    }
    public String getEndDate() throws ParseException {
        //2020-01-14 20:00:00.0

        DateFormat outFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS'Z'");
        Date date1 = (Date) new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse(this.getDate());
        Date newDate = (Date) DateUtils.addHours(date1, 3);
        return outFormat.format(newDate);
    }
}
