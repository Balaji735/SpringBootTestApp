package com.example.demo.runner;

import org.springframework.boot.CommandLineRunner;

public class MessageRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		int a=10;
		System.out.println("WELCOME TO SPRING BOOT APP!"+a);
		System.out.println("File Modified");
	}

}
