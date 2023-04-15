package com.ms.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import com.ms.configclient.controller.StudentsController;

@SpringBootApplication
@RefreshScope
public class CloudConfigClientApplication implements ApplicationRunner{

	@Autowired
	private StudentsController studentsController;
	
	@Value("${author}")
	private String author;
	
	public static void main(String[] args) {
		SpringApplication.run(CloudConfigClientApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(studentsController.getStudentDetails().getBody());
		System.out.println("Author ** "+author);
	}

}
