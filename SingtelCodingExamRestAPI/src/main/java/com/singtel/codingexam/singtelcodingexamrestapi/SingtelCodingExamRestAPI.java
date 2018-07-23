package com.singtel.codingexam.singtelcodingexamrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.singtel.codingexam.singtelcodingexamrestapi" })
public class SingtelCodingExamRestAPI {
	
	public static void main(String[] args) {
		SpringApplication.run(SingtelCodingExamRestAPI.class, args);
	}

}