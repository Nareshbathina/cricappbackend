/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cricbox.models;

import com.cricbox.enums.Zsign;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Horoscope")
public class Horoscope {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    int id;
	@Column(name = "date")
    String date;
	@Column(name = "moonplace")
    int moonPlace;
	@Column(name = "sunplace")
    int sunPlace;
	@Column(name = "jupiterplace")
    int jupiterPlace;
	@Column(name = "venusplace")
    int venusPlace;
	@Column(name = "marsplace")
    int marsPlace;
	@Column(name = "saturnplace")
    int saturnPlace;
	@Column(name = "mercuryplace")
    int mercuryPlace;
	@Column(name = "moontype")
    int moonType;
	@Column(name = "aries")
    String aries;
	@Column(name = "tarus")
    String tarus;
	@Column(name = "gemini")
    String gemini;
	@Column(name = "cancer")
    String cancer;
	@Column(name = "leo")
    String leo;
	@Column(name = "virgo")
    String virgo;
	@Column(name = "libra")
    String libra;
	@Column(name = "scorpio")
    String scorpio;
	@Column(name = "sagittarius")
    String sagittarius;
	@Column(name = "capricorn")
    String capricorn;
	@Column(name = "aquarius")
    String aquarius;
	@Column(name = "pisces")
    String pisces;
	@Column(name = "sourcelink1")
    String sourceLink1;
	@Column(name = "sourcelink2")
    String sourceLink2;
	@Column(name = "sourcelink3")
    String sourceLink3;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

  

    public String getAries() {
        return aries;
    }

    public void setAries(String aries) {
        this.aries = aries;
    }

    public String getTarus() {
        return tarus;
    }

    public void setTarus(String tarus) {
        this.tarus = tarus;
    }

    public String getGemini() {
        return gemini;
    }

    public void setGemini(String gemini) {
        this.gemini = gemini;
    }

    public String getCancer() {
        return cancer;
    }

    public void setCancer(String cancer) {
        this.cancer = cancer;
    }

    public String getLeo() {
        return leo;
    }

    public void setLeo(String leo) {
        this.leo = leo;
    }

    public String getVirgo() {
        return virgo;
    }

    public void setVirgo(String virgo) {
        this.virgo = virgo;
    }

    public String getLibra() {
        return libra;
    }

    public void setLibra(String libra) {
        this.libra = libra;
    }

    public String getScorpio() {
        return scorpio;
    }

    public void setScorpio(String scorpio) {
        this.scorpio = scorpio;
    }

    public String getSagittarius() {
        return sagittarius;
    }

    public void setSagittarius(String sagittarius) {
        this.sagittarius = sagittarius;
    }

    public String getCapricorn() {
        return capricorn;
    }

    public void setCapricorn(String capricorn) {
        this.capricorn = capricorn;
    }

    public String getAquarius() {
        return aquarius;
    }

    public void setAquarius(String aquarius) {
        this.aquarius = aquarius;
    }

    public String getPisces() {
        return pisces;
    }

    public void setPisces(String pisces) {
        this.pisces = pisces;
    }

    public String getSourceLink1() {
        return sourceLink1;
    }

    public void setSourceLink1(String sourceLink1) {
        this.sourceLink1 = sourceLink1;
    }

    public String getSourceLink2() {
        return sourceLink2;
    }

    public void setSourceLink2(String sourceLink2) {
        this.sourceLink2 = sourceLink2;
    }

    public String getSourceLink3() {
        return sourceLink3;
    }

    public void setSourceLink3(String sourceLink3) {
        this.sourceLink3 = sourceLink3;
    }

    public int getMoonPlace() {
        return moonPlace;
    }

    public void setMoonPlace(int moonPlace) {
        this.moonPlace = moonPlace;
    }

    public int getSunPlace() {
        return sunPlace;
    }

    public void setSunPlace(int sunPlace) {
        this.sunPlace = sunPlace;
    }

    public int getJupiterPlace() {
        return jupiterPlace;
    }

    public void setJupiterPlace(int jupiterPlace) {
        this.jupiterPlace = jupiterPlace;
    }

    public int getVenusPlace() {
        return venusPlace;
    }

    public void setVenusPlace(int venusPlace) {
        this.venusPlace = venusPlace;
    }

    public int getMarsPlace() {
        return marsPlace;
    }

    public void setMarsPlace(int marsPlace) {
        this.marsPlace = marsPlace;
    }

    public int getSaturnPlace() {
        return saturnPlace;
    }

    public void setSaturnPlace(int saturnPlace) {
        this.saturnPlace = saturnPlace;
    }

    public int getMercuryPlace() {
        return mercuryPlace;
    }

    public void setMercuryPlace(int mercuryPlace) {
        this.mercuryPlace = mercuryPlace;
    }

    public int getMoonType() {
        return moonType;
    }

    public void setMoonType(int moonType) {
        this.moonType = moonType;
    }
    
     public String getSignName(int id) {
        if (id != -1) {
            Zsign tye = Zsign.getById(id);
            return tye.getDisplay();
        }
        return "";
    }

}
