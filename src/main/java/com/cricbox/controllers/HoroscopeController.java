package com.cricbox.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cricbox.models.Horoscope;
import com.cricbox.models.PlayerAstro;
import com.cricbox.models.ZsignModel;
import com.cricbox.services.HoroscopeService;


@CrossOrigin("*")
@RestController
public class HoroscopeController {

	 @Autowired
	    private HoroscopeService service;
	     
	    @GetMapping("/getAllHoroscopesByDate")
	    public List<Horoscope> getAllHoroscopesByDate(@RequestParam String date) throws ParseException {
	    	   SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	            java.util.Date date1 = format.parse(date);
	            java.sql.Date d = new java.sql.Date(date1.getTime()); 
	        return service.getHoroscopeByDate(d);
	    }
	    @PostMapping("/saveHoroscope")
	    public void saveHoroscope(@RequestBody Horoscope horoscope) {
	    	service.saveHoroscope(horoscope);
	    }
	    
	    @GetMapping("/getZsignsData")
	    public List<ZsignModel> getZsignsData(@RequestParam int id) throws ParseException {
	    	   
	        return service.getZsignsData(id);
	    }
	    
	    @GetMapping("/getAstroDataForPlayers")
	    public List<PlayerAstro> getAstroDataForPlayers(@RequestParam String matchId) throws ParseException {
	    	   
	        return service.getAstroDataForPlayers(matchId);
	    }
	    
}
