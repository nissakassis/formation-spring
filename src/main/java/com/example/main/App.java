package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AppConfig;
import com.example.services.Guitare;
import com.example.services.IMusicien;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		IMusicien M1 = (IMusicien) context.getBean("guitariste");
		
		System.out.println(M1.jouerGuitare());
		System.out.println(M1.instrument());
		
		System.out.println(M1.jouerGuitare() + M1.instrument());

	}
}
