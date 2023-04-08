package com.cricbox.daos;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricbox.models.Horoscope;

public interface HoroscopeRepository extends JpaRepository<Horoscope, Integer>{
	public List<Horoscope> findByDate(Date date);
}
