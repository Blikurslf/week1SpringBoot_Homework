package com.homework.week1.week1SpringBootHomework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week1SpringBootHomeworkApplication implements CommandLineRunner {

	@Autowired
	 CakeBaker cakeBaker;
	public static void main(String[] args) {
		SpringApplication.run(Week1SpringBootHomeworkApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		cakeBaker.bakeCake();
	}
}
