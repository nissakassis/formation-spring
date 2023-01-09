package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import com.example.services.Guitare;
import com.example.services.Guitariste;
import com.example.services.IMusicien;

@Configuration

@ComponentScan({"com.example.*"})

public class AppConfig {

//	@Bean(name="guitariste")
//	public IMusicien getMusicien( ) {
//		return new Guitariste();
//	}
	
	@Bean(name="guitare")
	public Guitare getInstrumenet() {
		return new Guitare("Electrique");
	}
	
	@Bean(name="guitariste")
	public Guitariste g() {
		return new Guitariste("Amin");
	}
	
}
