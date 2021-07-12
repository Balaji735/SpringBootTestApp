package com.example.demo.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

public class MessageRunner implements CommandLineRunner {
  private static Logger log=LoggerFactory.getLogger(MessageRunner.class);
	@Override
	public void run(String... args) throws Exception {
		int a=10;
		log.info("STARTED");
		System.out.println("WELCOME TO SPRING BOOT APP!"+a);
		System.out.println("File Modified");
		log.info("END");
	}

}
